package Aula1;

import java.util.Scanner;

public class InteirosEReal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2;
		float num3, soma, elevado, produto;
		
		System.out.print("Informe um n�mero inteiro: ");
		num1 = entrada.nextInt();
		System.out.print("Informe outro n�mero inteiro: ");
		num2 = entrada.nextInt();
		System.out.print("Agora informe um n�mero real: ");
		num3 = entrada.nextFloat();
		
		produto = ((num1*2) * (num2/2));
		soma = (num1*3)+num3;
		elevado = ((num3*num3)*num3);
		
		System.out.println("=== Resultados ===");
		System.out.println("A - o produto do dobro do primeiro com metade do segundo � igual a: "+produto);
		System.out.println("B - a soma do triplo do primeiro com o terceiro � igual a: "+soma);
		System.out.println("C - o terceiro elevado ao cubo � igual a: "+elevado);
		
		entrada.close();

	}

}
