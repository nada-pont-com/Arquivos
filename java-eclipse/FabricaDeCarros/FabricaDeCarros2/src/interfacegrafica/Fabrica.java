package interfacegrafica;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import opcoesmenu.Montagem;
import opcoesmenu.Venda;
import classeobjetocarro.Carro;
import classeobjetocarro.ListCarro;
public class Fabrica {
	public void menu() {  
		Carro carro = new Carro();
		Montagem montagem = new Montagem();
		
		while(true) {
			int acao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções: \n"
					+ "1 - Fabricar carro\n"
					+ "2 - Vender carro\n"
					+ "3 - Mostrar carros disponiveis\n"
					+ "4 - Sair"));
			
			switch(acao) {
			case 1:
				montagem.fabricaCarro(carro);
			break;
			case 2:
				Venda venda = new Venda();
				venda.venderCarros(carro);
			break;
			case 3:
				montagem.mostrarCarros(carro);
			break;
			case 4:
				System.exit(0);
			break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inexistente!","Erro",JOptionPane.ERROR_MESSAGE);
			break;
			}
			
		}
	}
}
