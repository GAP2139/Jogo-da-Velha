package Jogo;

import java.util.Random;//Me permite gerar numeros aleatórios

public abstract class  Computador {
	int aleatorio;
	Random gerador = new Random();
	int linha;
	int coluna;
	abstract int linha();//atributo abstrato para que as classes filhas retornem seu valor cada uma individualmente
	abstract int coluna();
	public int getLinha() {
		setLinha(gerador.nextInt(3));//Utilizo o próprio getLinha para gerar o número aleatório e colocar no setLinha, quando preciso, não precisando reptir em cada subclasse
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public int getColuna() {
		setColuna(gerador.nextInt(3));//Utilizo o próprio getColuna para gerar o número aleatório e colocar no setColuna, quando preciso, não precisando reptir em cada subclasse
		return coluna;
	}
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	}
