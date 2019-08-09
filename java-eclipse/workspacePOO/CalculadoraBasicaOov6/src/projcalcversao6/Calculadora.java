package projcalcversao6;


public class Calculadora {

	public static void main(String[] args) {
		//cria o objeto comunica iniciando-o para a classe comunicadora 
		Comunicadora comunica = new Comunicadora();
		
		/*
		 * Acessa o método axecultar da classe comunicadora
		 * por intermédio do objeto comunica 
		 */
		
		comunica.executar();

	}

}
