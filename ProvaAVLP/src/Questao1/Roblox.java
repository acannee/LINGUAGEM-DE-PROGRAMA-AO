package Questao1;

import java.util.Scanner;

public class Roblox {

	public static void main(String[] args) {

		try (Scanner ler = new Scanner (System.in)) {
			String [] cor = new String[10];
			String chave;
			int azul=0;
			int vermelho=0;
			int verde=0;
			
			for (int i=0;i< cor.length;i++){  /// length retorna o tamanho do vetor 
			    System.out.println("Digite uma chave para entrada de uma porta: ");
			    chave= ler.nextLine();
			    chave=chave.toUpperCase();
			    cor[i]=chave;
			
			    if(chave.equals("AZUL")){
			        azul+=1;
			        System.out.println("Ir para a porta Azul");
			

			    } else if (chave.equals("VERMELHA")||chave.equals("VERMELHO")) {
			        vermelho+=1;
			        System.out.println("Ir para a porta Vermelha");
   

			    } else if (chave.equals("VERDE")) {
			        verde+=1;
			        System.out.println("Ir para a porta Verde");
			       

			    }else{
			        System.out.println("Procure novamente");
			        
			    }
			}
			System.out.println("Quantidade de pessoas com a chave azul: "+ azul);
			System.out.println("Quantidade de pessoas com a chave vermelha: "+ vermelho);
			System.out.println("Quantidade de pessoas com a chave verde: "+ verde);
		}
     
	
	}

}
