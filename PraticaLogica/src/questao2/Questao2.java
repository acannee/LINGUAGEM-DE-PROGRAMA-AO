package questao2;

import java.util.Scanner;

public class Questao2 {
	
	public static void main (String[]args) {
		
		String placa;
		short ano;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Entre com a placa do carro:");
		placa=ler.nextLine();
		System.out.println("Entre com o ano de fabrica��o:");
		ano=ler.nextShort();
		
		if (ano<=2010)
			System.out.println("Carro Velho");
		else if (ano<=2021)
			System.out.println("Carro Semi Novo");
		else if (ano==2022)
			System.out.println("Carro Novo");
		else
			System.out.println("Ano inv�lido");
		
		String novaPlaca=placa
			.replace("A","*")
			.replace("a","*")
			.replace("E","*")
			.replace("e","*")
			.replace("I","*")
			.replace("i","*")
			.replace("O","*")
			.replace("o","*")
			.replace("U","*")
			.replace("u","*");
		
		System.out.println("A nova placa do carro �:" + novaPlaca);
			
	}
}