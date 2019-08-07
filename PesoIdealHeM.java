package Lista1;

import java.util.Scanner;

public class PesoIdealHeM {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float pesoH, pesoF, altura;
		char sexo = 0;
		System.out.println("==== Calcula Peso Ideal =====");
		System.out.print("Informe sua altura: ");
		altura = entrada.nextFloat();
		entrada.nextLine();
		System.out.print("Digite H ou M para especificar o sexo: ");
		sexo = entrada.next().charAt(sexo);
		
		if(sexo == 'H' || sexo == 'h') {
			pesoH = (float) ((72.7*altura)-58);
			System.out.println("Seu peso ideal é de "+pesoH+"kg.");
		} else if (sexo == 'M' || sexo == 'm') {
			pesoF = (float) ((62.1*altura)-44.7);
			System.out.println("Seu peso ideal é de "+pesoF+"kg.");
		} else {
			System.out.println("Opção inválida");
		}
		
		entrada.close();

	
	}
}
