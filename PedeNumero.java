package Lista1;

import java.util.Scanner;

public class PedeNumero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro: ");
		int num = entrada.nextInt();
		
		System.out.println("O n�mero informado foi: "+num);
		entrada.close();

	}

}
