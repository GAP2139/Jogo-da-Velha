package Jogo;

import java.util.Scanner;

public class Jogador {
	Scanner teclado = new Scanner(System.in);//Declaro uma entrada para poder receber linha e coluna do jogador
	public int solicitarLinha() {
		int linha;
		do {//garante que o valor digitado est� entre 1 e 3, solicitando novamente se for outro valor
			System.out.println("Escolha qual linha deseja colocar sua jogada(1, 2, 3): ");
			linha = teclado.nextInt(); //Solicita linha
			if(linha == 1 || linha == 2 || linha == 3) {
				return linha;
			}
			else {
				System.out.println("Valor inv�lido");
			}
		}while(true); //While s� � quebrado se o Jogador digitar 1,2,3 para retornar a linha

		
	}
	public int solicitarColuna() {
		int coluna;
		do {//garante que o valor digitado est� entre 1 e 3, solicitando novamente se for outro valor
			System.out.println("Escolha qual coluna deseja colocar sua jogada(1, 2, 3): ");
			coluna = teclado.nextInt();//Solicita coluna
			if(coluna == 1 || coluna == 2 || coluna == 3) {
				return coluna;
			}
			else {
				System.out.println("Valor inv�lido");
				}
		}while(true); //While s� � quebrado se o Jogador digitar 1,2,3 para retornar a linha
		
	}
}
