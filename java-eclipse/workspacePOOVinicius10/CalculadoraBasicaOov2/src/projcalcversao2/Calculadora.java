package projcalcversao2;

public class Calculadora {

	public static void main(String[] args) {
		
		while (true){
			
			int numero1 = EntradaSaida.infonum1();
			int numero2 = EntradaSaida.infonum2();
			int acao = EntradaSaida.infop();
			/*
			 * Abaixo é criado o objeto "oper", instenciando-o 
			 * para a classe Operacoes. por maio deste objeto,
			 * acessaremos o método calcular() da classe 
			 * operacoea onde, a partir de agora, os cálculos
			 * do programa serão realizados
			 */
			Operacoes oper = new Operacoes();
			String msg = oper.calcular(numero1,numero2,acao);
			/* 
			 * acessando o método mostraResultado, da classe 
			 * EntradaSaida, passando como parametro a 
			 * variável "msg" contendo o resultado do cálculo.
			 */
			EntradaSaida.mostraResultado(msg);
			
		}//Término da estrutura while()
		
	}//Término do método main

}//Término da classe
