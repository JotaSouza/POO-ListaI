package Lista1;

import java.util.Scanner;

public class PedeNumero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = entrada.nextInt();
		
		System.out.println("O número informado foi: "+num);
		entrada.close();

	}

}
