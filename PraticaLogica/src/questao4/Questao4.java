package questao4;

import java.util.Random;
import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Random aleatorio = new Random();
		
		short menu=0;
	
		System.out.println("----------Menu-----------");
		System.out.println(" 1 - Cadastrar Passageiro");
		System.out.println(" 2 - Check in");
		System.out.println(" 3 - Cancelar Voo");
		System.out.println(" 4 - Sair");
		
		
		menu=ler.nextShort();
		
		switch (menu) {
		
		case 1:
			
			System.out.println("Entre com nome do passageiro:");
			String nome=ler.next();
			
			System.out.println("Entre com CPF:");
			String CPF=ler.next();
			
			System.out.println("Entre com a data do voo:");
			String dataVoo=ler.next();
			
			System.out.println("Entre com horario do voo:");
			String horarioVoo=ler.next();
			
			System.out.println("Cadastro efetuado com sucesso!");
			
			numaleatorio=aleatorio.nextInt(1000);
			System.out.println("Seu numero do voo é:" + numaleatorio);
		
		break;
		
		case 2:
			
			System.out.println("Digite seu CPF: ");
    		CPF=ler.next();
    		
    		System.out.println("Digite o numero do seu voo: ");
    		int numeroVoo=ler.nextInt();
    		
    		System.out.println("Check in realizado com sucesso!");
    		
    		break;
    		
		case 3:
			
			System.out.println("Digite seu CPF: ");
    		CPF=ler.next();
    		
    		System.out.println("Digite o numero do seu voo: ");
    		numeroVoo=ler.nextInt();
    		
    		System.out.println("Voo Cancelado com sucesso!");
    		
    		break;
		
			default:
				
			System.out.println("Opçao Invalida");
			
			break;
		
		

		}
	}

}
