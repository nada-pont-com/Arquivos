package projcalcversao4;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		while(true) {
			int numero1 = EntradaSaida.infonum1();
			int numero2 = EntradaSaida.infonum2();
			int acao = EntradaSaida.infop();
			
			
			/*
			 * Acessa o m�todo local calcular e resultado
			 * do calculo retornado � armazenado na vari�vle msg.
			 */
			
			String msg = calcular(numero1,numero2,acao);
			
			/*
			 * Acessa o m�todo mostraResultado() para
			 * apresentar o resultado final do c�lculo,
			 * retornado pelo m�todo calcular() acima.
			 */
			EntradaSaida.mostraResultado(msg);
			
		}//T�rmino da estrutura while()
		
	}//T�rmino do m�todo main
	
	/*
	* Implementa��o do m�todo local calcular que, por sua vez,
	* encaminha para a execu��o do c�lculo escolhido e recebe
	* o resultado do c�lculo para que seja apresentado.
	*/
	
	
	private static String calcular(int numero1,int numero2,int operacao){
		
		String mens = "";
		switch(operacao) {
		case 1:
			//Cria o objeto soma instanciando-o para a classe Soma
			Soma soma = new Soma();
			/*
			* Acessa o m�todo calcular da classe Soma e o
			* resultado do c�lculo retornado � armazenado
			* na vari�vel mens.
			*/
			mens = soma.calcular(numero1,numero2);
		break;
		case 2:
			//Cria o objeto sub instanciando-o para a classe
			Subtracao sub = new Subtracao();
			/*
			* Acessa o m�todo calcular da classe Subtracao e o
			* resultado do c�lculo retornado � armazenado
			* na vari�vel mens.
			*/
			mens = sub.calcular(numero1,numero2);
		break;
		case 3:
			//Cria o objeto multi instanciando-o para a classe
			Multiplicacao multi = new Multiplicacao();
			/*
			* Acessa o m�todo calcular da classe Multiplicacao e o
			* resultado do c�lculo retornado � armazenado
			* na vari�vel menss.
			*/
			mens = multi.calcular(numero1,numero2);
		break;
		case 4:
			//Cria o objeto divi instanciando-o para a classe Divisao
			Divisao divi = new Divisao();
			/*
			* Acessa o m�todo calcular da classe Divisao e o
			* resultado do c�lculo retornado � armazenado na
			* vari�vel mens.
			*/
			mens = divi.calcular(numero1,numero2);
		break;
		case 5:
			System.exit(0);
		break;
		default:
			JOptionPane.showMessageDialog(null, "Op��o Inexistente","Erro",JOptionPane.INFORMATION_MESSAGE);
			
		break;
		}//T�rmino da estrutura switch()
		//Retorna a mensage, criada
		return mens;
		
	}//T�rmino do m�todo calcular
}//T�rmino da classe Calcular


