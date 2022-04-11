package Questao4;

import java.util.Random;
import java.util.Scanner;

public class Poltrona {

public static void main(String[] args) {
			
	Scanner ler = new Scanner(System.in);
	Random aleatorio = new Random();
			
	short opcao=0;
			
	Integer poltrona[] = new Integer[100];

	for(int i=0; i<=99; i++){
	poltrona[i] = 0;
	}	
	while (true) {
	System.out.println("----------Menu-----------");
	System.out.println(" 1 - Cadastrar Passageiro");
	System.out.println(" 2 - Check in");
	System.out.println(" 3 - Cancelar Voo");
	System.out.println(" 4 - Sair");
			
			
	opcao=ler.nextShort();
			
	switch (opcao) {
			
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
				
		numeroaleatorio=aleatorio.nextInt(1000);
		System.out.println("Seu numero do voo é:" + numeroaleatorio);
			
		break;
			
		case 2:
				
		System.out.println("Digite seu CPF: ");
				    		CPF=ler.next();
				    		
		System.out.println("Digite o numero do seu voo: ");
		int numeroVoo=ler.nextInt();
				    		
		System.out.println("Escolha sua poltrona");
		int poltronaEscolhida=ler.nextInt();
	    		
	 while (true) {
         if (poltrona[poltronaEscolhida - 1] == 0) {
         poltrona[poltronaEscolhida-1] = numeroVoo;
         break;
           } 
         else {
         System.out.println("A poltrona já está ocupada, escolha outra: ");
         poltronaEscolhida = ler.nextInt();
           }
                
       }
	    	
         System.out.println("Check in realizado com sucesso!");
         break;	
	    		
		case 3:
				
		System.out.println("Digite seu CPF: ");
	    CPF=ler.next();
	    		
	    System.out.println("Digite o numero do seu voo: ");
	    numeroVoo=ler.nextInt();
	    System.out.println("Digite o número da sua poltrona: ");
        poltronaEscolhida = ler.nextInt();

        if (poltrona[poltronaEscolhida-1] == numeroVoo) {
        poltrona[poltronaEscolhida - 1] = null;
        System.out.println("Voo Cancelado com sucesso!");
         } 
        else {
        System.out.println("Está não é sua poltrona, refaça a operação");
         }
                
        break;
		case 4:
        System.out.println("Até logo!");
        if (opcao == 4){
        return;
        }
        break;
			default:
        System.out.println("Opção inexistente.");
        break;
         }
     }
 }
}
