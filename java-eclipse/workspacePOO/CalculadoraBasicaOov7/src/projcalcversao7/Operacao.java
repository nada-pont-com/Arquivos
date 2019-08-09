package projcalcversao7;

public abstract class Operacao implements Ioperacao{
	/*
	 * Desclaração dos atributos que serão utilizados pelas classes filhas. Isto evida que 
	 * estas tenham que declará-los de forma repetitiva. Foram declarados com o modificador
	 * protected (protegido), sigmificando que somente as classes filhas poderão fazer uso delas.
	 */
	protected int m_numero1;
	protected int m_numero2;
	/*
	 * Método que recebe os valores a serem armazenados nos atributos m_numero1 e m_numero2
	 */
	public void ajustaValores(int numero1,int numero2) { 
		//Armazena o valor do primeiro número informado pelo usuário no atributo m_numero1
		m_numero1 = numero1;
		//Armazena o valor do segundo número informado pelo usuário no atributo m_numero2
		m_numero2 = numero2;
	}
	/*
	 * Declaração do método abstrato calcular, que o briga as classes filhas a implementá-lo
	 */
	abstract public String calcular();
}
