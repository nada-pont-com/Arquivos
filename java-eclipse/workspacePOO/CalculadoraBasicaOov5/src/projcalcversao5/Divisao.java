package projcalcversao5;

public class Divisao {
	public String calcular(int num1,int num2) {
		int dResultado = 0;
		String msg = "";
		if(num2!=0) {
			dResultado = num1/num2;
			msg = "A divisão é : "+dResultado;		
		}else {
			dResultado = 999999999;
			msg = "Erro de divisão por zero";
		}
		return msg;
		}	
}
