package interfacegrafica;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import conta.Conta;
import movimentacao.Movimentacao;

public class InterfaceGrafica {
	
	public void exibirMenu() {
		Conta conta = new Conta();
		dadosDaConta(conta);
		List<Movimentacao> listaDeMovimentacoes = new ArrayList<Movimentacao>();
		Movimentacao movimento = new Movimentacao();
		conta.setListaDeMovimentacao(listaDeMovimentacoes);
		while(true) {
			int opcao =Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções abaixo:\n"+
					"1 - Informacoes do Deposito\n" + 
					"2 - Informacoes do Saque\n" + 
					"3 - Dados Da Conta\n" +
					"4 - Consultar Saldo\n" + 
					"5 - Extrato Completo\n" + 
					"6 - Extrato De Depositos\n" + 
					"7 - Extrato De Saques\n"+
					"8 - Sair"));
			
			switch(opcao) {
			case 1:
				listaDeMovimentacoes.add(solicitarInformacoesDeposito(conta,movimento));
				break;
			case 2:
				listaDeMovimentacoes.add(solicitarInformacoesSaque(conta,movimento));
				antiErro(conta);
				break;
			case 3:
				exibirDadosDaConta(conta);
				break;
			case 4:
				mostrarSaldo(conta);
				break;
			case 5:
				exibirExtratoCompleto(conta);
				break;
			case 6:
				exibirExtratoDeDeposito(conta);
				break;
			case 7:
				exibirExtratoDeSaque(conta);
				break;
			case 8:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inexistente!","Erro",JOptionPane.ERROR_MESSAGE);
				break;
				
			}
		}

	}
	
	
	private void dadosDaConta(Conta conta) {
		conta.setTitularDaConta(JOptionPane.showInputDialog("Digite o nome do titular da conta:"));
		
		String[] tipoCont = {"Conta Poupança","Conta Corrente"};
		JComboBox<String> tipoConta = new JComboBox<String>(tipoCont);
		
		Object[] message = {"Escolha o tipo de conta da conta:",tipoConta};
		
		JOptionPane.showMessageDialog(null,message);
		conta.setTipo(tipoConta.getSelectedIndex());
	}


	private Movimentacao solicitarInformacoesDeposito(Conta conta,Movimentacao movimento) {
		double deposito = 0;
		int verif = 0;
		do {
			deposito = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantia que deseja depositar:"));
			verif = verifica(deposito);
		}while(verif==2);
		conta.depositar(deposito);
		Date data = new Date();
		return (movimenta(data, 2, deposito));
	}

	private Movimentacao solicitarInformacoesSaque(Conta conta,Movimentacao movimento) {
		int verif = 0;
		double saque = 0;
		do {
			saque = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantia que deseja depositar:"));
			verif = verifica(saque);
		}while(verif==2);
		int erro = conta.sacar(saque);
		Date data = new Date(); 
		if(erro==0) {
			movimento=movimenta(data, 1, (saque));
		}else {
			movimento=movimenta(data, 3, (saque));
		}
		return movimento; 
	}
	
	private void antiErro(Conta conta) {
		int cont = 0; 
		for(Movimentacao movi : conta.getListaDeMovimentacao()) {
			if(movi.getTipo()==3) {
				conta.getListaDeMovimentacao().remove(cont);
				break;
			}
			cont++;
		}
	}
	
	private int verifica(double valor) {
		int erro = 1;
		if(valor < 0) {
			erro = 2;
			JOptionPane.showMessageDialog(null,"Erro \nValor invalido, Tente novamente!","ERRO!",JOptionPane.ERROR_MESSAGE);
		}
		return erro;
	}
	
	
	private void exibirDadosDaConta(Conta conta) {
		String tudo = "Titular: "+(conta.getTitularDaConta());
		if(conta.getTipo()==0)
			tudo+="\nTipo: Conta Poupança";
		else
			tudo+="\nTipo: Conta Corrente";	
		tudo+= "\nSaldo: "+(conta.consultarSaldo());
		JOptionPane.showMessageDialog(null, tudo);
	}

	private void mostrarSaldo(Conta conta) {
		JOptionPane.showMessageDialog(null, "Saldo: "+conta.consultarSaldo());
	}
	
	private void exibirExtratoCompleto(Conta conta) {
		JOptionPane.showMessageDialog(null,conta.gerarExtrato());
	}

	private void exibirExtratoDeDeposito(Conta conta) {
		String extrato=conta.gerarExtratoDepositos();
		if(extrato.equals("Não a nem um registro de deposito!"))
			JOptionPane.showMessageDialog(null,extrato,"Não a Depositos",JOptionPane.WARNING_MESSAGE);
		else {
			JOptionPane.showMessageDialog(null,extrato,"Extrato dos Depositos",JOptionPane.INFORMATION_MESSAGE);
		}
	}

	private void exibirExtratoDeSaque(Conta conta) {
		String extrato=conta.gerarExtratoSaques();
		if(extrato.equals("Não a nem um registro de saque!"))
			JOptionPane.showMessageDialog(null,extrato,"Não a Saques",JOptionPane.WARNING_MESSAGE);
		else {
			JOptionPane.showMessageDialog(null,extrato,"Extrato dos Saques",JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	
	private Movimentacao movimenta(Date data,int tipo,double valor) {
		Movimentacao movimenta = new Movimentacao();
		movimenta.setDada(data);
		movimenta.setTipo(tipo);
		movimenta.setValor(valor);
		return movimenta;
	}
	
}
