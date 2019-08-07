package Lista1;

import java.util.Scanner;

public class CalculaSalarioHora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==== Calcula salário ====");
		System.out.print("Informe quanto você ganha por hora trabalhada: ");
		double valHora = entrada.nextDouble();
		
		System.out.print("Informe quantas horas você trabalhou este mês: ");
		int horaTrab = entrada.nextInt();
		
		double salario = valHora * horaTrab;
		
		System.out.println("Seu salário este mês é de R$"+salario);
		entrada.close();

	}

}
