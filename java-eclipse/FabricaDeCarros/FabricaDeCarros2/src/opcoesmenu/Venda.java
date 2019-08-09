package opcoesmenu;

import javax.swing.JOptionPane;

import classeobjetocarro.Carro;
import classeobjetocarro.ListCarro;

public class Venda {
	public void venderCarros(Carro carro) {
		String tudo = "";
		int cont = 0;
		int venda;
		do{
		for(ListCarro listcarro: carro.getListaDeCarros()) {
			cont++;
			tudo += cont+ " - Modelo: "+ listcarro.getModelo()+"	Cor: "+listcarro.getCor()+"\n";
		}
		venda = (Integer.parseInt( JOptionPane.showInputDialog(null,"Escolha um dos carros:\n"+tudo))-1);
		if(venda<=(cont-1)) {
			carro.getListaDeCarros().remove(venda);
		} else {
			JOptionPane.showMessageDialog(null,"Opção inexistente","Erro",JOptionPane.ERROR_MESSAGE);
		}
		}while(venda > (cont-1));
		
	}
	
}
