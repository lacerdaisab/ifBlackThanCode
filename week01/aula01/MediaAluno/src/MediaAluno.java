import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NotaUm;
		int NotaDois;
		String NomeAluno;

		Scanner Nome = new Scanner(System.in);
		System.out.println("Informe seu nome: ");
		NomeAluno = Nome.next();
		
		Scanner lerNotaUm = new Scanner(System.in);
		System.out.println("Informe sua primeira nota: ");
		NotaUm = lerNotaUm.nextInt();
		
		Scanner lerNotaDois = new Scanner(System.in);
		System.out.println("Informe sua segunda nota: ");
		NotaDois = lerNotaDois.nextInt();
		
		float Media = ((NotaUm + NotaDois) / 2);
		
		if (Media <= 5) {
			System.out.println("Que pena, " + NomeAluno + "! Sua nota foi " + Media + " e voce foi reprovado.");
		} else {
			System.out.println("Oba! Parabens, " + NomeAluno + "! Sua nota foi " + Media + " e voce foi aprovado.");
		}
	}

}
