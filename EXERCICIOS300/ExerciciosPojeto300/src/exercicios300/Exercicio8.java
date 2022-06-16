package exercicios300;

//sem interação com o usuario

public class Exercicio8 {

	public static void main(String[] args) {
		
		int idade = 20;
		
        
        if(idade<16){
            System.out.println("Não pode votar");
        }else if(idade >=16 && idade <= 18 || idade > 65){
            System.out.println("Voto facultativo");
        }else
            System.out.println("Voto Obrigatório");

    }
}