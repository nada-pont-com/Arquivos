package projcalcversao6;
/*
 * Abaixo da declaração do classe Soma estamos efetuando o relacionamento
 * por herança com a classe Operacao a partir do extends seguindo o nome da
 * classe Operacao 
 */
public class Soma extends Operacao{
	/*
	 * Abaixo temos um método construtor inicializado os atributos
	 * m_numero1 e m_numero2 assim que a classe Soma for instenciada
	 * com o uso do "new Soma()"
	 */
	public Soma() {
		//Innicializando os atributos
		m_numero1 = 0;
		m_numero2 = 0;
	}//Término do método construtor
	
	//Método que realiza o cálculo da Soma
	public String calcular() {
		double dResultado = 0;
		String msg = "";
		//perceba que utilizamos os atributos m_numero1 e m_numero2
		dResultado = m_numero1+m_numero2;
		msg = "A soma é: " + dResultado;
		return msg;
	}//Término do método calcular
}//Término da classe Soma
