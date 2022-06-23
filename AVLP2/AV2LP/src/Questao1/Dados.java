package Questao1;

import java.util.ArrayList;
import java.util.Scanner;


public class Dados {

	public static void main(String[] args) {
		
		String marca,modelo;
		int menu, ano, media;
		double valor;
		int opcao =0;
		int contador = 0;
		int somaVal = 0;
			
		Scanner ler = new Scanner (System.in);
		
		ArrayList<String> carros = new ArrayList<>();
		do {

		System.out.println("---- MENU ----");
		System.out.println("\nSelecione a opção desejada:");
		System.out.println("\n(1)Cadastrar Carro");
		System.out.println("(2)Listagem Geral ");
		System.out.println("(3)Mostrar Resultados");
		System.out.println("(4)Sair ");
		System.out.println("\n -------------");
		menu = ler.nextInt();
		
		switch(menu)	{
		case 1:
			System.out.println("Preencha o formulário do cadastro: ");
			System.out.println("Digite a marca do veículo: ");
			marca = ler.next();
			
			System.out.println("Digite o modelo do veículo: ");
			modelo = ler.next();
			
			System.out.println("Digite o ano do veículo: ");
			ano = ler.nextInt();
			
			System.out.println("Digite o valor do veículo: ");
			valor = ler.nextDouble();
			
			if (valor >=50000) {
				contador++;
				somaVal = somaVal +ano;
			}
			
			carros.add(marca+ " - " +modelo+ " - " +ano+ " - R$" +valor);
			
		break;
		
		case 2:
			
			System.out.println(carros.toString());
			
		break;
		case 3:
			
			media = somaVal / contador;
			System.out.println(contador+ " Os veículos estão acima do valor de R$50.000");
			System.out.println("A média de anos dos veículos cadastrados é: "+media);
			
			break;
		
		case 4:
			
		break;
		
		default:
		      System.out.println("Erro! Realize novamente a consulta.");
		}
		    
		} 
		while (menu != 4);
		}
}