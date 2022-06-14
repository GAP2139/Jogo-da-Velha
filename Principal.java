package Jogo;

public class Principal {

	public static void main(String[] args) {
		Tabuleiro a = new Tabuleiro(); // criação de um objeto da classe tabuleiro para iniciar o jogo
		a.mostrarTabuleiro(); //Começo do jogo, ainda fora da repetição
		a.jogadaComputador();
		a.mostrarTabuleiro();
		while (a.verificarJogo() == 0){ //estrutura de repetição que garante que o jogo continue enquanto tiver um espaço em branco
			a.jogadaJogador();
			a.jogadaComputador();
			a.mostrarTabuleiro();


		}
		}
	}


