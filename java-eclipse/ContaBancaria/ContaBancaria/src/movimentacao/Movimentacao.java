package movimentacao;
import java.util.Date;
public class Movimentacao {
	private int tipo;
	private double valor;
	private Date data;
	
	
	public int getTipo() {
		return this.tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Date getData() {
		return this.data;
	}
	
	public void setDada(Date data) {
		this.data = data;
	}
	
	
}
