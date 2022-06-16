package exercicios300;

import java.util.Scanner;

public class Exercicio8diferente {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int idade;
		System.out.println("Digite a idade:");
		idade = ler.nextInt();
		
		if (idade>0) {
			if (idade<16)
				System.out.println("Não pode votar");
			else if (idade >=16 && idade <= 18 || idade > 65)
				System.out.println("Voto facultativo");
			else 
				System.out.println("Voto obrigatorio");
		
	}

}
}
