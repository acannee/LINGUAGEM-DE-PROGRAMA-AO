package Questao2;

public class Matriz {

	public static void main(String[] args) {
		
		int[][] matriz = new int[2][2]; // inicializa a matriz com zeros
		//loop para preencher e mostrar a diagonal
		
		//Ler o conteúdo das duas matrizes 2x2, deve ser valores inteiros. 
		int impar=1;
		for(int linhas=0;linhas<2;linhas++){
			for(int cols=0;cols<2;cols++){
				matriz[linhas][cols]=impar;		
				if (linhas==cols)
					System.out.printf("%d\t",matriz[linhas][cols]);
				else
					System.out.printf("0\t");
				impar+=2;
			}

			System.out.printf("\n");
			}

	}
}


