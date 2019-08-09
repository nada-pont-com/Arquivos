package fabrica;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import classeobjetocarro.Carro;
import interfacegrafica.Acao;
public class Fabrica {
	
	private List<Carro> listaDeCarros;
	
	public void setListaDeCarros(List<Carro> listaDeCarros) {
		this.listaDeCarros = listaDeCarros;
	}
	
	public List<Carro> getListaDeCarros() {
		return listaDeCarros;
	}
	public void fabricaCarro() {
		Acao acao = new Acao();
		int i;
		int quantCarro = Integer.parseInt(JOptionPane.showInputDialog("Quantos carros deseja frabricar?"));
		if(getListaDeCarros()==null) {
		List<Carro> listaDeCarros = new ArrayList<Carro>();

		for ( i = 0;i <quantCarro;i++) {
			listaDeCarros.add(acao.solicitarCarros(i));
		}
			setListaDeCarros(listaDeCarros);
		} else {
			for(i = 0;i <quantCarro;i++)
			getListaDeCarros().add(acao.solicitarCarros(i));
		}
	}
	public void venderCarros(Fabrica fabrica) {
		int cont = 0;
		if((fabrica.getListaDeCarros()==null)||(fabrica.getListaDeCarros().isEmpty())) {
			JOptionPane.showMessageDialog(null, "Não a carros disponiveis","Não a carros",JOptionPane.WARNING_MESSAGE);
		}else {
				int totalDeCarros = fabrica.getListaDeCarros().size();
				String[] listCarros = new String[totalDeCarros];
				
				for(Carro carro: fabrica.getListaDeCarros()) {
					listCarros[cont] ="Modelo: "+ carro.getModelo()+"    Cor: "+carro.getCor();
					cont++;
				}
				
				JComboBox<Object> venda  = new JComboBox<Object>(listCarros);
				Object[] msg = {"Carros: ",venda};
				int option = JOptionPane.showConfirmDialog(null, msg,"Venda",JOptionPane.OK_CANCEL_OPTION);
				if(option == JOptionPane.OK_OPTION) {
					fabrica.getListaDeCarros().remove(venda.getSelectedIndex());
				}
			
		}

	}
	


	
	
}
