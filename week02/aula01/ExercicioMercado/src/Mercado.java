/* Programa:MercadoFrutas
Classe: CRUD

Scanner - Teclado

Um programa de Controle de Frutas

Switch
1 - Permite fazer o cadastro de frutas
ArrayList + add
if

2 - Permite mostrar todas as frutas Cadastradas
Mostrar a Variável do tipo ArrayList no sysout

3 - Permite trocar uma fruta por outra fruta através do id interno
Ao digitar um id, mostrar a fruta atual e 
Permitir modificar a fruta

ArrayList do tipo SET

4 - Sai do laço de repetição 
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mercado {
	
	static void menuPrincipal() {
		System.out.println("Ola, bem-vindo ao mercado frutinhas gostosas ;)");
		System.out.println("Escolha os valores abaixo: ");
		System.out.println("1 - Cadastrar uma fruta nova");
		System.out.println("2 - Ver todas as frutas cadastradas");
		System.out.println("3 - Trocar uma fruta por outra");
		System.out.println("4 - Sair do menu.");
	}
	
	static void menuPrimeiro() {
		System.out.println("Selecione os valores abaixo :p :");
		System.out.println("1 - Para cadastrar uma fruta nova.");
		System.out.println("2 - Voltar para o menu principal.");
	}
	
	static void menuSegundo() {
		System.out.println("Selecione os valores abaixo :p :");
		System.out.println("1 - Para ver todas as frutas cadastradas.");
		System.out.println("2 - Voltar para o menu principal.");
	}
	
	static void menuTerceiro() {
		System.out.println("Selecione os valores abaixo :p :");
		System.out.println("1 - Para trocar uma fruta por outra.");
		System.out.println("2 - Voltar para o menu principal.");
	}
	
	static void loopMenuPrincipal() {
		int opcoes;
		
		Scanner entrada = new Scanner(System.in);
		opcoes = entrada.nextInt();
		
		if (opcoes <= 3 && opcoes > 0) {
			menuPrincipal();
		} else {
			System.exit(0);
		}
	}
	
	static void loopMenuPrimeiro() {
		int opcao1;
		String opcao1fruta;
		
		Scanner primeiraopcao = new Scanner(System.in);
		opcao1 = primeiraopcao.nextInt();
		
		if (opcao1 <= 1 && opcao1 > 0) {
			System.out.println("Coloque o nome da fruta que quer inserir: ");
		} else {
			//menuPrincipal();
			loopMenuPrincipal();
		}
	}
	
	public static void main(String[] args) {
		int opcoes, opcao1;
		String opcao1fruta;
		
		List<String> listaFrutas = new ArrayList<String>();
		listaFrutas.add("banana");
		listaFrutas.add("maca");
	
		//mostrar para o usuario o menu principal
		menuPrincipal();
		//loopMenuPrincipal();
		Scanner entrada = new Scanner(System.in);
		opcoes = entrada.nextInt();
		
		
		
		
		switch (opcoes) {
		case 1: 
			
			//mostrar para o usuario o menu 1
			menuPrimeiro();
			
			//opcao para sair do loop so se o usuario inserir o numero 2
			loopMenuPrimeiro();
			
			//recebe o valor da fruta que o usuario escreveu
			Scanner primeiraopcaofruta = new Scanner(System.in);
			opcao1fruta = primeiraopcaofruta.nextLine();
			
			//adiciona fruta a array
			listaFrutas.add(opcao1fruta);
			
			//mostra array
			System.out.println(listaFrutas);
			
			
			break;
		case 2: 
			System.out.println(listaFrutas);
			break;
		case 3: 
			
			
			
			
			
			break;
		case 4: 
			System.out.println("Quarta-feira");
			break;
		default: 
			System.out.println("Insira um valor válido.");
		}
	}
}
