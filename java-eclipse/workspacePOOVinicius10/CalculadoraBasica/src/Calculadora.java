/*
 * Importante a classe JOptionPane para utilizar os painéis de diálogo.
 */

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		/*
		 * Enquanto a execução de estrutura não for intertompida,
		 * solicite as entradas de dados para os primerio e segundo números, como também
		 * mostre a opções de operação que pode realizar para, tambem, escolha.
		 * Quando clicar no botão Cancelar ou opção de Sair do programa,
		 * que ainda não foi programada, esta estrutura será interrompida.
		 *
		 */
		while (true) {
			
			int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número : "));
			
			int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número : "));
			
			int acao = Integer.parseInt(JOptionPane.showInputDialog("Escolha um  cálculo básico : \n"
					+ "1 - Soma \n"
					+ "2 - Subtração \n"
					+ "3 - Mutiplicação \n"
					+ "4 - Divisão \n"
					+ "5 - Sair do programa \n"));
			/*
			 * A cada execução da estrutura inicializarmos as variáveis msg e dResultado
			 * respectivamente pois estas são responsaveis pelo resultados
			 * finais processados a cada execução.
			 */
			String msg = " ";
			double dResultado = 0;
			
			switch(acao) {
			case 1:
				dResultado = numero1 + numero2;
				msg = "A soma é:";
			break;
			case 2:
				dResultado = numero1 - numero2;
				msg = "A subtração é :";
			break;
			case 3:
				dResultado = numero1 * numero2;
				msg = "A mutiplicação é:";
			break;
			case 4:
				if(numero2!=0){
					dResultado = numero1/numero2;
					msg = " A divisão é:";
				}else{
					dResultado = 999999999.999999999;
					msg = "Erro de divisão por zero.";
				}
			break;
			case 5:
				System.exit(0);
			break;
			default:
				JOptionPane.showMessageDialog(null,"Opção Inexistente","Erro",JOptionPane.ERROR_MESSAGE);
			break;
			}//Término da estrutura switch()
			/*
			 * Abaixo a intrução que chama o método mostraResultado() passando como
			 * Argumento, ou parâmetro, o conteúdo da variável msg concatenada
			 * com a variável dResultado. Este método é responsavel por exibir o 
			 * resultado, ou saida, do prgrama com o respectivo resultado. 
			 */
			mostraResultado(msg + dResultado);
		}//Término da estrutura while()
	}//Término do método main
	static void mostraResultado(String recmsgdresult) {
		JOptionPane.showMessageDialog(null, recmsgdresult,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}
}//Término da classe Calculadora