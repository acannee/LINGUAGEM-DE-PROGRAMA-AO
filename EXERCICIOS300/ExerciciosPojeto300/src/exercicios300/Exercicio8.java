package exercicios300;

//sem intera��o com o usuario

public class Exercicio8 {

	public static void main(String[] args) {
		
		int idade = 20;
		
        
        if(idade<16){
            System.out.println("N�o pode votar");
        }else if(idade >=16 && idade <= 18 || idade > 65){
            System.out.println("Voto facultativo");
        }else
            System.out.println("Voto Obrigat�rio");

    }
}