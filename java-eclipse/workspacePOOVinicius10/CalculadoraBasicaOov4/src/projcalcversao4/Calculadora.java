package projcalcversao4;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		while(true) {
			int numero1 = EntradaSaida.infonum1();
			int numero2 = EntradaSaida.infonum2();
			int acao = EntradaSaida.infop();
			
			
			/*
			 * Acessa o método local calcular e resultado
			 * do calculo retornado é armazenado na variávle msg.
			 */
			
			String msg = calcular(numero1,numero2,acao);
			
			/*
			 * Acessa o método mostraResultado() para
			 * apresentar o resultado final do cálculo,
			 * retornado pelo método calcular() acima.
			 */
			EntradaSaida.mostraResultado(msg);
			
		}//Término da estrutura while()
		
	}//Término do método main
	
	/*
	* Implementação do método local calcular que, por sua vez,
	* encaminha para a execução do cálculo escolhido e recebe
	* o resultado do cálculo para que seja apresentado.
	*/
	
	
	private static String calcular(int numero1,int numero2,int operacao){
		
		String mens = "";
		switch(operacao) {
		case 1:
			//Cria o objeto soma instanciando-o para a classe Soma
			Soma soma = new Soma();
			/*
			* Acessa o método calcular da classe Soma e o
			* resultado do cálculo retornado é armazenado
			* na variável mens.
			*/
			mens = soma.calcular(numero1,numero2);
		break;
		case 2:
			//Cria o objeto sub instanciando-o para a classe
			Subtracao sub = new Subtracao();
			/*
			* Acessa o método calcular da classe Subtracao e o
			* resultado do cálculo retornado é armazenado
			* na variável mens.
			*/
			mens = sub.calcular(numero1,numero2);
		break;
		case 3:
			//Cria o objeto multi instanciando-o para a classe
			Multiplicacao multi = new Multiplicacao();
			/*
			* Acessa o método calcular da classe Multiplicacao e o
			* resultado do cálculo retornado é armazenado
			* na variável menss.
			*/
			mens = multi.calcular(numero1,numero2);
		break;
		case 4:
			//Cria o objeto divi instanciando-o para a classe Divisao
			Divisao divi = new Divisao();
			/*
			* Acessa o método calcular da classe Divisao e o
			* resultado do cálculo retornado é armazenado na
			* variável mens.
			*/
			mens = divi.calcular(numero1,numero2);
		break;
		case 5:
			System.exit(0);
		break;
		default:
			JOptionPane.showMessageDialog(null, "Opção Inexistente","Erro",JOptionPane.INFORMATION_MESSAGE);
			
		break;
		}//Término da estrutura switch()
		//Retorna a mensage, criada
		return mens;
		
	}//Término do método calcular
}//Término da classe Calcular


