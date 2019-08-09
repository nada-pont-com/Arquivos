package projcalcversao3;
import javax.swing.JOptionPane;
public class Operacoes {
	//Declerando o método dinamico calcular().
	public String calcular(int num1, int num2,int operacao){
		String msg = "";
		double dResultado = 0;
		
			switch (operacao) {
			case 1:
				dResultado = num1+num2;
				msg = "A soma é:" ;
			break ;
			case 2:
				dResultado = num1-num2;
				msg = "A subtração é:" ;
			break ;
			case 3:
				dResultado = num1*num2;
				msg = "A multiplicação é:" ;
			break ;
			case 4:
				if (num2 != 0){
					dResultado = num1/num2;
					msg = "A divisão é:" ;
				} else {
					dResultado = 999999999.999999999;
					msg= "Erro de divisão por zero" ;
				}
			break ;
			case 5:
				System. exit (0);
			break ;
			default:
				JOptionPane.showMessageDialog(null,"Opção inexistente","Erro",JOptionPane.ERROR_MESSAGE);
			break;
			
			}//término da estrutura switch()
			
		//Retorna a mensagem concatenada com o valor do resultado.
		return (msg+" "+dResultado);
	}
}
