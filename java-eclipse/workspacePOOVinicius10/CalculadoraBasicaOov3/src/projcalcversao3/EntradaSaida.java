package projcalcversao3;

import javax.swing.JOptionPane;

public class EntradaSaida {
	//m�todo para entrada de dados do primeiro n�mero
	static int infonum1() {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro n�mero: "));
		return num1;//retorna o n�mero informado pelo usu�rio 
	}
	//m�todo para entrada de dados do segundo n�mero
	static int infonum2() {
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo n�mero: "));
		return num2;
	}
	static int infop() {
		int op = Integer.parseInt(JOptionPane.showInputDialog("Escolha um calculo b�sico: \n"
				+ "1 - Soma \n"
				+ "2 - Subtra��o \n"
				+ "3 - Multlica��o \n"
				+ "4 - Divis�o \n"
				+ "5 - Sair do Programa \n"));
		return op;//Returna  a op��o escolhida pelo usu�rio 
	}
	//m�todo para mostrar o resultado. Este n�o retorna nada.
	static void mostraResultado(String recmsgresult) {
		JOptionPane.showMessageDialog(null,recmsgresult,"resultado",JOptionPane.INFORMATION_MESSAGE);
	}
 }//T�rmino da classe
