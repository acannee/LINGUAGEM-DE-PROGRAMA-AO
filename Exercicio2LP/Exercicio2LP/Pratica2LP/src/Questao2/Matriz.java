package Questao2;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		  Scanner ler = new Scanner(System.in);
		  int matriz[][]= new int[50][50];
	        int impares = 1;

	        for (int i = 0;i <= 49; i++){
	            for(int p = 0; p <= 49; p++){
	                matriz[i][p] = impares;
	                impares += 2;
	            }
	        }
	        for (int i = 0;i <= 49; i++){
	            for(int j = 0; j <= 49; j++){
	                if (i == j)
	                System.out.print(matriz[i][j]+ " ");
	            }
	        }


	    }
	}