package projcalcversao6;

public class Operacao {
	/*
	 * Declaração dos atributos que serão utilizados pelas classes filhas. Isto evita que
	 * estas tenham que cecçará-los de forma repetitivas. forma declaradas com o modificador
	 * protected (protegido), significa que somente as classes filhas poderão fazer uso destes
	 */
	protected int m_numero1;
	protected int m_numero2;
	/*
	 * Método que recebe os valores a serem armazenados nos atridutos m_numero1 e m_numero
	 */
	public void ajustaValores(int numero1,int numero2) {
		//Armazena o valor do primeiro número informado pelo usuário no atributo m_numero1
		m_numero1 = numero1;
		//Armazena o valor do segundo número informado pelo usuário no atributo m_numero2
		m_numero2 = numero2;
	}
}
