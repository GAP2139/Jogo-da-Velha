package Jogo;

public class Principal {

	public static void main(String[] args) {
		Tabuleiro a = new Tabuleiro(); // cria��o de um objeto da classe tabuleiro para iniciar o jogo
		a.mostrarTabuleiro(); //Come�o do jogo, ainda fora da repeti��o
		a.jogadaComputador();
		a.mostrarTabuleiro();
		while (a.verificarJogo() == 0){ //estrutura de repeti��o que garante que o jogo continue enquanto tiver um espa�o em branco
			a.jogadaJogador();
			a.jogadaComputador();
			a.mostrarTabuleiro();


		}
		}
	}


