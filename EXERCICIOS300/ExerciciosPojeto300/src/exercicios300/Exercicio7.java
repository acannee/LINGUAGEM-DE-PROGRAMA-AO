package exercicios300;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int lado1, lado2, lado3;
		
		System.out.println("Insira o valor do primeiro lado:");
		lado1 = ler.nextInt();
		System.out.println("Insira o valor do segundo lado:");
		lado2 = ler.nextInt();
		System.out.println("Insira o valor do terceiro lado:");
		lado3 = ler.nextInt();
		
		if (lado1 < (lado2+lado3) && lado2 < (lado1+lado3) && lado3 < (lado1+lado2)) {
			if (lado1==lado2 && lado2==lado3)
			System.out.println("O tri�ngulo � equilatero");
			else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
			System.out.println("O tri�ngulo � is�sceles");
			else 
			System.out.println("O tri�ngulo � escaleno");
		}
		else 
			System.out.println("Os valores digitados n�o correspondem ao lado de um tri�ngulo");
	}

	
	}


