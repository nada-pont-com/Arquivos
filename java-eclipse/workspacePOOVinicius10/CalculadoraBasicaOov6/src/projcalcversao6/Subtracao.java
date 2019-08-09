package projcalcversao6;

public class Subtracao extends Operacao {
	/*
	 * Abaixo temos um método construtor inicializado os atributos
	 * m_numero1 e m_numero2 assim que a classe Subtracao for instenciada
	 * com o uso do "new Subtracao()"
	 */
	public Subtracao() {
		//Innicializando os atributos
		m_numero1 = 0;
		m_numero2 = 0;
	}//Término do método construtor
	
	//Método que realiza o cálculo da Subtracao
	public String calcular() {
		double dResultado = 0;
		String msg = "";
		//perceba que utilizamos os atributos m_numero1 e m_numero2
		dResultado = m_numero1 - m_numero2;
		msg = "A Subtracao é: " + dResultado;
		return msg;
	}//Término do método calcular
}//Término da classe Subtracao


