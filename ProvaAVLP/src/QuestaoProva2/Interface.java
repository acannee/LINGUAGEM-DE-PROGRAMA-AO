package QuestaoProva2;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Interface extends JFrame {

	protected static final AbstractButton Texto2 = null;
	protected static final AbstractButton Texto1 = null;
	protected static final AbstractButton Texto3 = null;
	private JPanel Painel;
	private JTextField Caixa1;
	private JTextField Caixa2;
	private JTextField Caixa3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
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
	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 300);
		Painel = new JPanel();
		Painel.setForeground(SystemColor.textHighlight);
		Painel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Painel);
		Painel.setLayout(null);
		
		
		
		JLabel Texto2 = new JLabel("Qtde de Seletores  Classes");
		Texto2.setBounds(10, 80, 138, 14);
		Painel.add(Texto2);
		
		JLabel Texto1 = new JLabel("Qtde de Seletores IDs");
		Texto1.setBounds(10, 40, 138, 14);
		Painel.add(Texto1);
		
		JLabel Texto3 = new JLabel("Qtde de Seletores Tags ");
		Texto3.setBounds(10, 120, 138, 14);
		Painel.add(Texto3);
		
		Caixa1 = new JTextField();
		Caixa1.setBounds(180, 37, 145, 20);
		Painel.add(Caixa1);
		Caixa1.setColumns(10);
		
		Caixa2 = new JTextField();
		Caixa2.setBounds(180, 77, 145, 20);
		Painel.add(Caixa2);
		Caixa2.setColumns(10);
		
		Caixa3 = new JTextField();
		Caixa3.setBounds(180, 117, 145, 20);
		Painel.add(Caixa3);
		Caixa3.setColumns(10);
		
		JButton Calcular = new JButton("Calcular");
		Calcular.setForeground(UIManager.getColor("Button.background"));
		Calcular.setBackground(new Color(0, 0, 204));
		Calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int caixa1 = Integer.parseInt(Caixa1.getText());
				int caixa2 = Integer.parseInt(Caixa2.getText());
				int caixa3 = Integer.parseInt(Caixa3.getText());
				int soma =  caixa1 + caixa2 + caixa3;
	
				JOptionPane.showMessageDialog (null, " total " + soma +  " Caixa1 = " + caixa1*100 + " Caixa2 = " + caixa2*10 + " Caixa3 = " + caixa3);
				
				}
			
		});
		Calcular.setBounds(156, 194, 115, 40);
		Painel.add(Calcular);
	}
}
