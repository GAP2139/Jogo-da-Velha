package Jogo;

public class ComputadorNivel1 extends Computador {//Este nível é completamente aleatório, ele selecionará qualquer posição em qualquer jogada, sem lógica mais profunda
	int linha;
	int coluna;

	@Override
	int linha() {
		linha = getLinha();
		return linha;//recebe linha aleatória do getLinha da classe Computador e retorna a linha
	}

	@Override
	int coluna() {
		coluna = getColuna();
		return coluna;//recebe coluna aleatória do getcoluna da classe Computador e retorna a coluna
	}

}
