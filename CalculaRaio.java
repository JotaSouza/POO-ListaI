package Lista1;

import java.util.Scanner;

public class CalculaRaio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float area, pi;
		int raio;
		
		pi = (float) 3.14;
		
		System.out.println("==== Calcula �rea do C�rculo ====");
		System.out.print("Informe o raio do c�rculo: ");
		raio = entrada.nextInt();
		
		area = (pi*(raio*raio));
		
		System.out.println("A �rea do c�rculo de raio "+ raio + " � igual a: "+ area);
		
		entrada.close();
		

	}

}
