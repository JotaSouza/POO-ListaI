package Lista1;

import java.util.Scanner;

public class ConverteTemperatura {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float tempFaren, tempCels;
		
		System.out.println("==== Converte temperatura Farenheit em Celsius ====");
		System.out.print("Informe a temperatura em graus Farenheit: ");
		tempFaren = entrada.nextFloat();
		
		tempCels = (float) ((tempFaren - 32)/1.8);
				
		System.out.println("A temperatura informada, convertida para Celsius é de: "+tempCels+"°");
		entrada.close();

	}

}
