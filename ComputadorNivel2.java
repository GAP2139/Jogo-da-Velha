package Jogo;

public class ComputadorNivel2 extends Computador {//Este n�vel ter� uma l�gica de tentar jogadas principalmente na diagonal, caso o que ele pretende colocar seja preenchido, ser� gerado um n�mero aleat�rio
	int linha;
	int coluna;

	
	int linha() {//N�o � necess�rio uma estrutura de repeti��o, pois essa fun��o ser� chamada v�rias vezes at� ter um valor permitido para a jogada
		if (linha < 2) {//Garante jogadas na diagonal
			linha +=1;
			if(linha >= 2) {
				linha = getLinha();//coloca aleatoriedade, caso o valor ultrapasse o valor permitido, garantindo que o jogo acabe
				return linha;
			}
			return linha;
			}
			
		else { 	if (linha == 2) { //Impede que um valor acabe travando e em um loop infinito, juntamente com a aleatoriedade
					linha -= 2;
					return linha;
			}
				else{ if(linha > 2) {
						linha = 0;
						return linha;
				}
		}
		}
		return 0;

}
		


	int coluna() {//N�o � necess�rio uma estrutura de repeti��o, pois essa fun��o ser� chamada v�rias vezes at� ter um valor permitido para a jogada
		if (coluna < 2) {//Garante jogadas na diagonal
			coluna +=1;
			if(coluna >= 2) {
				coluna = getColuna();//coloca aleatoriedade, caso o valor ultrapasse o valor permitido, garantindo que o jogo acabe
				return coluna;
			}
			return coluna;
		}
		else{	if(coluna == 2) {//Impede que um valor acabe travando e em um loop infinito, juntamente com a aleatoriedade
				coluna -=2;
				return coluna;
			}
			else{	if(coluna > 2) {
						coluna = 0;
						return coluna;
			}
			}
			}
		return 0;
		}

}

