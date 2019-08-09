package projcalcversao6;

public class Multiplicacao extends Operacao {
	/*
	 * Abaixo temos um método construtor inicializado os atributos
	 * m_numero1 e m_numero2 assim que a classe Multiplicacao for instenciada
	 * com o uso do "new Multiplicacao()"
	 */
	public Multiplicacao() {
		//Innicializando os atributos
		m_numero1 = 0;
		m_numero2 = 0;
	}//Término do método construtor
	
	//Método que realiza o cálculo da Multiplicacao
	public String calcular() {
		double dResultado = 0;
		String msg = "";
		//perceba que utilizamos os atributos m_numero1 e m_numero2
		dResultado = m_numero1 * m_numero2;
		msg = "A Multiplicacao é: " + dResultado;
		return msg;
	}//Término do método calcular
}//Término da classe Multiplicacao
