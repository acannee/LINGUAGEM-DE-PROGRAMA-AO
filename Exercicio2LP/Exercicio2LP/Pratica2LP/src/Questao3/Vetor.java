package Questao3;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		
		 int vetor[] = new int[10];
	        int auxiliar = 0;

	        for (int i = 0; i<=9 ; i++){
	      //primeiro for fará com que a variavel i percorra o vetor a ser ordenado,mas ela 
	      // ainda vai anda uma casa enquanto a variavel j percorre o vetor todo,
	            System.out.println("Digite o valor da casa "+(i+1));
	            vetor[i] = ler.nextInt();
	        }

	        for (int i=0; i<=9; i++){

	            for (int j=0; j<=9; j++){
	                
	                if (vetor[i] < vetor[j]){
	       // aqui acontece a troca, do  maior para a direita e o menor para esquerda 
	                    auxiliar = vetor [i];
	                    vetor[i] = vetor[j];
	                    vetor[j] = auxiliar;
	                }

	            }
	        }

	        System.out.println();
	        // esse for é para testar a ordenação
	        for (int i = 0; i<=9 ; i++){
	            System.out.println(vetor[i]+" ");

	        }
	        ler.close();

	}

}
