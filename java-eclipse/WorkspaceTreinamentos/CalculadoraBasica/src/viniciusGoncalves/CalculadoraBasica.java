package viniciusGoncalves;

import javax.swing.JOptionPane;

public class CalculadoraBasica {

	public static void main(String[] args) {

		double numero1,numero2;
		String operacao,msg;
		double resultado = 0;
		
		numero1 = solicitaValor("primeiro");
		operacao = solicitaCalculo();
		numero2 = solicitaValor("segundo");
		
		
		switch(operacao){
			case "+":
				resultado = somaValores(numero1,numero2);
				msg = "A soma dos valores �: ";
			break;
			case "-":
				resultado = subtraiValores(numero1,numero2);
				msg = "A subtra��o dos valores �: ";
			break;
			case "*":
				resultado = mutiplicaValores(numero1,numero2);
				msg = "A mutiplica��o dos valores �: ";
			break;
			case "/":
				if(numero2!=0){
				resultado = divideValores(numero1,numero2);
				msg = "A divis�o dos valores �: ";
				}else{
					msg = "Erro de divis�o por 0! ";
				}
			break;
			default:
				msg = "Op��o inv�lida";
			break;
		}
		
		mostraResultado(msg + resultado);
	}
	
	static double solicitaValor(String nome){
		return Double.parseDouble(JOptionPane.showInputDialog("Informe o "+ nome + " n�mero:"));
		
	}
	
	static String solicitaCalculo(){
		String opcao = JOptionPane.showInputDialog("Escolha um c�lculo"
				+ "\n+ - Soma"
				+ "\n- - Subtra��o"
				+ "\n* - Mutiplica��o"
				+ "\n/ - Diviz�o");
		return opcao;
	}
	
	static double somaValores(double numero1,double numero2){
		double soma = numero1+numero2;
		return soma;
	}
	
	static double mutiplicaValores(double numero1,double numero2){
		return numero1*numero2;
	}
	
	static double subtraiValores(double numero1,double numero2){
		return numero1-numero2;
	}
	
	static double divideValores(double numero1,double numero2){
		return numero1/numero2;
	}
	
	static void mostraResultado(String msgResult){
		JOptionPane.showMessageDialog(null,msgResult,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}

}
