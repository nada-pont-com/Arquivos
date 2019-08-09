package projcalcversao7;


/*
 * Abaixo da declaração do classe Divisao estamos efetuando o relacionamento
 * por herança com a classe Operacao a partir do extends seguindo o nome da
 * classe Operacao 
 */
public class Divisao extends Operacao{
	/*
	 * Abaixo temos um método construtor inicializado os atributos
	 * m_numero1 e m_numero2 assim que a classe Divisao for instenciada
	 * com o uso do "new Divisao()"
	 */
	public Divisao() {
		//Innicializando os atributos
		m_numero1 = 0;
		m_numero2 = 0;
	}//Término do método construtor
	
	//Método que realiza o cálculo da Divisao
	public String calcular() {
		double dResultado = 0;
		String msg = "";
		//perceba que utilizamos os atributos m_numero1 e m_numero2
		if(m_numero2!=0) {
		dResultado = m_numero1/m_numero2;
		msg = "A Divisao é: " + dResultado;
		}else {
			dResultado = 999999.99999;
			msg = "Erro de divisao por zero";
		}
		
		return msg;
	}//Término do método calcular
}//Término da classe Divisao
