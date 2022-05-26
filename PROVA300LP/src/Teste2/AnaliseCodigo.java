package Teste2;

public class AnaliseCodigo {

	public static void main(String[] args) {
		for(int i=2; i<=5; i++) {
            if (i==4) break;
            System.out.println(i);
        }

        for(int i=1; i<=5; i++) {
            if (i==1) continue;
            System.out.println(i);
        }
    }
}