package Aula1;

import java.util.Scanner;

public class LojaTintas2 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		float metros, litros, capacidadeL = 18, capacidadeG = (float) 3.6, 
			  precoG = (float) 25.00, precoL = (float) 80.00, areaL = 108, areaG = (float) 21.6, total;
		int latas, galoes, opcao;
		
		System.out.print("Informe o tamanho em m² da área a ser pintada: ");
		metros = entrada.nextFloat();
		System.out.println("Escolha a opção que deseja:");
		System.out.println("1 - Lata de 18 litros"); 
		System.out.println("2 - Galão de 3,6 litros");
		System.out.print("Opção -> ");
		opcao = entrada.nextInt();
		
		if(opcao == 1) {
			if(metros <= areaL) {
				System.out.println("Você usará apenas 1 lata de "+capacidadeL+"L de tinta e pagará: R$"+precoL);
			} else {
				litros = metros/6;
				latas = (int) (litros/capacidadeL);
				total = latas*precoL;
				System.out.println("Você usará "+latas+" latas de tinta e pagará R$"+total);
			}
		} else if (opcao == 2) {
			if(metros <= areaG) {
				System.out.println("Você usará apenas 1 galão de "+capacidadeG+"L de tinta e pagará: R$"+precoG);
			} else {
				litros = metros/6;
				galoes = (int) (litros/capacidadeG);
				total = galoes*precoG;
				System.out.println("Você usará "+galoes+" galões de tinta e pagará R$"+total);
			}
		} else {
			System.out.println("Opção inválida!");
		}		
		
		entrada.close();

	}

}
