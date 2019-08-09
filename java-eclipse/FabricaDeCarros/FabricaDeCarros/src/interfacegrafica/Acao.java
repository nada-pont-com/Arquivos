package interfacegrafica;

import javax.swing.JOptionPane;

import classeobjetocarro.Carro;
import fabrica.Fabrica;

public class Acao {

	public void menu() {  
		Fabrica fabrica = new Fabrica();
		while(true) {
			int acao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções: \n"
					+ "1 - Fabricar carro\n"
					+ "2 - Vender carro\n"
					+ "3 - Mostrar carros disponiveis\n"
					+ "4 - Sair"));

			switch(acao) {
			case 1:
				fabrica.fabricaCarro();
				break;
			case 2:
				fabrica.venderCarros(fabrica);
				break;
			case 3:
				mostrarCarros(fabrica);
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





	public Carro solicitarCarros(int i) {
		Carro carro = new Carro();
		i++;
		String modelo = JOptionPane.showInputDialog("Digite o modelo do "+(i)+" carro");
		String cor = JOptionPane.showInputDialog("Digite o cor do "+(i)+" carro");

		carro.setModelo(modelo);
		carro.setCor(cor);
		return carro;
	}

	private void mostrarCarros(Fabrica fabrica) {
		String tudo = "";
		int cont = 0;
		if((fabrica.getListaDeCarros() == null)||(fabrica.getListaDeCarros().isEmpty())) {
			JOptionPane.showMessageDialog(null, "Não a carros disponiveis","Nada aqui",JOptionPane.WARNING_MESSAGE);
		}else {
			for(Carro carro: fabrica.getListaDeCarros()) {
				cont++;
				tudo += cont+ " - Modelo: "+ carro.getModelo()+" Cor: "+carro.getCor()+"\n";
			}
			JOptionPane.showMessageDialog(null, "Carros disponiveis:\n"+tudo);
		}
	}
}
