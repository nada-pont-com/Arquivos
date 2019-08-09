import javax.swing.JOptionPane;



public class NovatoEmJava {

	public static void main(String[] args) {
//		System.out.println("Prudutivo!");
		
/*		JOptionPane.showMessageDialog(null, "Produtivo!","Informação", JOptionPane.INFORMATION_MESSAGE);*/
	
		/*int numero = 1;
		JOptionPane.showMessageDialog(null, numero, "O valor é", JOptionPane.INFORMATION_MESSAGE);*/
		/*
		int n1 = 999;
		int n2 = 1;
		int resultado = n1 + n2;
		JOptionPane.showMessageDialog(null, "O resultado é: "+resultado, "Soma Basica", JOptionPane.INFORMATION_MESSAGE);
		*/
		/*
		String nome  = "Nome";
		String sobrenome = "Sobrenome";
		String nomeCompleto = nome + " " + sobrenome;
		JOptionPane.showMessageDialog(null, nomeCompleto);
		*/
		/*
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		JOptionPane.showMessageDialog(null, numero);
		*/
		/*
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número!"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero!"));
		double resultado = n1+n2;
		JOptionPane.showMessageDialog(null, resultado);
		*/
		/*
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
		if (numero>0){
			JOptionPane.showMessageDialog(null, "Possitvo");
		}else if (numero<0){
			JOptionPane.showMessageDialog(null, "Negativo" );
		}else if (numero==0){
			JOptionPane.showMessageDialog(null, "Nulo");
		}
		*/
		/*
		double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota:"));
		if ((nota < 0)||(nota > 10)){
			JOptionPane.showMessageDialog(null,"Valor invalido!");
		}else if((nota >= 0)&&(nota < 5)){
			JOptionPane.showMessageDialog(null,"Reprovado");
		}else if((nota>=5)&&(nota<7)){
			JOptionPane.showMessageDialog(null,"Exame");
		}else{
			JOptionPane.showMessageDialog(null,"Aprovado");
		}
		*/
		/*
		int opcao;
		double resultado;
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero:"));
		resultado = n1;
		do{
			String operacao = JOptionPane.showInputDialog("Digite o sinal da operação(+,-,*,/):");
			double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero:"));
			switch (operacao){
			case "+":
				resultado = resultado+n2;
			break;
			case "-":
				resultado = resultado-n2;
			break;
			case "*":
			case "x":
				resultado = resultado*n2;
			break;
			case "/":
				resultado = resultado/n2;
			break;
			default:
				JOptionPane.showMessageDialog(null,"Não reconhacido", "Erro", JOptionPane.ERROR_MESSAGE);
				resultado = 0;
			break;
			}
			JOptionPane.showMessageDialog(null, "O resultado é "+resultado);
			opcao = JOptionPane.showConfirmDialog(null,"Deseja continuar?", "Continue?", JOptionPane.YES_NO_OPTION);
		}while( opcao == 0);
		*/
		/*
		int opcao = JOptionPane.showConfirmDialog(null, "Deseja receber um oi?", "Medidor de carência",JOptionPane.YES_NO_OPTION);
		while (opcao == 0){
			JOptionPane.showMessageDialog(null,"Oi!","Carencia avistada", JOptionPane.INFORMATION_MESSAGE);
			opcao = JOptionPane.showConfirmDialog(null, "Deseja receber outro oi?", "Medidor de carência",JOptionPane.YES_NO_OPTION);
		}
		*/
		
		int[] tabuada = new int[10];
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
		for (int cont = 0; cont <=9; cont++){
			tabuada[cont] = n1 * (cont + 1);
			JOptionPane.showMessageDialog(null, tabuada[cont]);
		}
		
//		String test = "Oi";
		String test = JOptionPane.showInputDialog("Digite Oi:");
		if (test.equals("Oi")){
			JOptionPane.showMessageDialog(null, "Oi");
		}else{
			JOptionPane.showMessageDialog(null,"Tchau");
		}
	}

}
