package Jogo;

public class ComputadorNivel1 extends Computador {//Este n�vel � completamente aleat�rio, ele selecionar� qualquer posi��o em qualquer jogada, sem l�gica mais profunda
	int linha;
	int coluna;

	@Override
	int linha() {
		linha = getLinha();
		return linha;//recebe linha aleat�ria do getLinha da classe Computador e retorna a linha
	}

	@Override
	int coluna() {
		coluna = getColuna();
		return coluna;//recebe coluna aleat�ria do getcoluna da classe Computador e retorna a coluna
	}

}
