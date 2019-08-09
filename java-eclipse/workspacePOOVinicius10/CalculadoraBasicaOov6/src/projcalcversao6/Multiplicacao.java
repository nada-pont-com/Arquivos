package projcalcversao6;

public class Multiplicacao extends Operacao {
	/*
	 * Abaixo temos um m�todo construtor inicializado os atributos
	 * m_numero1 e m_numero2 assim que a classe Multiplicacao for instenciada
	 * com o uso do "new Multiplicacao()"
	 */
	public Multiplicacao() {
		//Innicializando os atributos
		m_numero1 = 0;
		m_numero2 = 0;
	}//T�rmino do m�todo construtor
	
	//M�todo que realiza o c�lculo da Multiplicacao
	public String calcular() {
		double dResultado = 0;
		String msg = "";
		//perceba que utilizamos os atributos m_numero1 e m_numero2
		dResultado = m_numero1 * m_numero2;
		msg = "A Multiplicacao �: " + dResultado;
		return msg;
	}//T�rmino do m�todo calcular
}//T�rmino da classe Multiplicacao
