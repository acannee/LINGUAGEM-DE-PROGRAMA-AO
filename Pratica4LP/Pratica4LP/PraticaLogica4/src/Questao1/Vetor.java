package Questao1;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		int [] notas = new int[10];
		int soma = 0, aux;
	
		
		Scanner ler = new Scanner (System.in);
		
		//* ler a nota
		for (int i=0 ; i < 10 ; i ++) {
			System.out.println("Digite a nota posi��o n�"+(i+1));
			notas [i] = ler.nextInt();
			soma = soma + notas [i];
		}
		//* realizar a ordena��o, realizando dois loops
		//* compara de dois em dois n vezes (o ultimo n�o tem vizinho da posi��o)
		for(int i=0 ; i < 0 ; i ++) {
			for(int j=0 ; i < 9 ; j ++) {
				if (notas [j] > notas [j + 1]) {
					aux = notas [j];
					notas[j] = notas [j + 1];
					notas[j + 1] = aux;
		}
			}
		}
		
		System.out.println("A m�dia �:" + soma/10);
		System.out.println("A maior nota �:" + notas [9]);
		System.out.println("A 2� maior nota �:" + notas [8]);
		System.out.println("A 3� maior nota �:" + notas [7]);
		System.out.println("A menor nota �:" + notas [0]);
		
				}

	}

