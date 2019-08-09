package projcalcversao6;

public class Operacao {
	/*
	 * Declara��o dos atributos que ser�o utilizados pelas classes filhas. Isto evita que
	 * estas tenham que cec�ar�-los de forma repetitivas. forma declaradas com o modificador
	 * protected (protegido), significa que somente as classes filhas poder�o fazer uso destes
	 */
	protected int m_numero1;
	protected int m_numero2;
	/*
	 * M�todo que recebe os valores a serem armazenados nos atridutos m_numero1 e m_numero
	 */
	public void ajustaValores(int numero1,int numero2) {
		//Armazena o valor do primeiro n�mero informado pelo usu�rio no atributo m_numero1
		m_numero1 = numero1;
		//Armazena o valor do segundo n�mero informado pelo usu�rio no atributo m_numero2
		m_numero2 = numero2;
	}
}
