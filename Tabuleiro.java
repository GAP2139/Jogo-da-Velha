package Jogo;

public class Tabuleiro extends Computador {//Tornei Tabuleiro uma classe filha de Computador para simplificar as fun��es que precisaria chamar
	public int mat[][] = new int[3][3]; // Matriz que vai representar o tabuleiro
	public int linha;
	public int coluna;
	int resultado;
	Jogador b = new Jogador(); //cria��o de um objeto jogador, para iniciar o jogo.
	ComputadorNivel1 a = new ComputadorNivel1(); //Cria��o do objeto nivel de dificuldade, e por aqui que se altera a dificuldade
	// 1 = computador
	// -1 = Jogador
	public void jogadaJogador() {
		do {
			linha = b.solicitarLinha(); //Chamada das fun��es de Jogador
			coluna = b.solicitarColuna();
			linha -=1; // como n�o costumamos usar posi��o 0 normalmente, fiz a equival�ncia indo de 1 a 3 e subtra�ndo 1 pra encaixar na matriz
			coluna -=1;
			if (mat[linha][coluna] == 0) { // Verifica se a linha e coluna que o jogador colocou est� dispon�vel
				break;
			}
			else {
				System.out.println("Posi��o j� utilizada");
			}
		}while(true); // S� sair� do while quando a linha e coluna informada for uma dispon�vel
		mat[linha][coluna]= -1; // Na matriz o jogador ser� representado por um -1
	}
	@Override
	int linha() { // classe abstrata da super classe
		return 0;
	}

	@Override
	int coluna() {// classe abstrata da super classe
		return 0;
	}

	public void jogadaComputador() {
		while(mat[linha][coluna] != 0){ // garante que a escolha de posi��o seja uma dispon�vel, caso contr�rio gera novamente
			linha = a.linha();//Chamada da classe Computador (que por sua vez chama o n�vel do computador "a")
			coluna = a.coluna();
		}
		mat[linha][coluna] = 1; //Na matriz o Computador ser� representado por -1
		}
	public void mostrarTabuleiro() {// Exibe o tabuleiro no console 
		System.out.println("  1 2 3");// Adiciona n�meros nas colunas para facilitar a jogada do jogador
		for (int i = 0; i < mat.length; i++) {//linhas
			for (int j = 0; j < mat.length; j++) {//colunas
				if (j == 0) {// Adiciona n�meros nas linhas para facilitar a jogada do jogador
					System.out.print(i+1 + " ");
				}
				if (mat[i][j] == -1 ) { // marca um X no local que o jogador disser que quer fazer a jogada
					System.out.print("X");
					}

				else {
					if(mat[i][j] == 1) {// marca um O no local que o Computador for fazer a jogada
						System.out.print("O");
					}
						
					else{
						if (i != 2) {// coloca as linhas, pulando somente a �ltima linha que n�o deve ter nada 
							System.out.print("_");
				}
					}
				}
				if (j != 2 && i != 2 ) { // exibe as colunas tirando a ultima coluna que n�o deve ter nada
					System.out.print("|"); 
				}
				else { 
					if (i == 2 && j != 2 && mat[i][j] != 1 && mat[i][j] != -1){ // faz com que a �ltima linha tenha espa�o
						System.out.print(" |"); 
				}
					else {if (mat[i][j] == 1 || mat[i][j] == -1 ) {
							if( j !=2) {
								System.out.print("|");
							}
					}
					}
				}
				
			}
			System.out.println(); // Pula espa�o entre as linhhas 
		}
		resultado = verificarJogo(); // chama a fun��o que verifica o estado do jogo
		if (resultado != 0 && resultado!=3) { //Informa se teve vencedor e quem seria
			System.out.println("Parabens temos um vencedor, e o vencedor �: ");
			if (resultado == -1) {
				System.out.println("O ganhador � o Jogador");
			}
			if (resultado == 1) {
				System.out.println("O ganhador � o computador");
			}
			
		}
		if (resultado == 3) {//Informa se o jogo empatou
			System.out.println("O jogo empatou");
			
		}

	}
	public int verificarJogo() { // 0 - jogo deve continuar. 1, -1 - ouve um vencedor. 3 - jogo deu empate
		for(int i = 0; i<3; i++) {//Verifica as linhas se algu�m venceu e retorna o primeiro item, caso existe um vencedor
			if (mat[i][0] == mat[i][1] && mat[i][0] == mat [i][2] && mat[i][0] != 0) {
				return mat[i][0];
			}
		}
		for(int j = 0;j<3; j++) {//Verifica as colunas se algu�m venceu e retorna a primeira o primeiro item, caso existe um vencedor
			if (mat[0][j] == mat [1][j] && mat [0][j] == mat[2][j] && mat [0][j] != 0) {
				return mat [0][j];
			}
		}
		if (mat[0][0] == mat[1][1] && mat [0][0]== mat [2][2] && mat [0][0] != 0) {//Verifica diagonal inicada na esquerda e retorna o primeiro item, caso existe um vencedor
			return mat [0][0];
		}
		if (mat[0][2] == mat[1][1] && mat[0][2] == mat [2][0] && mat[0][2]!=0) {//Verifica diagonal iniciada na direita e retorna o primeiro item, caso existe um vencedor
			return mat [0][2];
		}
		for(int i = 0; i<3;i++) { //Verifica se ainda existem espa�os em branco na matriz e retorna 0 para continuar, caso afirmativo
			for (int j= 0; j<3; j++) {
				if (mat[i][j] == 0) {
					return 0;
				}
			}
		}
		return 3; //Se n�o ouve nenhum ganhador e n�o tem mais espa�os em branco ( verificado pelos if anteriores ) retorna 3 para informar empate
	}
}
