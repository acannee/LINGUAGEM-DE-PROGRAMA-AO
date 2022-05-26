package Questão6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class questao6atu extends JFrame {

	private JPanel contentPane;
	private JTextField caixa1;
	private JTextField caixa2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					questao6atu frame = new questao6atu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public questao6atu() {
		setTitle("C\u00E1lculo da conta de Luz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel text1 = new JLabel("Sal\u00E1rio M\u00EDnimo");
		text1.setBounds(10, 29, 93, 14);
		contentPane.add(text1);
		
		JLabel text2 = new JLabel("Quantidade de Consumo (kw)");
		text2.setBounds(10, 71, 156, 14);
		contentPane.add(text2);
		
		caixa1 = new JTextField();
		caixa1.setBounds(203, 26, 156, 20);
		contentPane.add(caixa1);
		caixa1.setColumns(10);
		
		caixa2 = new JTextField();
		caixa2.setBounds(203, 68, 156, 20);
		contentPane.add(caixa2);
		caixa2.setColumns(10);
		
		JRadioButton opcao1 = new JRadioButton("Residencial");
		opcao1.setBounds(28, 111, 109, 23);
		contentPane.add(opcao1);
		
		JRadioButton opcao2 = new JRadioButton("Comercial");
		opcao2.setBounds(217, 111, 109, 23);
		contentPane.add(opcao2);
		
		JButton botao = new JButton("Calcular");
		botao.setBounds(100, 156, 89, 23);
		contentPane.add(botao);
	}

}
