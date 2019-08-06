package Aula1;

import java.util.Scanner;

public class LojaTintas2 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		float metros, litros, capacidadeL = 18, capacidadeG = (float) 3.6, 
			  precoG = (float) 25.00, precoL = (float) 80.00, areaL = 108, areaG = (float) 21.6, total;
		int latas, galoes, opcao;
		
		System.out.print("Informe o tamanho em m� da �rea a ser pintada: ");
		metros = entrada.nextFloat();
		System.out.println("Escolha a op��o que deseja:");
		System.out.println("1 - Lata de 18 litros"); 
		System.out.println("2 - Gal�o de 3,6 litros");
		System.out.print("Op��o -> ");
		opcao = entrada.nextInt();
		
		if(opcao == 1) {
			if(metros <= areaL) {
				System.out.println("Voc� usar� apenas 1 lata de "+capacidadeL+"L de tinta e pagar�: R$"+precoL);
			} else {
				litros = metros/6;
				latas = (int) (litros/capacidadeL);
				total = latas*precoL;
				System.out.println("Voc� usar� "+latas+" latas de tinta e pagar� R$"+total);
			}
		} else if (opcao == 2) {
			if(metros <= areaG) {
				System.out.println("Voc� usar� apenas 1 gal�o de "+capacidadeG+"L de tinta e pagar�: R$"+precoG);
			} else {
				litros = metros/6;
				galoes = (int) (litros/capacidadeG);
				total = galoes*precoG;
				System.out.println("Voc� usar� "+galoes+" gal�es de tinta e pagar� R$"+total);
			}
		} else {
			System.out.println("Op��o inv�lida!");
		}		
		
		entrada.close();

	}

}
