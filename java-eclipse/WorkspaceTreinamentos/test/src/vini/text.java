package vini;

import javax.swing.JOptionPane;

public class text {

	public static void main(String[] args) {
		String[][] tabuleiro = new String[5][5];
		tabuleiro = inicializarTabuleiro();
		mostrarTabuleiro(tabuleiro);
		
	}
	
	static String[][] inicializarTabuleiro(){
    	//cria matriz interna para o tabuleiro
    	String[][] tabuleiro = new String[5][5];
    	//repetição que coloca nas 25 posições o valor ~, indicando que não houve tiro 
        for (int linha = 0; linha < 5; linha++)
            for (int coluna = 0; coluna < 5; coluna++)
                tabuleiro[linha][coluna] = "~";
        //retorna tabuleiro para a chamada da função
        return tabuleiro;
    }//fim da inicializarTabuleiro
	
	static void mostrarTabuleiro(String[][] tabuleiro){
    	//começa variável com o visual do tabuleiro, indicando as colunas presentes
    	//Obs: apesar das posições do tabuleiro, tanto linhas quanto colunas, serem
    	//de 0 a 4, pro usuário é mais lógico entender que é de 1 a 5, mas isso vai
    	//afetar a codificaçào em vários momentos, como você verá em outras funções
    	String visualTabuleiro = "\\\\ 1 2 3 4 5";
        
    	//para cada linha da matriz
        for (int linha = 0; linha < 5; linha++){
            
        	//pula um linha de escrita
        	visualTabuleiro += ("\n");

        	//mostra numero da linha (+1 pois é matriz...)
        	visualTabuleiro += (linha + 1);
        	
        	//e para cada coluna
            for (int coluna = 0; coluna < 5; coluna++){
            	//coloca um espaço para organizar melhor e o valor daquela posição do tabuleiro
            	visualTabuleiro += (" " + tabuleiro[linha][coluna]);
                                
            }
        }
        //mostra tabuleiro montado
        JOptionPane.showMessageDialog(null, visualTabuleiro, "Tabuleiro", JOptionPane.INFORMATION_MESSAGE);
    }//fim do mostrarTabuleiro

}
