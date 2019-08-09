package projcalcversao7;

import javax.swing.JOptionPane;

public class Controladora {

	public String calcular( int numero1,int numero2,int operacao) {
		String mens = "";
		/*
		 * Abaixo declaramos um objeto chamado oper e dizemos que ele é
		 * do tipo Operacao, ou seja, estamos referenciando este objeto
		 * para a classe Operacao. Este objeto, ao longo da estrutura,
		 * assumirá a referência dos objetos soma, subtracao,
		 * multiplicacao e divisão, conforme o usuário decidiu, para que
		 * no final possamos, a partir dele, encaminhar a execução do
		 * cálculo escolhido pelo usuário. Note que ao declarar este
		 * objeto, inicializamos o mesmo como null, para que este possa
		 * assumir a forma dos objetos de operação citados.
		 */
		Operacao oper = null;
		switch(operacao) {
		case 1:
			//Cria o objeto soma instanciando-o para a classe Soma
			Soma soma = new Soma();
			/*
			 * Atribui ao objeto oper o objeto soma, ou seja,
			 * passamos para este objeto o poder de acesso a
			 * classe Soma.
			 */
			oper = soma;
			break;
		case 2:
			//Cria o objeto sub instanciando-o para a classe Subtracao
			Subtracao sub = new Subtracao();
			/*
			 * Atribui ao objeto oper o objeto sub, ou seja,
			 * passamos para este objeto o poder de acesso a
			 * classe Subtracao.
			 */
			oper = sub;
			break;
		case 3:
			//Cria o objeto multi instanciando-o para a classe Multiplicacao
			Multiplicacao multi = new Multiplicacao();
			/*
			 * Atribui ao objeto oper o objeto multi, ou seja,
			 * passamos para este objeto o poder de acesso a
			 * classe Multiplicacao.
			 */
			oper = multi;
			break;
		case 4:
			//Cria o objeto divi instanciando-o para a classe Divisao
			Divisao divi = new Divisao();
			/*
			 * Atribui ao objeto oper o objeto divi, ou seja,
			 * passamos para este objeto o poder de acesso a
			 * classe Divisao.
			 */
			oper = divi;
			break;
		case 5:
			System.exit(0);
			break;
		default:
			JOptionPane.showMessageDialog(null,"Opção Inexistente","Erro",JOptionPane.INFORMATION_MESSAGE);
			break;
		}//término da estrutura switch()
		//Verifica se o objeto oper é diferente de nulo.
		if(oper != null) {
			/*
			 * Chama o método ajustaValor() da classe Operacao, por
			 * meio do objeto oper. Lembre-se este objeto foi declarado
			 * com o tipo Operacao, e neste ponto do programa já assumiu
			 * a referência de um dos objetos de operação, soma ou sub
			 * ou multi ou divi, que por sua vez, estão apontando para
			 * suas respectivas classes, Soma ou Subtracao ou
			 * Multiplicacao ou Divisao, que, também por sua vez, são
			 * classes filhas da classe Operacao, por isso é possível
			 * acessar
			 */
			oper.ajustaValores(numero1,numero2);
			/*
			 * Acessa o método calcular da classe Soma ou Subtracao ou
			 * Multiplicacao ou Divisao, ou seja, conforme o objeto que
			 * oper está armazenando no momento.
			 * O resultado do cálculo retornado é armazenado na variável
			 * mens.
			 */
			mens = oper.calcular();

		}//término da estrutura if()
		return mens;
	}//Término do método calcular
}
