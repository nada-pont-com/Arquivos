package projcalcversao6;
/*
 * Abaixo da declara��o do classe Soma estamos efetuando o relacionamento
 * por heran�a com a classe Operacao a partir do extends seguindo o nome da
 * classe Operacao 
 */
public class Soma extends Operacao{
	/*
	 * Abaixo temos um m�todo construtor inicializado os atributos
	 * m_numero1 e m_numero2 assim que a classe Soma for instenciada
	 * com o uso do "new Soma()"
	 */
	public Soma() {
		//Innicializando os atributos
		m_numero1 = 0;
		m_numero2 = 0;
	}//T�rmino do m�todo construtor
	
	//M�todo que realiza o c�lculo da Soma
	public String calcular() {
		double dResultado = 0;
		String msg = "";
		//perceba que utilizamos os atributos m_numero1 e m_numero2
		dResultado = m_numero1+m_numero2;
		msg = "A soma �: " + dResultado;
		return msg;
	}//T�rmino do m�todo calcular
}//T�rmino da classe Soma
