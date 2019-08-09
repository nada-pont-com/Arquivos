package marlow;

import javax.swing.JOptionPane;
import java.util.Random;

public class BatalhaNaval {
	
	public static void main(String[] args) {
		
		/*
		 * Manual:
		 * O tabuleiro é formado por 5 linhas e 5 colunas. O computador posiciona 3 navios e o jogador deve
		 * acertá-los no mínimo de jogadas possível. Durante a partida, ao ver o tabuleiro haverão 3 símbolos:
		 * ~ - Local ainda não recebeu tiros
		 * x - acerto
		 * o - erro
		 * Ao fim de cada tiro, o jogador receberá uma dica, indicando quantos navios existem na coluna e linha 
		 * onde o tiro foi realizado, incluindo todos os navios que você já acertou. Ex: Se você deu seu primeiro 
		 * tiro e acertou, e a mensagem disser que há 1 navio naquela linha, quer dizer que você já acertou o único 
		 * navio da linha.  
		 * O jogo acaba quando todos os navios forem acertados.
		 * Em caso de dúvidas, consulte o manual ou o código-fonte.
		 */
	
		//Cria o tabuleiro de 5 linhas e 5 colunas
        String[][] tabuleiro = new String[5][5];
        //Cria uma matriz para armazenar a posição dos navios, sendo a linha referente ao navio (são 3 linhas para 3 navios), 
        //e a segunda conterá a linha e coluna em que ele está (2 colunas, onde a coluna 0 armazena a linha do tabuleiro em 
        //que se encontra o navio e a coluna 1 armazena linha do tabuleiro em que se encontra a coluna do navio)
        //EX: supondo que o primeiro navio esteja em Linha 3 Coluna 1, isso será perceptível da seguinte maneira:
        //navios[0][0] terá o valor 3 (linha 3)
        //navios[0][1] terá o valor 1 (Coluna 1)
        int[][] navios = new int[3][2];
        //Cria matriz que armazenará linha e coluna de cada tiro
        int[] tiro = new int[2];
        //Cria variável para guardar o resultado do tiro
        boolean sucesso;
        //Variáveis para contar as tentativas e os acertos
        int tentativa = 0,
            acertos = 0;
        
        //mensagem inicial
        JOptionPane.showMessageDialog(null, "Argh! Bem vindo à Batalha Naval! \n"
        		+ "Seu objetivo é encontrar 3 navios piratas no menor número de jogadas possíveis. \n"
        		+ "Boa sorte!", "Batalha naval", JOptionPane.INFORMATION_MESSAGE);
        //chama função que prepara o tabuleiro para o jogo
        tabuleiro = inicializarTabuleiro();
        //chama função que posiciona navios em locais aleatorios no tabuleiro
        navios = posicionarNavios();
        
        //mensagem de inicio de jogo
        JOptionPane.showMessageDialog(null, "Iniciando a partida!", "Batalha naval", JOptionPane.INFORMATION_MESSAGE);
        
        //cria repetição para cada jogada
        do {
        	
        	//incrementa valor da tentativa
        	tentativa++;
            
        	//chama função que mostra o tabuleiro
            mostrarTabuleiro(tabuleiro);
            
            //chama função que solicita local do tiro
            tiro = darTiro(tabuleiro, tentativa);
            
            //chama função que verifica se o tiro acertou algum navio 
            sucesso = verificarAcerto(tiro, navios);
            
            //se acertou
            if (sucesso)
            	//incrementa valor de acertos
                acertos++;
            
            //chama função que altera valor inicial (~) para 'o' se errou e 'x' se acertou
            tabuleiro = atualizarTabuleiro(tiro, sucesso, tabuleiro);
            
            //caso o jogador ainda não tenha acertado todos os navios,
            if (acertos != 3)
            	//chama função que dá dica de quantos navios tem na linha e na coluna escolhidas
            	darDica(tiro, navios, tentativa);
            
        //enquanto não acertar os 3 volta ao inicio da repetição
        } while(acertos != 3);
        
        //aviso de fim de jogo
        JOptionPane.showMessageDialog(null, "Jogo terminado. Você acertou os 3 navios em " + tentativa + " tentativas.");
        
    }//fim do main
    
	//função que inicializa o tabuleiro
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
    
    //procedimento que exibe o tabuleiro
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

    //função para posicionar os navios
    static int[][] posicionarNavios(){
    	//instancia randomizador sorteio para colocar os navios em locais aleatórios
        Random sorteio = new Random();
        //cria matriz de navios interna à função
        int[][] navios = new int[3][2];
        
        //para cada navio
        for (int navio = 0; navio < 3; navio++){
        	//sorteia linha e coluna do navio, com valores de 0 a 4, pois é matriz
            navios[navio][0] = sorteio.nextInt(5);
            navios[navio][1] = sorteio.nextInt(5);
        	/*
        	 *validação para colocar navios em 3 locais diferentes
            */
            //repetição para o segundo e terceiro navios
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
        //retorna para a chamada da função
        return navios;
    }//fim da posicionarNavios

    //função que recebe os dados dos tiros
    static int[] darTiro(String[][] tabuleiro, int tentativa){
    	//cria vetor de tiro interno à função
    	int[] tiro = new int[2];
    	//variáveis de linha e coluna do tiro
    	int linha, coluna;
    	//variável para evitar 2 tiros no mesmo local
    	boolean testeErro;
    	
    	//repetição para cada tentativa de tiro
    	do {
    		//informa qual tiro está sendo dado
	    	JOptionPane.showMessageDialog(null, "Tiro " + tentativa);
	        //recebe valor da linha em que se quer atirar
	        linha = Integer.parseInt(JOptionPane.showInputDialog("Linha:"));
	        //decrementa 1 valor pois o vetor/matriz sempre começa da posição 0,
	        //assim, se ele quiser atirar na primeira linha ele terá digitado 1,
	        //mas o programa vai transformar para 0
	        linha--;
	
	        //recebe valor da coluna em que se quer atirar
	        coluna = Integer.parseInt(JOptionPane.showInputDialog("Coluna:"));
	        //idem a "linha--" acima
	        coluna--;
	        
	        //se tiro foi dado em um local inexistente
	        if ((linha<0)||(linha>4)||(coluna<0)||(coluna>4)) {
	        	//avisa que local é inexistente e altera pra true a variável de controle de erro
	            JOptionPane.showMessageDialog(null, "Local inexistente!", "Erro!", JOptionPane.ERROR_MESSAGE);
	            testeErro = true;
	        //senão se o tiro não for em um local com "~"
	        }else if (!tabuleiro[linha][coluna].equals("~")){
		        	//avisa que já atirou nesse lugar e altera pra true a variável de controle de erro
		            JOptionPane.showMessageDialog(null, "Você já atirou neste espaço!", "Erro!", JOptionPane.ERROR_MESSAGE);
		            testeErro = true;
		        } else {//senão altera variável de controle para false
		        	testeErro = false;
		        }
	        
	    //enquanto testeRepeticao for verdadeira, volta ao início da tentativa de tiro    
    	}while (testeErro == true);
    	
    	//coloca posição do tiro em tiro[]
    	tiro[0] = linha;
    	tiro[1] = coluna;
    	//retorna o tiro dado para a chamada da função
    	return tiro;
    }//fim da darTiro
    
    //função que verifica se tiro foi ou não certeiro
    static boolean verificarAcerto(int[] tiro, int[][] navios){
        //para cada navio
        for (int navio = 0; navio < navios.length; navio++){
        	//se a posição do tiro for igual a do navio
            if ((tiro[0] == navios[navio][0]) && (tiro[1] == navios[navio][1])){
            	//diz que acertou, e usa (tiro[x] + 1) para mostrar o local de 1 a 5, não de 0 a 4
            	JOptionPane.showMessageDialog(null, "Você acertou o tiro (" + (tiro[0] + 1) + "," + (tiro[1] + 1) + ")\n");
            	//retorna verdadeiro
                return true;
            }
        }
        //retorna falso, pois se chegar nessa parte do código é porque errou
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
            	//incrementa a contadora de quantos navios estão naquela linha
                linha++;
            //se a coluna do tiro for igual a do navio
            if (navios[fila][1] == tiro[1])
            	//incrementa a contadora de quantos navios estão naquela coluna
                coluna++;
        }
        //mostra dica, e usa (tiro[x] + 1) para mostrar de 1 a 5, não de 0 a 4
        JOptionPane.showMessageDialog(null, "Linha " + (tiro[0] + 1) + " -> " + linha + " navios"
        		+ "\nColuna " + (tiro[1] + 1) + " -> " + coluna + " navios", "Dica " + tentativa + ":", JOptionPane.WARNING_MESSAGE);
    }//fim do darDica

    //função que atualiza o tabuleiro para exibição
    static String[][] atualizarTabuleiro(int[] tiro, boolean sucesso, String[][] tabuleiro){
    	//se acertou tiro
        if(sucesso)
        	//muda no tabuleiro valor da posição onde o tiro foi dado para acerto (x)
            tabuleiro[tiro[0]][tiro[1]] = "x";
        //senao muda pra erro (o)
        else
            tabuleiro[tiro[0]][tiro[1]] = "o";
        //retorna o tabuleiro alterado
        return tabuleiro;
    }//fim da atualizarTabuleiro
    
}//fim da classe 
