package Lista1;

import java.util.Scanner;

public class MediaBimestral {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==== Calcula Média Bimestral ====");
		
		float nota1, nota2, nota3, nota4, media;
		
		System.out.print("Informe a primeira nota do aluno: ");
		nota1 = entrada.nextFloat();
		System.out.print("Informe a segunda nota do aluno: ");
		nota2 = entrada.nextFloat();
		System.out.print("Informe a terceira nota do aluno: ");
		nota3 = entrada.nextFloat();
		System.out.print("Informe a quarta nota do aluno: ");
		nota4 = entrada.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4f;
		
		System.out.println("A média bismestral do aluno é: "+media);
		entrada.close();

	}

}
