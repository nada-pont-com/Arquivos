import javax.swing.JOptionPane;


public class Matrizes {

	public static void main(String[] args) {

		/*[][] primeiro linha depois coluna*/
		int[][] minhaPrimeiraMatriz = new int[5][4];
		String tudo = "Resultado:\n\n";
		for (int l = 0; l < 5;l++){
			for (int c = 0; c < 4; c++){
				minhaPrimeiraMatriz[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para a matriz:"));
			}
		}
		for (int l = 0; l < 5;l++){
			for (int c = 0; c < 4; c++){
				tudo = tudo+"\n"+ minhaPrimeiraMatriz[l][c];
			}
		}
		JOptionPane.showMessageDialog(null, tudo);
		
	}

}
