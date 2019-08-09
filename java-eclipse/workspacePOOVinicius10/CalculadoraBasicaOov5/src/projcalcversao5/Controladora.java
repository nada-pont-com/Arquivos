package projcalcversao5;

import javax.swing.JOptionPane;

public class Controladora {

	public String calcular(int numero1, int numero2,int operacao) {
		
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
		return mens;
	}//T�rmino do m�todo calcular
}//T�rmino da classe 
