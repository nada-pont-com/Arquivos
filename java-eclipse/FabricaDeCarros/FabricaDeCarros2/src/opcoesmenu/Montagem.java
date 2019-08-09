package opcoesmenu;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import classeobjetocarro.Carro;
import classeobjetocarro.ListCarro;

public class Montagem {
	public void fabricaCarro(Carro carro) {
		int i;
		int quantCarro = Integer.parseInt(JOptionPane.showInputDialog("Quantos carros deseja frabricar?"));
		if(carro.getListaDeCarros()==null) {
		List<ListCarro> listaDeCarros = new ArrayList();

		for ( i = 0;i <quantCarro;i++) {
			listaDeCarros.add(solicitarCarros(i));
		}
		carro.setListaDeCarros(listaDeCarros);
		} else {
			for(i = 0;i <quantCarro;i++)
			carro.getListaDeCarros().add(solicitarCarros(i));
		}
	}
	
	

	private ListCarro solicitarCarros(int i) {
		ListCarro listcarro = new ListCarro();
		i++;
		String[] listModel = {"Honda","Ferrari","Lamborghini","Nissan"};
		JComboBox model1 = new JComboBox(listModel);
		Object[] message = {"Selecione o modelo do "+(i)+" carro:", model1};
		int modelo1 = JOptionPane.showConfirmDialog(null,message,"Modelo",JOptionPane.OK_CANCEL_OPTION);
		String cor = JOptionPane.showInputDialog("Digite o cor do "+(i)+" carro");
		
		String modelo2 = ajustaModelo(model1.getSelectedIndex());
		listcarro.setCor(cor);
		listcarro.setModelo(modelo2);
		return listcarro;
	}
	
	private String ajustaModelo(int modelo1) {
		String modelo2 = "";
		switch(modelo1){
			case 0:
				modelo2 = "Honda";
			break;
			case 1:
				modelo2 = "Ferrari";
			break;
			case 2:
				modelo2 = "Lamborghini";
			break;
			case 3:
				modelo2 = "Nissan";
			break;
		}
		return  modelo2;
	}
	
	public void mostrarCarros(Carro carro) {
		String tudo = "";
		int cont = 0;
		for(ListCarro listcarro: carro.getListaDeCarros()) {
			cont++;
			tudo += cont+ " - Modelo: "+ listcarro.getModelo()+" Cor: "+listcarro.getCor()+"\n";
		}
		JOptionPane.showMessageDialog(null, "Carros disponiveis:\n"+tudo);
	}

}
