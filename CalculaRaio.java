package Lista1;

import java.util.Scanner;

public class CalculaRaio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float area, pi;
		int raio;
		
		pi = (float) 3.14;
		
		System.out.println("==== Calcula área do Círculo ====");
		System.out.print("Informe o raio do círculo: ");
		raio = entrada.nextInt();
		
		area = (pi*(raio*raio));
		
		System.out.println("A área do círculo de raio "+ raio + " é igual a: "+ area);
		
		entrada.close();
		

	}

}
