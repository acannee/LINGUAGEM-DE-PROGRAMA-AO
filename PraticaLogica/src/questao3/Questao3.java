package questao3;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Escreva uma frase: ");
		String frase=ler.nextLine();
		
		int vogais = 0;
		
		
        for(int i = 0; i<frase.length();i++) {
        	
        char letra = frase.charAt(i);
        	
        frase.toLowerCase();
        	
		if (letra == 'a' || letra == 'e' || letra  == 'i' ||letra == 'o' || letra == 'u') {
			vogais ++;
        	}

        }
        
        System.out.println("No texto contém: "+ vogais + " vogais");
	}
}
