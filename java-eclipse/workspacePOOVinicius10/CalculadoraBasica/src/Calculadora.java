/*
 * Importante a classe JOptionPane para utilizar os pain�is de di�logo.
 */

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		/*
		 * Enquanto a execu��o de estrutura n�o for intertompida,
		 * solicite as entradas de dados para os primerio e segundo n�meros, como tamb�m
		 * mostre a op��es de opera��o que pode realizar para, tambem, escolha.
		 * Quando clicar no bot�o Cancelar ou op��o de Sair do programa,
		 * que ainda n�o foi programada, esta estrutura ser� interrompida.
		 *
		 */
		while (true) {
			
			int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro n�mero : "));
			
			int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo n�mero : "));
			
			int acao = Integer.parseInt(JOptionPane.showInputDialog("Escolha um  c�lculo b�sico : \n"
					+ "1 - Soma \n"
					+ "2 - Subtra��o \n"
					+ "3 - Mutiplica��o \n"
					+ "4 - Divis�o \n"
					+ "5 - Sair do programa \n"));
			/*
			 * A cada execu��o da estrutura inicializarmos as vari�veis msg e dResultado
			 * respectivamente pois estas s�o responsaveis pelo resultados
			 * finais processados a cada execu��o.
			 */
			String msg = " ";
			double dResultado = 0;
			
			switch(acao) {
			case 1:
				dResultado = numero1 + numero2;
				msg = "A soma �:";
			break;
			case 2:
				dResultado = numero1 - numero2;
				msg = "A subtra��o � :";
			break;
			case 3:
				dResultado = numero1 * numero2;
				msg = "A mutiplica��o �:";
			break;
			case 4:
				if(numero2!=0){
					dResultado = numero1/numero2;
					msg = " A divis�o �:";
				}else{
					dResultado = 999999999.999999999;
					msg = "Erro de divis�o por zero.";
				}
			break;
			case 5:
				System.exit(0);
			break;
			default:
				JOptionPane.showMessageDialog(null,"Op��o Inexistente","Erro",JOptionPane.ERROR_MESSAGE);
			break;
			}//T�rmino da estrutura switch()
			/*
			 * Abaixo a intru��o que chama o m�todo mostraResultado() passando como
			 * Argumento, ou par�metro, o conte�do da vari�vel msg concatenada
			 * com a vari�vel dResultado. Este m�todo � responsavel por exibir o 
			 * resultado, ou saida, do prgrama com o respectivo resultado. 
			 */
			mostraResultado(msg + dResultado);
		}//T�rmino da estrutura while()
	}//T�rmino do m�todo main
	static void mostraResultado(String recmsgdresult) {
		JOptionPane.showMessageDialog(null, recmsgdresult,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}
}//T�rmino da classe Calculadora