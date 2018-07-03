package br.com.jogo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

import br.com.jogo.componentes.Morto;
import br.com.jogo.componentes.Tiro;
import br.com.jogo.componentes.Tanque;
import br.com.jogo.config.Cores;
import br.com.jogo.config.Jogo;

/**
 * @author Ana Beatriz Araujo 1 de jul de 2018
 */

@SuppressWarnings("serial")
public class Arena extends JComponent implements KeyListener, MouseListener, ActionListener {
	private int largura, altura;
	private HashSet<Tanque> tanques;
	private Timer contador;
	private Arena arena;
	private List<Tiro> tiros;
	private List<Morto> mortos;


	public Arena(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
		tanques = new HashSet<Tanque>();
		tiros = new ArrayList<Tiro>();
		mortos = new ArrayList<Morto>();
		addMouseListener(this);
//		contador = new Timer(50, this);
//		contador.start();
	}

	public void adicionaTanque(Tanque t) {
		tanques.add(t);
	}

	public Dimension getMaximumSize() {
		return getPreferredSize();
	}

	public Dimension getMinimumSize() {
		return getPreferredSize();
	}

	public Dimension getPreferredSize() {
		return new Dimension(largura, altura);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(new Color(245, 245, 255));
		g2d.fillRect(0, 0, largura, altura);
		g2d.setColor(new Color(220, 220, 220));
		for (int _largura = 0; _largura <= largura; _largura += 20)
			g2d.drawLine(_largura, 0, _largura, altura);
		for (int _altura = 0; _altura <= altura; _altura += 20)
			g2d.drawLine(0, _altura, largura, _altura);
		// Desenhamos todos os tanques
		for (Tanque t : tanques)
			t.draw(g2d);
		for (Tiro tiro : tiros)
			tiro.draw(g2d);
	}

	public void mouseClicked(MouseEvent e) {
		for (Tanque t : tanques)
			t.setEstaAtivo(false);
		for (Tanque t : tanques) {
			boolean clicado = t.getRectEnvolvente().contains(e.getX(), e.getY());
			if (clicado) {
				t.setEstaAtivo(true);
				switch (e.getButton()) {
				case MouseEvent.BUTTON1:
					t.girarAntiHorario(25);
					break;
				case MouseEvent.BUTTON2:
					t.aumentarVelocidade();
					break;
				case MouseEvent.BUTTON3:
					t.girarHorario(25);
					break;
				}
				break;
			}
		}
		repaint();
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void actionPerformed(ActionEvent e) {
		for (Tanque t : tanques)
			t.mover();
		colisao();
		
		for (Tiro tiro : tiros)
			tiro.mover();
		
		repaint();
	}
	
	public void atirar(Tanque tiro) {
		tiros.add(new Tiro(tiro.getX(), tiro.getY(), tiro.getAngulo(), tiro.getCor()));
	}
	
	public void colisao() {
		for (Tiro tiro : tiros) {
			for (Tanque t : tanques) {
				double distancia = Math.sqrt(Math.pow(tiro.getX() - t.getX(), 2)+ Math.pow(tiro.getY() - t.getY(), 2));
				if ((distancia <= 30) && (t.getEstaAtivo() == false)) {
					morrer(t);
//					musicTiro();
					tanques.remove(t);
					break;
				}
			}
		}
	}
	
	public void morrer(Tanque morre) {
		mortos.add(new Morto(morre.getX(), morre.getY(), morre.getAngulo(), morre.getCor()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		for (Tanque t : tanques) {

			if (t.getEstaAtivo()) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					t.girarAntiHorario(10);
					break;
				case KeyEvent.VK_RIGHT:
					t.girarHorario(10);
					break;
				case KeyEvent.VK_UP:
					t.aumentarVelocidade();
					break;
				case KeyEvent.VK_DOWN:
					break;
				case KeyEvent.VK_SPACE:
					 atirar(t);
					break;
				}
			}
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(KeyEvent arg0) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(KeyEvent arg0) {

	}

	public static void main(String args[]) {
		Arena arena = new Arena(600, 400);
		arena.adicionaTanque(new Tanque(100, 200, 0, Color.BLUE));
		arena.adicionaTanque(new Tanque(200, 200, 45, Color.RED));
		arena.adicionaTanque(new Tanque(470, 360, 90, Color.GREEN));
		arena.adicionaTanque(new Tanque(450, 50, 157, Color.YELLOW));
		JFrame janela = new JFrame("Tanques");
		janela.getContentPane().add(arena);
		janela.addKeyListener(arena);
		janela.pack();
		janela.setVisible(true);
		janela.setDefaultCloseOperation(3);
	}

	/**
	 * Método que seta a configuração inicial do jogo
	 * 
	 * @param arena
	 * @param jogo
	 */
	public void setConfig(Arena arena, Jogo jogo) {

		// Configura o Nivel
		switch (jogo.getNivel().toString()) {
		case "FACIL":
			setConfigFacil(arena, jogo);
			break;
		case "MEDIO":
			setConfigMedio(arena, jogo);
			break;
		case "DIFICIL":
			setConfigDificil(arena, jogo);
			break;
		default:
			break;
		}

		JFrame janela = new JFrame("Tanques");
		janela.getContentPane().add(arena.getArena());
		janela.addKeyListener(arena.getArena());
		janela.pack();
		janela.setVisible(true);
		janela.setDefaultCloseOperation(3);
	}

	/**
	 * Configuração para NÍVEL=> FACIL
	 * 
	 * - Apenas um Tanque inimigo
	 */
	public static void setConfigFacil(Arena arena, Jogo jogo) {
		
		for (int i = 0; i < 1; i++) {
			for (Cores cor : Cores.values()) {
				if (jogo.getCorTanque() != cor) {
					System.out.println("aa");
					arena.adicionaTanque(new Tanque(450, 50, 157, getCor(cor.toString())));
					arena.contador = new Timer(120, arena);
					arena.contador.start();
					break;
				}
			}
		}
		arena.setArena(arena);
	}

	public static void setConfigMedio(Arena arena, Jogo jogo) {
		for (int i = 0; i < 3; i++) {
			for (Cores cor : Cores.values()) {
				if (jogo.getCorTanque() != cor) {
					System.out.println("aa");
					arena.adicionaTanque(new Tanque(100, 200, 0, Color.BLUE));
					arena.adicionaTanque(new Tanque(200, 200, 45, Color.RED));
					arena.adicionaTanque(new Tanque(470, 360, 90, Color.GREEN));
//					arena.adicionaTanque(new Tanque(450, 50, 157, Color.YELLOW));
					arena.contador = new Timer(80, arena);
					arena.contador.start();
					break;
				}
			}
		}
		arena.setArena(arena);

	}

	public static void setConfigDificil(Arena arena, Jogo jogo) {
		for (int i = 0; i < 8; i++) {
			for (Cores cor : Cores.values()) {
				if (jogo.getCorTanque() != cor) {
					System.out.println("aa");
					arena.adicionaTanque(new Tanque(400,50,180,Color.BLUE));
					arena.adicionaTanque(new Tanque(400,200,0,Color.RED));
					arena.adicionaTanque(new Tanque(400,300,270,Color.GREEN));
					arena.adicionaTanque(new Tanque(200,50,90,Color.YELLOW));
					arena.adicionaTanque(new Tanque(100,120,270,Color.GRAY));
					arena.adicionaTanque(new Tanque(180,307,180,Color.WHITE));
					arena.adicionaTanque(new Tanque(520,208,23,Color.CYAN));
					arena.adicionaTanque(new Tanque(300,300,47,Color.ORANGE));
					arena.contador = new Timer(60, arena);
					arena.contador.start();
					break;
				}
			}
		}
		arena.setArena(arena);

	}



	public static Color getCor(String corSelecionada) {
		Color cor = null;
		switch (corSelecionada) {
		case "AZUL":
			return cor.BLUE;
		case "VERMELHO":
			return cor.RED;
		case "VERDE":
			return cor.GREEN;
		case "AMARELO":
			return cor.YELLOW;
		default:
			return cor.GRAY;
		}
	}

	/**
	 * @return the arena
	 */
	public Arena getArena() {
		return arena;
	}

	/**
	 * @param arena
	 *            the arena to set
	 */
	public void setArena(Arena arena) {
		this.arena = arena;
	}

}