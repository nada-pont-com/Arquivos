package projcalcversao5;

public class Comunicadora {

	public void executar(){

		while (true){
			int numero1 = EntradaSaida.infonum1();
			int numero2 = EntradaSaida.infonum2();
			int acao = EntradaSaida.infop();

			//Cria o objeto controle instanciando-o para classe Controladora
			Controladora controle = new Controladora();
			/*
			 *Acessa o m�todo calcular da classe Controladora e o resultado
			 *do c�lculo retornado � armazenadona varialvel msg.
			 */
			String msg = controle.calcular(numero1,numero2,acao);
			/*
			 *Acessa o m�todo mostraResultado() para apresentar o resultado 
			 *final do c�lculo, retornado pelo m�todo calcular() acima.
			 */

			EntradaSaida.mostraResultado(msg);
			
		}//t�rmino da estrutura while()
	}//t�rmino do m�todo executar()
}
