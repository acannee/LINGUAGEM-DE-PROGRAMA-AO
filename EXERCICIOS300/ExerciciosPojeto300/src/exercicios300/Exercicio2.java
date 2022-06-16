package exercicios300;

//Crie uma variável inteira com um valor entre 
//1 e 12 e imprima o nome do mês correspondente ao valor da variável.

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		String [] meses = new String [12];	
		int mes;
		meses [0] = "janeiro";
		meses [1] = "fevereiro";
		meses [2] = "março";
		meses [3] = "abril";
		meses [4] = "maio";
		meses [5] = "junho";
		meses [6] = "julho";
		meses [7] = "agosto";
		meses [8] = "setembro";
		meses [9] = "outubro";
		meses [10] = "novembro";
		meses [11] = "dezembro";
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite o numero correspondente ao mês: ");
		mes = ler.nextInt(); // Int é devido a variavel mes ser inteiro 
		System.out.println("O mês é: " + meses [mes-1]);
		//como o vetor começa sempre com zero,pra dar o mês de janeiro por exemplo precisa colocar o menos 1
		
		
			
				
	}

}