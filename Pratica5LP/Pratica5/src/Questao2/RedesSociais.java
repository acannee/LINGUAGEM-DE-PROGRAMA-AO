package Questao2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RedesSociais {

	public static void main(String[] args) {
		
		
		String nome, telefone, usuario, email;
		int menu;
		
		ArrayList<String> agenda = new ArrayList();

		do
			
		{
			
			 menu = Integer.parseInt (JOptionPane.showInputDialog("MENU\n1-Cadastrar\n2-Excluir\n3-Pesquisar\n4-Sair"));
		
		switch (menu)
		
		{
		
			case 1:
				
				nome = JOptionPane.showInputDialog("Digite o nome: ");
				telefone = JOptionPane.showInputDialog("Digite o telefone: ");
				usuario = JOptionPane.showInputDialog("Digite o usuario: ");
				email = JOptionPane.showInputDialog("Digite o email: ");
				
				agenda.add(nome+";"+telefone+";"+usuario +";"+email );
				JOptionPane.showMessageDialog(null, "Cadastro inserido com sucesso"); // null é o tipo de janela
				// por exemplo é uma mensagem de dialogo que precisa aceitar 
				break;
				
			case 2:
				
				String excluir = JOptionPane.showInputDialog("Digite uma informação que deseja excluir");
				for (int i=0; i<agenda.size(); i++) 
					{
						if (agenda.get(i).contains(excluir))
							agenda.remove(i);
							JOptionPane.showMessageDialog(null, "Removido com sucesso");
					}
				
				break;
				
				case 3:
					
					String consulta = JOptionPane.showInputDialog("Digite uma informação que deseja pesquisar");
					
						if (agenda.size()==0) {
							JOptionPane.showMessageDialog(null, "Cadastro não encontrado");
						}else {
					
						for (int i=0; i<agenda.size(); i++)
							{
								if (agenda.get(i).contains(consulta))
									JOptionPane.showMessageDialog(null, agenda.get(i));
								else if (i==agenda.size()-1) {
									JOptionPane.showMessageDialog(null, "Usuário não encontrado");
								}
							}
						}
						break;
				case 4:
					JOptionPane.showMessageDialog(null, "Saindo");
					break;
					
					
					}
	}
		while (menu!=4);
}
}
		
