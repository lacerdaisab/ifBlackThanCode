import java.util.Scanner;

public class CalculoValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int EntradaCalculadora;
		Scanner lerEntrada = new Scanner(System.in);
		System.out.println("Informe o numero que quer calcular: ");
		//EntradaCalculadora = lerEntrada.nextInt();
		
		System.out.println("");
		System.out.println("Sua tabuada de multiplicacao ;)");
	    for (int PrimeiroFator = 0; PrimeiroFator <= 10; PrimeiroFator++) {
	    	System.out.println("Tabuada do " + PrimeiroFator);
	        for (int SegundoFator = 0; SegundoFator <=10; SegundoFator++) {
	        	int Resultado = SegundoFator * PrimeiroFator;
	  			System.out.println(SegundoFator + " * " + PrimeiroFator + " = " + Resultado);
	        }
	        System.out.println("");
	        System.out.println("");
	  		}
	  		
  		System.out.println("");
  		System.out.println("Sua tabuada de divisao ;)");
  		for (int PrimeiroFator = 1; PrimeiroFator <= 10; PrimeiroFator++) {
  			System.out.println("Tabuada do " + PrimeiroFator);
	        for (int SegundoFator = 10; SegundoFator >0; SegundoFator--) {
	  			int Resultado = PrimeiroFator / SegundoFator;
	  			System.out.println(PrimeiroFator + " / " + SegundoFator + " = " + Resultado);
	        }
	        System.out.println("");
	        System.out.println("");
  		}
  		
  		System.out.println("");
  		System.out.println("Sua tabuada de soma ;)");
  		for (int PrimeiroFator = 0; PrimeiroFator <= 10; PrimeiroFator++) {
  			System.out.println("Tabuada do " + PrimeiroFator);
	        for (int SegundoFator = 0; SegundoFator <=10; SegundoFator++) {
	  			int Resultado = SegundoFator + PrimeiroFator;
	  			System.out.println(SegundoFator + " + " + PrimeiroFator + " = " + Resultado);
	        }
	        System.out.println("");
	        System.out.println("");
  		}
  		
  		System.out.println("");
  		System.out.println("Sua tabuada de subtracao ;)");
  		for (int PrimeiroFator = 0; PrimeiroFator <= 10; PrimeiroFator++) {
  			System.out.println("Tabuada do " + PrimeiroFator);
	        for (int SegundoFator = 0; SegundoFator <=10; SegundoFator++) {
	  			int Resultado = PrimeiroFator - SegundoFator;
	  			System.out.println(PrimeiroFator + " - " + SegundoFator + " = " + Resultado);
	        }
	        System.out.println("");
	        System.out.println("");
  		}
		
	}

}
