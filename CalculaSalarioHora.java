package Lista1;

import java.util.Scanner;

public class CalculaSalarioHora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==== Calcula sal�rio ====");
		System.out.print("Informe quanto voc� ganha por hora trabalhada: ");
		double valHora = entrada.nextDouble();
		
		System.out.print("Informe quantas horas voc� trabalhou este m�s: ");
		int horaTrab = entrada.nextInt();
		
		double salario = valHora * horaTrab;
		
		System.out.println("Seu sal�rio este m�s � de R$"+salario);
		entrada.close();

	}

}
