package projcalcversao2;

public class Calculadora {

	public static void main(String[] args) {
		
		while (true){
			
			int numero1 = EntradaSaida.infonum1();
			int numero2 = EntradaSaida.infonum2();
			int acao = EntradaSaida.infop();
			/*
			 * Abaixo � criado o objeto "oper", instenciando-o 
			 * para a classe Operacoes. por maio deste objeto,
			 * acessaremos o m�todo calcular() da classe 
			 * operacoea onde, a partir de agora, os c�lculos
			 * do programa ser�o realizados
			 */
			Operacoes oper = new Operacoes();
			String msg = oper.calcular(numero1,numero2,acao);
			/* 
			 * acessando o m�todo mostraResultado, da classe 
			 * EntradaSaida, passando como parametro a 
			 * vari�vel "msg" contendo o resultado do c�lculo.
			 */
			EntradaSaida.mostraResultado(msg);
			
		}//T�rmino da estrutura while()
		
	}//T�rmino do m�todo main

}//T�rmino da classe
