package Questao1;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		int [] notas = new int[10];
		int soma = 0, aux;
	
		
		Scanner ler = new Scanner (System.in);
		
		//* ler a nota
		for (int i=0 ; i < 10 ; i ++) {
			System.out.println("Digite a nota posição nº"+(i+1));
			notas [i] = ler.nextInt();
			soma = soma + notas [i];
		}
		//* realizar a ordenação, realizando dois loops
		//* compara de dois em dois n vezes (o ultimo não tem vizinho da posição)
		for(int i=0 ; i < 0 ; i ++) {
			for(int j=0 ; i < 9 ; j ++) {
				if (notas [j] > notas [j + 1]) {
					aux = notas [j];
					notas[j] = notas [j + 1];
					notas[j + 1] = aux;
		}
			}
		}
		
		System.out.println("A média é:" + soma/10);
		System.out.println("A maior nota é:" + notas [9]);
		System.out.println("A 2º maior nota é:" + notas [8]);
		System.out.println("A 3º maior nota é:" + notas [7]);
		System.out.println("A menor nota é:" + notas [0]);
		
				}

	}

