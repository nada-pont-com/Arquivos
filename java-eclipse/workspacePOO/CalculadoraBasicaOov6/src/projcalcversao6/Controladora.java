package projcalcversao6;

import javax.swing.JOptionPane;

public class Controladora {
	public String calcular(int numero1, int numero2,int operacao) {
		String mens = "";
		switch(operacao) {
		case 1:
			//Cria o objeto soma instanciando-o para a classe Soma
			Soma soma = new Soma();
			/*
			* Chama o m�todo ajustaValores da classe M�e Operacao que,
			* por sua vez, recebe os valores num�ricos para serem
			* armazenados nos atributos m_numero1 e m_numero2 declarados
			* nesta classe.
			*/
			soma.ajustaValores(numero1,numero2);
			/*
			* Acessa o m�todo calcular da classe Soma e o resultado
			* do c�lculo retornado � armazenado na vari�vel mens.
			*/
			mens=soma.calcular();
		break;
		case 2:
			//Cria o objeto sub instanciando-o para a classe Subtracao
			Subtracao sub = new Subtracao();
			/*
			* Chama o m�todo ajustaValores da classe M�e Operacao que,
			* por sua vez, recebe os valores num�ricos para serem
			* armazenados nos atributos m_numero1 e m_numero2 declarados
			* nesta classe.
			*/
			sub.ajustaValores(numero1,numero2);
			/*
			* Acessa o m�todo calcular da classe Subtracao e o resultado
			* do c�lculo retornado � armazenado na vari�vel mens.
			*/
			mens = sub.calcular();
		break;
		case 3:
			//Cria o objeto multi instanciando-o para a classe Multiplicacao
			Multiplicacao mult = new Multiplicacao();
			/*
			* Chama o m�todo ajustaValores da classe M�e Operacao que,
			* por sua vez, recebe os valores num�ricos para serem
			* armazenados nos atributos m_numero1 e m_numero2 declarados
			* nesta classe.
			*/
			mult.ajustaValores(numero1,numero2);
			/*
			* Acessa o m�todo calcular da classe Multiplicacao e o
			* resultado do c�lculo retornado � armazenado na vari�vel
			* mens.
			*/
			mens = mult.calcular();
		break;
		case 4:
			//Cria o objeto divi instanciando-o para a classe Divisao
			Divisao divi = new Divisao();
			/*
			* Chama o m�todo ajustaValores da classe M�e Operacao que,
			* por sua vez, recebe os valores num�ricos para serem
			* armazenados nos atributos m_numero1 e m_numero2 declarados
			* nesta classe.
			*/
			divi.ajustaValores(numero1,numero2);
			/*
			* Acessa o m�todo calcular da classe Divisao e o resultado
			* do c�lculo retornado � armazenado na vari�vel mens.
			*/
			mens = divi.calcular();
		break;
		case 5:
			System.exit(0);
		break;
		default:
			JOptionPane.showMessageDialog(null,"Op��o Inexistente","Erro",JOptionPane.INFORMATION_MESSAGE);
		}//T�rmino da estrutura switch()
		
		return mens;
	}//T�rmino dom�todo calcular
}//T�rmino da classe
