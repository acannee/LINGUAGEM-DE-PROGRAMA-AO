package exercicios300;

public class Exercicio9 {

	public static void main(String[] args) {
		 int dia= 29, mes= 12;
	        
	        if(mes != 12 && dia>0 && dia<=32){
	            System.out.println("Data v�lida");
	        }else if(mes==12 && dia<29){
	            System.out.println("Dia v�lido");
	        }else
	            System.out.println("Dia inv�lido");
	    }
	}
