package Jogo;

import java.util.Random;//Me permite gerar numeros aleat�rios

public abstract class  Computador {
	int aleatorio;
	Random gerador = new Random();
	int linha;
	int coluna;
	abstract int linha();//atributo abstrato para que as classes filhas retornem seu valor cada uma individualmente
	abstract int coluna();
	public int getLinha() {
		setLinha(gerador.nextInt(3));//Utilizo o pr�prio getLinha para gerar o n�mero aleat�rio e colocar no setLinha, quando preciso, n�o precisando reptir em cada subclasse
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public int getColuna() {
		setColuna(gerador.nextInt(3));//Utilizo o pr�prio getColuna para gerar o n�mero aleat�rio e colocar no setColuna, quando preciso, n�o precisando reptir em cada subclasse
		return coluna;
	}
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	}
