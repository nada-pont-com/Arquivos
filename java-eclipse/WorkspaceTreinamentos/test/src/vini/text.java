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
    	//repeti��o que coloca nas 25 posi��es o valor ~, indicando que n�o houve tiro 
        for (int linha = 0; linha < 5; linha++)
            for (int coluna = 0; coluna < 5; coluna++)
                tabuleiro[linha][coluna] = "~";
        //retorna tabuleiro para a chamada da fun��o
        return tabuleiro;
    }//fim da inicializarTabuleiro
	
	static void mostrarTabuleiro(String[][] tabuleiro){
    	//come�a vari�vel com o visual do tabuleiro, indicando as colunas presentes
    	//Obs: apesar das posi��es do tabuleiro, tanto linhas quanto colunas, serem
    	//de 0 a 4, pro usu�rio � mais l�gico entender que � de 1 a 5, mas isso vai
    	//afetar a codifica��o em v�rios momentos, como voc� ver� em outras fun��es
    	String visualTabuleiro = "\\\\ 1 2 3 4 5";
        
    	//para cada linha da matriz
        for (int linha = 0; linha < 5; linha++){
            
        	//pula um linha de escrita
        	visualTabuleiro += ("\n");

        	//mostra numero da linha (+1 pois � matriz...)
        	visualTabuleiro += (linha + 1);
        	
        	//e para cada coluna
            for (int coluna = 0; coluna < 5; coluna++){
            	//coloca um espa�o para organizar melhor e o valor daquela posi��o do tabuleiro
            	visualTabuleiro += (" " + tabuleiro[linha][coluna]);
                                
            }
        }
        //mostra tabuleiro montado
        JOptionPane.showMessageDialog(null, visualTabuleiro, "Tabuleiro", JOptionPane.INFORMATION_MESSAGE);
    }//fim do mostrarTabuleiro

}
