package Aula1;

import java.util.Scanner;

public class Pescador {


	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float pesoPadrao = (float) 50.00, pesoPescado, excesso;
		double valMulta = 4.00, multa;
		String status = "ZERO";
		
		System.out.println("==== Calcula Pescado ====");
		System.out.print("Informe quantos quilos foram pescados: ");
		pesoPescado = entrada.nextFloat();
		
		if(pesoPescado > pesoPadrao) {
			excesso = pesoPescado - pesoPadrao;
			multa = excesso * valMulta;
			System.out.println("Você pescou acima do permitido e terá que pagar uma multa!");
			System.out.println("Informações:");
			System.out.println("Excesso: "+excesso+"kg.");
			System.out.println("Valor da multa por excesso: R$ "+multa);
		} else {
			excesso = Float.parseFloat(status);
			multa = Float.parseFloat(status);
			System.out.println("Você pescou dentro da cota permitida!");
			System.out.println("Informações:");
			System.out.println("Excesso: "+excesso);
			System.out.println("Valor da multa por excesso: R$ "+multa);
		}
		
		entrada.close();
		

	}

}
