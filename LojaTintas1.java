package Aula1;

import java.util.Scanner;

public class LojaTintas1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float metros, litros, capacidadeL = 18, precoL = (float) 80.00, areaL = 54, total;
		int latas;
		
		System.out.print("Informe o tamanho em m� da �rea a ser pintada: ");
		metros = entrada.nextFloat();
		
		if(metros <= areaL) {
			System.out.println("Voc� usar� apenas 1 lata de "+capacidadeL+"L de tinta e pagar�: R$"+precoL);
		} else {
			litros = metros/3;
			latas = (int) (litros/capacidadeL);
			total = latas*precoL;
			System.out.println("Voc� usar� "+latas+" latas de tinta e pagar� R$"+total);
		}
		
		entrada.close();
		
		
		

	}

}
