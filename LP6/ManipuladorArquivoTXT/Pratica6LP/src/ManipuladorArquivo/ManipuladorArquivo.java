package ManipuladorArquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ManipuladorArquivo {

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);

			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
	}

	public static void escritor(String path) throws IOException {
		BufferedWriter escrever = new BufferedWriter(new FileWriter(path));
		String linha = "";
		String nome, arquivo, caminho, titulo, objetivo, endereco, dataInicio, status;
        ArrayList<String> ProjetoSocial = new ArrayList();
		Scanner ler = new Scanner(System.in);			
		System.out.println("\n Entre com o titulo: ");
        titulo=ler.next();
        System.out.println("\n Qual o objetivo: ");
        objetivo=ler.next();
        System.out.println("\n Qual o endereço: ");
        endereco=ler.next();
        System.out.println("\n Data de inicio: ");
        dataInicio=ler.next();
        System.out.println("\n Status do projeto: ");
        status=ler.next();
        ProjetoSocial.add("Titulo do projeto: "+titulo+" \nObjetivo: "+objetivo+" \nEndereço: "+endereco+" \nData de Inicio: "+dataInicio+"\nStatus"+status);
        escrever.append(Arrays.toString( ProjetoSocial.toArray()));
        escrever.close();
        System.out.println("Criado com sucesso");
		
	}
}
		
		
		
