package Questao2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CalculadoraBovina extends JFrame {

	private JPanel contentPane;
	private JTextField textArroba;
	private JTextField textqtdeArrobas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraBovina frame = new CalculadoraBovina();
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
	public CalculadoraBovina() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora BOVINA");
		lblNewLabel.setBounds(60, 11, 174, 23);
		contentPane.add(lblNewLabel);
		
		JButton botaoTotal = new JButton("Calcular Total a Pagar");
		botaoTotal.setBackground(Color.GREEN);
		botaoTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valorArroba = txtvalorArroba.getText();
				String qtdeArrobas = txtqtdeArrobas.getText();
				
				float valorArrbs=Float.parseFloat(valorArroba);
				int quantidadeArrobas=Integer.parseInt(qtdeArrobas);
				float botaoTotal= valorArrbs*quantidadeArrobas;
				JOptionPane.showMessageDialog(botaoTotal, "O valor a pagar é: R$"+ botaoTotal);
			}
			
		});
		botaoTotal.setBounds(108, 174, 155, 23);
		contentPane.add(botaoTotal);
		
		JLabel valorArroba = new JLabel("Valor da Arroba");
		valorArroba.setBounds(10, 68, 79, 14);
		contentPane.add(valorArroba);
		
		JLabel qtdeArrobas = new JLabel("Quantidade de Arrobas");
		qtdeArrobas.setBounds(10, 114, 120, 14);
		contentPane.add(qtdeArrobas);
		
		textArroba = new JTextField();
		textArroba.setBounds(154, 65, 182, 20);
		contentPane.add(textArroba);
		textArroba.setColumns(10);
		
		textqtdeArrobas = new JTextField();
		textqtdeArrobas.setBounds(154, 111, 182, 20);
		contentPane.add(textqtdeArrobas);
		textqtdeArrobas.setColumns(10);
		
		
	}
}
