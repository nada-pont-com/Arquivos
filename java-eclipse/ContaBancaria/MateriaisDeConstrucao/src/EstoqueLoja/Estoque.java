package EstoqueLoja;

import java.util.List;

import javax.swing.JOptionPane;

import produto.Produto;

public class Estoque {

	private List<Produto> listaDePodutos; 
	
	public List<Produto> getListaDeProdutos() {
		return this.listaDePodutos;
	}
	public void setListaDeProdutos(List<Produto> listaDeProdutos) {
		this.listaDePodutos = listaDeProdutos;
	}
	
	public void adicionar() {
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo do produto: "));
		int quantidade = 0,verifica = 0;
		if(getListaDeProdutos()==null)
			JOptionPane.showMessageDialog(null, "N�o a nem um produto cadastrado!","N�o a produtos!",JOptionPane.ERROR_MESSAGE);
		else
			for (Produto prod : getListaDeProdutos()) {
				if(prod.getCodigo()==codigo) {
					JOptionPane.showMessageDialog(null, "Produto encontado: "+prod.getNome());
					quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade do produto: "));
					int quantAnt = prod.getQuant();
					prod.setQuant(quantidade+quantAnt);
					verifica = 2;
					break;
				}
			}
		if(verifica==0) {
			JOptionPane.showMessageDialog(null, "N�o a nem um produto com esse codigo!","Codigo n�o encontrado!",JOptionPane.WARNING_MESSAGE);
		}
	}

}
