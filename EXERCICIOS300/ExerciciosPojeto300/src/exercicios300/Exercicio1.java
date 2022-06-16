package exercicios300;
//Crie um novo programa que armazene um vetor float com as notas de 
//10 estudantes e imprima a média dessas notas.

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		float[] notas = new float[10];
		float soma = 0;
		Scanner ler = new Scanner (System.in);
		for(int i=0 ; i<10 ; i++)
		{
		
			System.out.println("Digite a nota:" + (i+1)); // dentro dos aspas é uma string, após o mais vai somar
															// somar uma sequência do digite a nota, exemplo nota 1 nota 2 etc
			notas[i] = ler.nextFloat();
			//formula soma pode ser também soma += notas [i];
			soma = soma + notas [i]; // Soma começa valer zero, sendo preciso  dar o valor da nota e soma mais 0
									// após somar com mais 0 vai resultar o x valor, por exemplo 
									// soma = 0 + 50 = 50, após somar vai resultar em valor de soma 50
									// após dar a próxima nota, você soma o 50 valor anterior, mais o atual
		}
		float media = soma / 10; 
		System.out.printf("O valor da média é %.2f", media); // Caso opte pode realizar media no System.out.printf ex.: 
															// ex.: , media/10;
			
				
	}

}
