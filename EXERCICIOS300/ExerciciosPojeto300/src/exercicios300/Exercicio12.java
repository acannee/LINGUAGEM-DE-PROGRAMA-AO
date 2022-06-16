package exercicios300;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		int nota=0;
		
		Scanner ler = new Scanner (System.in);
		
		while (nota!=-1) {
		
		System.out.println("Digite uma nota");
			nota = ler.nextInt();
			
			switch (nota) 
			
			{
			
			case 1:
				System.out.println("nota péssima");
				break;
			
			case 2:
				System.out.println("nota ruim");
				break;
			
			case 3:
				System.out.println("nota regular");
				break;
			
			case 4:
				System.out.println("nota boa");
				break;
			
			case 5:
				System.out.println("nota ótima");
				break;
			
			case -1:
				break;
				
			default:
				System.out.println("Nota inválida");
			}
		
			
			
			

		}
		
	}
	}
