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
			 *Acessa o método calcular da classe Controladora e o resultado
			 *do cálculo retornado é armazenadona varialvel msg.
			 */
			String msg = controle.calcular(numero1,numero2,acao);
			/*
			 *Acessa o método mostraResultado() para apresentar o resultado 
			 *final do cálculo, retornado pelo método calcular() acima.
			 */

			EntradaSaida.mostraResultado(msg);
			
		}//término da estrutura while()
	}//término do método executar()
}
