package questao1;

import java.util.Scanner;

public class Questao1 {
	
	public static void main (String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
		float tempo, velocidadeMedia, kmLitro, distancia, consumoFinal;
		
		System.out.println("Tempo da viagem:");
		tempo=ler.nextFloat();
		System.out.println("Velocidade Média da viagem:");
		velocidadeMedia=ler.nextFloat();
		System.out.println("Consumo do veículo:");
		kmLitro=ler.nextFloat();
		
		distancia=velocidadeMedia*tempo;
		consumoFinal=distancia/kmLitro;
		
		System.out.println("O consumo final do veículo é:" + consumoFinal);
	}
	

}