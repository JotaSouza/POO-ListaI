package Aula1;

import java.util.Scanner;

public class FolhaPagamento {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double salBruto, salLiquido, valHora, valIR, valINSS, valSind, descontos;
		int horaTrabalhada, IR = 11, INSS = 8, taxSind = 5;
		
		System.out.println("==== Folha de pagamento detalhada ====");
		System.out.print("Informe o valor que você recebe por hora: ");
		valHora = entrada.nextDouble();
		System.out.print("Informe quantas horas você trabalhou no mês: ");
		horaTrabalhada = entrada.nextInt();
		
		salBruto = valHora * horaTrabalhada;
		valIR = (salBruto*IR)/100;
		valINSS = (salBruto*INSS)/100;
		valSind = (salBruto*taxSind)/100;
		descontos = valINSS + valIR + valSind;
		salLiquido = salBruto - descontos;
		
		System.out.println("Detalhes:");
		System.out.println("Salário bruto: R$"+salBruto);
		System.out.println("Valor recolhido ao INSS: R$"+valINSS);
		System.out.println("Valor recolhido ao sindicato: R$"+valSind);
		System.out.println("Salário líquido: R$"+salLiquido);
		
		entrada.close();
		
		

	}

}
