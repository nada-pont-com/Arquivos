package conta;
import java.util.List;

import javax.swing.JOptionPane;

import movimentacao.Movimentacao;
public class Conta {

	private String titularDaConta;
	private int tipo;
	private double saldo;
	private List<Movimentacao> listaDeMovimentacao;
	
	public Conta() {
		saldo = 0;
	}
	public String getTitularDaConta() {
		return this.titularDaConta;
	}
	
	public void setTitularDaConta(String titularDaConta) {
		this.titularDaConta = titularDaConta;
	}
	
	public int getTipo() {
		return this.tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	
	public List<Movimentacao> getListaDeMovimentacao(){
		return this.listaDeMovimentacao;
	}
	public void setListaDeMovimentacao(List<Movimentacao> listaDeMovimentacao) {
		this.listaDeMovimentacao = listaDeMovimentacao;
	}
	
	public void depositar(double deposito) {
		double valorAnterior = this.saldo;
		double depositado = deposito+valorAnterior;
		this.saldo = depositado;
	}
	
	public int sacar(double saque) { 
		double saqueado = this.saldo-saque;
		int erro = 0;
		if(saqueado<-1000) {
			JOptionPane.showMessageDialog(null, "Erro ao tentar sacar, saldo indisponivel!","Erro",JOptionPane.ERROR_MESSAGE);
			erro = 2;
		}else {
			this.saldo = saqueado;
			erro = 0;
		}
		return erro;
	}
	
	public double consultarSaldo() {
		return this.saldo;
	}
	
	public String gerarExtrato() {
		String extrato = "";
		extrato +="Nome: "+titularDaConta+"\n";
		
		if(tipo==0)
			extrato+="Tipo: Conta Poupança";
		
		else
			extrato+="Tipo: Conta Corrente";
		
		extrato+="\n"+"Saldo atual: "+saldo+"\n\n";
		for(Movimentacao movi : listaDeMovimentacao) {
			if(movi.getTipo()==1) 
				extrato += "Data do movimento: "+movi.getData()+"    Tipo do movimento: Saque    Valor do movimento: "+movi.getValor()+"\n";
			else
				extrato += "Data do movimento: "+movi.getData()+"    Tipo do movimento: Deposito    Valor do movimento: "+movi.getValor()+"\n";
			
		}
		return extrato;
	}
	
	public String gerarExtratoDepositos() {
		String extrato = "";
		for(Movimentacao movi : listaDeMovimentacao) {
			if(movi.getTipo()==2)
			extrato += "Data do movimento: "+movi.getData()+"    Tipo do movimento: Deposito    Valor do movimento: "+movi.getValor()+"\n";
		}
		if(extrato.equals("")) {
			extrato = "Não a nem um registro de deposito!";
		}else {
			extrato ="Nome: "+titularDaConta+"\n"+extrato;

			if(tipo==0)
				extrato="Tipo: Conta Poupança"+extrato;

			else
				extrato="Tipo: Conta Corrente"+extrato;

			extrato="\n"+"Saldo atual: "+saldo+"\n\n"+extrato;
		}
		return extrato;
	}
	
	public String gerarExtratoSaques() {
		String extrato = "";
		for(Movimentacao movi : listaDeMovimentacao) {
			if(movi.getTipo()==1)
			extrato += "Data do movimento: "+movi.getData()+"    Tipo do movimento: Saque    Valor do movimento: "+movi.getValor()+"\n";
		}
		if(extrato.equals("")) {
			extrato = "Não a nem um registro de saque!";
		}else {
			extrato ="Nome: "+titularDaConta+"\n"+extrato;

			if(tipo==0)
				extrato="Tipo: Conta Poupança"+extrato;

			else
				extrato="Tipo: Conta Corrente"+extrato;

			extrato="\n"+"Saldo atual: "+saldo+"\n\n"+extrato;
		}
		return extrato;
	}
}
