package Questao3;

import java.util.Scanner;
import java.util.Random;

public class Texto {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
        String avtexto,referencia = "aeiouAEIOU",referenciaFrase=".!?";
        int menu =0,vogal = 0, consoante = 0,frase=0;
        
        System.out.println("Entre com uma frase: ");
        avtexto= ler.nextLine();
        
        String[] palavras = avtexto.split("\\s+"); /// 
        
        
        for (int i = 0; i < avtexto.length(); i++) {
            if ((avtexto.charAt(i) >= 'A' && avtexto.charAt(i) <= 'Z') || (avtexto.charAt(i) >= 'a' && avtexto.charAt(i) <= 'z')) {
                if (referencia.indexOf(avtexto.charAt(i)) != -1) {
                    vogal++;
                }
                else
                    consoante++;
            }
            if ((avtexto.charAt(i) == '!') || (avtexto.charAt(i) == '.')|| (avtexto.charAt(i) == '?'))
                frase++;
        }
		while (menu != 5) {
		System.out.println("--------------MENU---------------");
		System.out.println("1 - Número de Frases");
		System.out.println("2 - Número de Palavras");
		System.out.println("3 - Número de Vogais");
		System.out.println("4 - Número de Consoantes");
		System.out.println("5 - Sair - O programa será encerrado");	
		System.out.println("----------------------------------");
		menu = ler.nextInt();
        switch (menu) {
        case 1:
            System.out.println(" O número de Frases ");
            System.out.println(" "+frase+" ");

            break;
        case 2:
            System.out.println(" O número de Palavras ");
            System.out.println(" "+palavras.length+" ");
            break;
        case 3:
            System.out.println(" O número de Vogais ");
            System.out.println(" "+vogal+" ");

            break;
        case 4:
            System.out.println(" O número de Consoantes ");
            System.out.println(" "+consoante+" ");
            break;
        case 5:
            System.out.println("Programa Encerrado!");
            break;
        default:
            System.out.println("Inválido!!!");
            break;
    }
}
        	
	}
	}

