import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Questao1 {

	private JFrame frame;
	private JTextField textNome;
	private JTextField textCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao1 window = new Questao1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Questao1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 346, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CPF");
		lblNewLabel.setBounds(30, 128, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textNome = new JTextField();
		textNome.setBounds(103, 81, 125, 20);
		frame.getContentPane().add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(30, 84, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textCPF = new JTextField();
		textCPF.setText("_______-__");
		textCPF.setBounds(103, 125, 125, 20);
		frame.getContentPane().add(textCPF);
		textCPF.setColumns(10);
		
		JButton btnNewButton = new JButton("Conferi CPF");
		btnNewButton.setBounds(103, 177, 125, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
