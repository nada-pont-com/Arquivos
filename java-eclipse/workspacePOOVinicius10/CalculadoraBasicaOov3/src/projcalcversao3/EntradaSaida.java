package projcalcversao3;

import javax.swing.JOptionPane;

public class EntradaSaida {
	//método para entrada de dados do primeiro número
	static int infonum1() {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
		return num1;//retorna o número informado pelo usuário 
	}
	//método para entrada de dados do segundo número
	static int infonum2() {
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));
		return num2;
	}
	static int infop() {
		int op = Integer.parseInt(JOptionPane.showInputDialog("Escolha um calculo básico: \n"
				+ "1 - Soma \n"
				+ "2 - Subtração \n"
				+ "3 - Multlicação \n"
				+ "4 - Divisão \n"
				+ "5 - Sair do Programa \n"));
		return op;//Returna  a opção escolhida pelo usuário 
	}
	//método para mostrar o resultado. Este não retorna nada.
	static void mostraResultado(String recmsgresult) {
		JOptionPane.showMessageDialog(null,recmsgresult,"resultado",JOptionPane.INFORMATION_MESSAGE);
	}
 }//Término da classe
