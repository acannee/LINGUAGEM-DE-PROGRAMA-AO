package exercicios300;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		int ano;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Entre com um ano:");
		ano = ler.nextInt();
		
		if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)){// % multiplo de 4 e se o resto dar 0 é verdade 	
		System.out.println("O ano selecionado é bissexto");
		}
		else {
			System.out.println("Esse ano não é bissexto.");
		}
	}
}


