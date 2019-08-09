package marlow;

import javax.swing.JOptionPane;
import java.util.Random;

public class BatalhaNaval {
	
	public static void main(String[] args) {
		
		/*
		 * Manual:
		 * O tabuleiro � formado por 5 linhas e 5 colunas. O computador posiciona 3 navios e o jogador deve
		 * acert�-los no m�nimo de jogadas poss�vel. Durante a partida, ao ver o tabuleiro haver�o 3 s�mbolos:
		 * ~ - Local ainda n�o recebeu tiros
		 * x - acerto
		 * o - erro
		 * Ao fim de cada tiro, o jogador receber� uma dica, indicando quantos navios existem na coluna e linha 
		 * onde o tiro foi realizado, incluindo todos os navios que voc� j� acertou. Ex: Se voc� deu seu primeiro 
		 * tiro e acertou, e a mensagem disser que h� 1 navio naquela linha, quer dizer que voc� j� acertou o �nico 
		 * navio da linha.  
		 * O jogo acaba quando todos os navios forem acertados.
		 * Em caso de d�vidas, consulte o manual ou o c�digo-fonte.
		 */
	
		//Cria o tabuleiro de 5 linhas e 5 colunas
        String[][] tabuleiro = new String[5][5];
        //Cria uma matriz para armazenar a posi��o dos navios, sendo a linha referente ao navio (s�o 3 linhas para 3 navios), 
        //e a segunda conter� a linha e coluna em que ele est� (2 colunas, onde a coluna 0 armazena a linha do tabuleiro em 
        //que se encontra o navio e a coluna 1 armazena linha do tabuleiro em que se encontra a coluna do navio)
        //EX: supondo que o primeiro navio esteja em Linha 3 Coluna 1, isso ser� percept�vel da seguinte maneira:
        //navios[0][0] ter� o valor 3 (linha 3)
        //navios[0][1] ter� o valor 1 (Coluna 1)
        int[][] navios = new int[3][2];
        //Cria matriz que armazenar� linha e coluna de cada tiro
        int[] tiro = new int[2];
        //Cria vari�vel para guardar o resultado do tiro
        boolean sucesso;
        //Vari�veis para contar as tentativas e os acertos
        int tentativa = 0,
            acertos = 0;
        
        //mensagem inicial
        JOptionPane.showMessageDialog(null, "Argh! Bem vindo � Batalha Naval! \n"
        		+ "Seu objetivo � encontrar 3 navios piratas no menor n�mero de jogadas poss�veis. \n"
        		+ "Boa sorte!", "Batalha naval", JOptionPane.INFORMATION_MESSAGE);
        //chama fun��o que prepara o tabuleiro para o jogo
        tabuleiro = inicializarTabuleiro();
        //chama fun��o que posiciona navios em locais aleatorios no tabuleiro
        navios = posicionarNavios();
        
        //mensagem de inicio de jogo
        JOptionPane.showMessageDialog(null, "Iniciando a partida!", "Batalha naval", JOptionPane.INFORMATION_MESSAGE);
        
        //cria repeti��o para cada jogada
        do {
        	
        	//incrementa valor da tentativa
        	tentativa++;
            
        	//chama fun��o que mostra o tabuleiro
            mostrarTabuleiro(tabuleiro);
            
            //chama fun��o que solicita local do tiro
            tiro = darTiro(tabuleiro, tentativa);
            
            //chama fun��o que verifica se o tiro acertou algum navio 
            sucesso = verificarAcerto(tiro, navios);
            
            //se acertou
            if (sucesso)
            	//incrementa valor de acertos
                acertos++;
            
            //chama fun��o que altera valor inicial (~) para 'o' se errou e 'x' se acertou
            tabuleiro = atualizarTabuleiro(tiro, sucesso, tabuleiro);
            
            //caso o jogador ainda n�o tenha acertado todos os navios,
            if (acertos != 3)
            	//chama fun��o que d� dica de quantos navios tem na linha e na coluna escolhidas
            	darDica(tiro, navios, tentativa);
            
        //enquanto n�o acertar os 3 volta ao inicio da repeti��o
        } while(acertos != 3);
        
        //aviso de fim de jogo
        JOptionPane.showMessageDialog(null, "Jogo terminado. Voc� acertou os 3 navios em " + tentativa + " tentativas.");
        
    }//fim do main
    
	//fun��o que inicializa o tabuleiro
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
    
    //procedimento que exibe o tabuleiro
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

    //fun��o para posicionar os navios
    static int[][] posicionarNavios(){
    	//instancia randomizador sorteio para colocar os navios em locais aleat�rios
        Random sorteio = new Random();
        //cria matriz de navios interna � fun��o
        int[][] navios = new int[3][2];
        
        //para cada navio
        for (int navio = 0; navio < 3; navio++){
        	//sorteia linha e coluna do navio, com valores de 0 a 4, pois � matriz
            navios[navio][0] = sorteio.nextInt(5);
            navios[navio][1] = sorteio.nextInt(5);
        	/*
        	 *valida��o para colocar navios em 3 locais diferentes
            */
            //repeti��o para o segundo e terceiro navios
            for (int anterior = 0; anterior < navio; anterior++){
    			
            	//enquanto estiver em um local repetido
            	while ((navios[navio][0] == navios[anterior][0]) && (navios[navio][1] == navios[anterior][1])){
                	//resorteia linha e coluna do navio
                    navios[navio][0] = sorteio.nextInt(5);
                    navios[navio][1] = sorteio.nextInt(5);
                }
            }
            
        }
        //informa fim do posicionamento        
        JOptionPane.showMessageDialog(null, "Navios posicionados!", "Tabuleiro", JOptionPane.INFORMATION_MESSAGE);
        //retorna para a chamada da fun��o
        return navios;
    }//fim da posicionarNavios

    //fun��o que recebe os dados dos tiros
    static int[] darTiro(String[][] tabuleiro, int tentativa){
    	//cria vetor de tiro interno � fun��o
    	int[] tiro = new int[2];
    	//vari�veis de linha e coluna do tiro
    	int linha, coluna;
    	//vari�vel para evitar 2 tiros no mesmo local
    	boolean testeErro;
    	
    	//repeti��o para cada tentativa de tiro
    	do {
    		//informa qual tiro est� sendo dado
	    	JOptionPane.showMessageDialog(null, "Tiro " + tentativa);
	        //recebe valor da linha em que se quer atirar
	        linha = Integer.parseInt(JOptionPane.showInputDialog("Linha:"));
	        //decrementa 1 valor pois o vetor/matriz sempre come�a da posi��o 0,
	        //assim, se ele quiser atirar na primeira linha ele ter� digitado 1,
	        //mas o programa vai transformar para 0
	        linha--;
	
	        //recebe valor da coluna em que se quer atirar
	        coluna = Integer.parseInt(JOptionPane.showInputDialog("Coluna:"));
	        //idem a "linha--" acima
	        coluna--;
	        
	        //se tiro foi dado em um local inexistente
	        if ((linha<0)||(linha>4)||(coluna<0)||(coluna>4)) {
	        	//avisa que local � inexistente e altera pra true a vari�vel de controle de erro
	            JOptionPane.showMessageDialog(null, "Local inexistente!", "Erro!", JOptionPane.ERROR_MESSAGE);
	            testeErro = true;
	        //sen�o se o tiro n�o for em um local com "~"
	        }else if (!tabuleiro[linha][coluna].equals("~")){
		        	//avisa que j� atirou nesse lugar e altera pra true a vari�vel de controle de erro
		            JOptionPane.showMessageDialog(null, "Voc� j� atirou neste espa�o!", "Erro!", JOptionPane.ERROR_MESSAGE);
		            testeErro = true;
		        } else {//sen�o altera vari�vel de controle para false
		        	testeErro = false;
		        }
	        
	    //enquanto testeRepeticao for verdadeira, volta ao in�cio da tentativa de tiro    
    	}while (testeErro == true);
    	
    	//coloca posi��o do tiro em tiro[]
    	tiro[0] = linha;
    	tiro[1] = coluna;
    	//retorna o tiro dado para a chamada da fun��o
    	return tiro;
    }//fim da darTiro
    
    //fun��o que verifica se tiro foi ou n�o certeiro
    static boolean verificarAcerto(int[] tiro, int[][] navios){
        //para cada navio
        for (int navio = 0; navio < navios.length; navio++){
        	//se a posi��o do tiro for igual a do navio
            if ((tiro[0] == navios[navio][0]) && (tiro[1] == navios[navio][1])){
            	//diz que acertou, e usa (tiro[x] + 1) para mostrar o local de 1 a 5, n�o de 0 a 4
            	JOptionPane.showMessageDialog(null, "Voc� acertou o tiro (" + (tiro[0] + 1) + "," + (tiro[1] + 1) + ")\n");
            	//retorna verdadeiro
                return true;
            }
        }
        //retorna falso, pois se chegar nessa parte do c�digo � porque errou
        return false;
    }//fim da verificarAcerto

    //procedimento que mostra as dicas
    static void darDica(int[] tiro, int[][] navios, int tentativa){
    	//contadoras de navios por linha/coluna
        int linha = 0, 
        	coluna = 0;
        
        //para cada navio
        for (int fila=0; fila < 3; fila++){
        	//se a linha do tiro for igual a linha em que o navio foi posicionado
            if (navios[fila][0] == tiro[0])
            	//incrementa a contadora de quantos navios est�o naquela linha
                linha++;
            //se a coluna do tiro for igual a do navio
            if (navios[fila][1] == tiro[1])
            	//incrementa a contadora de quantos navios est�o naquela coluna
                coluna++;
        }
        //mostra dica, e usa (tiro[x] + 1) para mostrar de 1 a 5, n�o de 0 a 4
        JOptionPane.showMessageDialog(null, "Linha " + (tiro[0] + 1) + " -> " + linha + " navios"
        		+ "\nColuna " + (tiro[1] + 1) + " -> " + coluna + " navios", "Dica " + tentativa + ":", JOptionPane.WARNING_MESSAGE);
    }//fim do darDica

    //fun��o que atualiza o tabuleiro para exibi��o
    static String[][] atualizarTabuleiro(int[] tiro, boolean sucesso, String[][] tabuleiro){
    	//se acertou tiro
        if(sucesso)
        	//muda no tabuleiro valor da posi��o onde o tiro foi dado para acerto (x)
            tabuleiro[tiro[0]][tiro[1]] = "x";
        //senao muda pra erro (o)
        else
            tabuleiro[tiro[0]][tiro[1]] = "o";
        //retorna o tabuleiro alterado
        return tabuleiro;
    }//fim da atualizarTabuleiro
    
}//fim da classe 
