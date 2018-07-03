package br.com.jogo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import br.com.jogo.chat.Client;
import br.com.jogo.componentes.Tanque;
import br.com.jogo.config.Cores;
import br.com.jogo.config.Jogo;
import br.com.jogo.config.Niveis;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

/**
 * @author Ana Beatriz Araujo 1 de jul de 2018
 */
public class Principal {

	private JFrame frame;
	private JTextField textNome;
	static Principal window;

	/**
	 * Launch the application.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Client app = new Client();
		app.conectar();
		app.escutar();
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 479, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Game Tanque");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(149, 11, 178, 69);
		frame.getContentPane().add(lblNewLabel);

		textNome = new JTextField();
		textNome.setBounds(149, 116, 178, 20);
		frame.getContentPane().add(textNome);
		textNome.setColumns(10);

		JLabel lblDigiteSeuNome = new JLabel("Digite Seu Nome:");
		lblDigiteSeuNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDigiteSeuNome.setForeground(new Color(255, 255, 255));
		lblDigiteSeuNome.setBounds(149, 91, 178, 14);
		frame.getContentPane().add(lblDigiteSeuNome);

		JLabel lblNvel = new JLabel("N\u00EDvel:");
		lblNvel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNvel.setForeground(new Color(255, 255, 255));
		lblNvel.setBounds(149, 147, 46, 14);
		frame.getContentPane().add(lblNvel);

		JComboBox comboNivel = new JComboBox();
		comboNivel.addItem("");
		for (Niveis nivel : Niveis.values()) {
			comboNivel.addItem(nivel);
		}
		comboNivel.setBounds(149, 172, 178, 20);
		frame.getContentPane().add(comboNivel);

		JComboBox comboCor = new JComboBox();
		comboCor.addItem("");
		comboCor.setBounds(149, 229, 178, 20);
		for (Cores cor : Cores.values()) {
			comboCor.addItem(cor);
		}
		frame.getContentPane().add(comboCor);

		JButton btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (comboCor.getSelectedItem().equals("") || comboNivel.getSelectedItem().equals("")) {
                    JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios.");

				} else {
					Jogador jogador = new Jogador();
					jogador.setNome(textNome.getText());

					Jogo jogo = new Jogo();
					jogo.setJogador(jogador);
					jogo.setNivel((Niveis) comboNivel.getSelectedItem());

					frame.setVisible(false); // you can't see me!
					frame.dispose(); // Destroy the JFrame object

					Tanque tanque = new Tanque(100, 200, 0, getCor(comboCor.getSelectedItem().toString()));
					tanque.setEstaAtivo(true);

					Arena arena = new Arena(600, 400);
					arena.adicionaTanque(tanque);
					arena.setConfig(arena, jogo);
					arena.setArena(arena);

				}
			}
		});
		btnStart.setForeground(new Color(255, 255, 255));
		btnStart.setBackground(new Color(255, 215, 0));
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnStart.setBounds(176, 275, 127, 38);
		frame.getContentPane().add(btnStart);

		JLabel lblNewLabel_1 = new JLabel("Cor do Tanque:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(149, 207, 178, 14);
		frame.getContentPane().add(lblNewLabel_1);

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
}
