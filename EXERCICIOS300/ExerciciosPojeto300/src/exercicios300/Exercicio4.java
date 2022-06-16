package exercicios300;

import java.util.Scanner;

//Crie uma variável inteira contendo um número de segundos e imprima o 
//número equivalente de horas, minutos e segundos.

public class Exercicio4 {

	public static void main(String[] args) {
		int segundos;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite um valor em segundos:");
		segundos = ler.nextInt();
		
		System.out.println("O valor em horas: " + segundos/3600); 
		System.out.println("O valor em minutos: " + segundos/60);
		
		// caso opte pode realizar o código assim:
		//int segundos;
		//Double resto, minutos, segundosCalc;
		//Scanner ler=new Scanner(System.in);
		//System.out.println("Informe o valor em horas:");
		//resto=segundos%3600;
		//minutos=resto%60;
		//segundosCalc=resto%60;
		//System.out.println(segundos/3600 + " : " + minutos + " : " + segundosCalc);
		
	}

}
