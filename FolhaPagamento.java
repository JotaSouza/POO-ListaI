package Aula1;

import java.util.Scanner;

public class FolhaPagamento {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double salBruto, salLiquido, valHora, valIR, valINSS, valSind, descontos;
		int horaTrabalhada, IR = 11, INSS = 8, taxSind = 5;
		
		System.out.println("==== Folha de pagamento detalhada ====");
		System.out.print("Informe o valor que voc� recebe por hora: ");
		valHora = entrada.nextDouble();
		System.out.print("Informe quantas horas voc� trabalhou no m�s: ");
		horaTrabalhada = entrada.nextInt();
		
		salBruto = valHora * horaTrabalhada;
		valIR = (salBruto*IR)/100;
		valINSS = (salBruto*INSS)/100;
		valSind = (salBruto*taxSind)/100;
		descontos = valINSS + valIR + valSind;
		salLiquido = salBruto - descontos;
		
		System.out.println("Detalhes:");
		System.out.println("Sal�rio bruto: R$"+salBruto);
		System.out.println("Valor recolhido ao INSS: R$"+valINSS);
		System.out.println("Valor recolhido ao sindicato: R$"+valSind);
		System.out.println("Sal�rio l�quido: R$"+salLiquido);
		
		entrada.close();
		
		

	}

}
