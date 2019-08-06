package Aula1;

import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float altura,pesoIdeal;
		
		System.out.println("==== Calcula Peso Ideal ====");
		System.out.print("Informe sua altura: ");
		altura = entrada.nextFloat();
		
		pesoIdeal = (float) ((72.7*altura)-58);
		
		System.out.println("Seu peso ideal é: "+pesoIdeal+"kg");
		entrada.close();

	}

}
