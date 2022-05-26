package Questao4;

import java.util.Scanner;

public class Eleicao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int media=0, idade, menor=0, calculo=0;
	    double resultado=0;
	    
	    for(int i=0; i<10;i++) {
	    System.out.println("\nEntre com idade do eleitor");
	    idade=ler.nextInt();
	        
	
			if (idade>0) {
				if (idade<16) {
					System.out.println("Não pode votar");
				menor++;
				calculo+=idade;
				}
				else if (idade >=16 && idade <= 18 || idade > 65) {
					System.out.println("Voto facultativo");
				menor++;
				calculo+=idade;
				}
				else {
					System.out.println("Voto obrigatorio");
				menor++;
				calculo+=idade;   
			}
			media=calculo/10;
			resultado= menor/10;
			}

			System.out.println("A media das idades é: "+media);
			System.out.printf("A media é %.2f",resultado);

			}
	}
	}
		
		
	        	


