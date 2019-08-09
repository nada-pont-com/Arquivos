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
				msg = "A soma dos valores é: ";
			break;
			case "-":
				resultado = subtraiValores(numero1,numero2);
				msg = "A subtração dos valores é: ";
			break;
			case "*":
				resultado = mutiplicaValores(numero1,numero2);
				msg = "A mutiplicação dos valores é: ";
			break;
			case "/":
				if(numero2!=0){
				resultado = divideValores(numero1,numero2);
				msg = "A divisão dos valores é: ";
				}else{
					msg = "Erro de divisão por 0! ";
				}
			break;
			default:
				msg = "Opção inválida";
			break;
		}
		
		mostraResultado(msg + resultado);
	}
	
	static double solicitaValor(String nome){
		return Double.parseDouble(JOptionPane.showInputDialog("Informe o "+ nome + " número:"));
		
	}
	
	static String solicitaCalculo(){
		String opcao = JOptionPane.showInputDialog("Escolha um cálculo"
				+ "\n+ - Soma"
				+ "\n- - Subtração"
				+ "\n* - Mutiplicação"
				+ "\n/ - Divizão");
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
