package Lista1;

import java.util.Scanner;

public class SomaDoisNumeros {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, soma;
		
		System.out.print("Digite um n�mero inteiro: ");
		num1 = entrada.nextInt();
		
		System.out.print("Digite outro n�mero inteiro: ");
		num2 = entrada.nextInt();
		
		soma = num1+num2;
		
		System.out.println("A soma dos n�meros informados � igual a: "+soma);
		
		entrada.close();

	}

}
