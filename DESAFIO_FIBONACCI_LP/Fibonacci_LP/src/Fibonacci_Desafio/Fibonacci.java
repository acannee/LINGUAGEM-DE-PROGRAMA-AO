package Fibonacci_Desafio;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		
		System.out.print("Informe um número: "); 
		int numero = ler.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			long f = fib(i);
			System.out.println("fibonacci(" + i + ") = " + f);
		}
	}	
		public static long fib(int numero) {
			if (numero <= 2) 
				return 1;
			
			else return fib(numero - 1) + fib(numero - 2);
		}
}
