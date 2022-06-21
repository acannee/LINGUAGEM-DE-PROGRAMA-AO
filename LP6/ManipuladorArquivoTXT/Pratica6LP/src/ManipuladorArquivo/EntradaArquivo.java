package ManipuladorArquivo;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class EntradaArquivo {
	//Path dir = Paths.get("C:", "teste");

	
	//Path path = dir.resolve("AulaLP.doc");
	
		public static void main(String[] args) throws IOException  {
		String path="";
	
		
		Scanner ler = new Scanner(System.in);
		int menu;
			do{
				System.out.println("1- Entre com o Arquivo TXT para gravação \n2- Informe o Projeto desejado \n3- Abrir Arquivo do Projeto \n4- Sair do Projeto");
			    menu=ler.nextInt();
			    switch(menu){
			    	case 1:
			        System.out.println("Informe o nome do arquivo: ");
			        path=ler.next();
			        break;
			        
			        case 2:
			       	ManipuladorArquivo.escritor(path);
			       	break;
			       	
			        case 3:
			        ManipuladorArquivo.leitor(path);
			        break;
			                    
			        case 4:
			        break;
			        
			        }
			   }
			
			while(menu!=4);
			
			}
		}