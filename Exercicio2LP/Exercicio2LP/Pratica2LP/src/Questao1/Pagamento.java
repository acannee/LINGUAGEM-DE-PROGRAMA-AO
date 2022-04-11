package Questao1;

import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 Scanner ler = new Scanner(System.in);

	 Double valorCompra = 0.00;

	        while (true) {
	        	System.out.print("Qual valor da compra: ");
	            valorCompra = ler.nextDouble();
	            if (valorCompra == -1) {
	                ler.close();
	                return;
	            }
	            System.out.println();
	            System.out.println("----Escolha a opção de pagamento:----");
	            System.out.println("1 - À Vista (10% de desconto)");
	            System.out.println("2 - Parcelado 2x");
	            System.out.println("3 - Parcelado 3x até 6x(Válido nas compras acima de R$500,00)");

	            System.out.println();
	            System.out.print("Escolha a opção de pagamento: ");
	            int escolha = ler.nextInt();

	            while ((escolha >= 4) && (escolha <= 0)) {
	                System.out.println("Escolha um numero entre 1 e 3");
	            }
	            if (escolha == 1) {
	                valorCompra = valorCompra - (valorCompra * 0.1);
	                System.out.println("Sua compra saiu por " + valorCompra);
	            }
	            if (escolha == 2) {
	                System.out.println("Suas parelas são de " + valorCompra / 2);
	            }
	            if (escolha == 3) {
	                if (valorCompra >= 500) {
	                    System.out.print("Digite a quantidade de vezes que deseja parcelar: ");
	                    int parcelas = 0;
	                    while ((parcelas < 3) || (parcelas > 6)) {
	                        parcelas = ler.nextInt();
	                        if ((parcelas < 3) || (parcelas > 6)) {
	                            System.out.println("Parcelamos no maximo até 6 vezes");
	                        }
	                    }
	                    System.out.println();
	                    Double juros = valorCompra * 0.03;
	                    System.out.println("Suas parcelas saem por: " + (valorCompra + juros) / parcelas);
	                } else {
	                    System.out.println("Divisão de 3 a 6 apenas para compras acima de 500");
	                }
	            }
	        }     

	}

}
