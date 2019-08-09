package projcalcversao3;
import javax.swing.JOptionPane;
public class Operacoes {
	//Declerando o m�todo dinamico calcular().
	public String calcular(int num1, int num2,int operacao){
		String msg = "";
		double dResultado = 0;
		
			switch (operacao) {
			case 1:
				dResultado = num1+num2;
				msg = "A soma �:" ;
			break ;
			case 2:
				dResultado = num1-num2;
				msg = "A subtra��o �:" ;
			break ;
			case 3:
				dResultado = num1*num2;
				msg = "A multiplica��o �:" ;
			break ;
			case 4:
				if (num2 != 0){
					dResultado = num1/num2;
					msg = "A divis�o �:" ;
				} else {
					dResultado = 999999999.999999999;
					msg= "Erro de divis�o por zero" ;
				}
			break ;
			case 5:
				System. exit (0);
			break ;
			default:
				JOptionPane.showMessageDialog(null,"Op��o inexistente","Erro",JOptionPane.ERROR_MESSAGE);
			break;
			
			}//t�rmino da estrutura switch()
			
		//Retorna a mensagem concatenada com o valor do resultado.
		return (msg+" "+dResultado);
	}
}
