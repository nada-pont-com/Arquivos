package projcalcversao7;

public abstract class Operacao implements Ioperacao{
	/*
	 * Desclara��o dos atributos que ser�o utilizados pelas classes filhas. Isto evida que 
	 * estas tenham que declar�-los de forma repetitiva. Foram declarados com o modificador
	 * protected (protegido), sigmificando que somente as classes filhas poder�o fazer uso delas.
	 */
	protected int m_numero1;
	protected int m_numero2;
	/*
	 * M�todo que recebe os valores a serem armazenados nos atributos m_numero1 e m_numero2
	 */
	public void ajustaValores(int numero1,int numero2) { 
		//Armazena o valor do primeiro n�mero informado pelo usu�rio no atributo m_numero1
		m_numero1 = numero1;
		//Armazena o valor do segundo n�mero informado pelo usu�rio no atributo m_numero2
		m_numero2 = numero2;
	}
	/*
	 * Declara��o do m�todo abstrato calcular, que o briga as classes filhas a implement�-lo
	 */
	abstract public String calcular();
}
