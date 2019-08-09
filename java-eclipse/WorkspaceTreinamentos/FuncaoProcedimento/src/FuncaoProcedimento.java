import javax.swing.JOptionPane;

public class FuncaoProcedimento {
	static String olaMundo2(){
		return "Olá mundo!";
	}
	static void olaMundo(){
		JOptionPane.showMessageDialog(null, "Olá mundo!");
	}
	
	public static void cals(String args) {
		System.out.print(args+"nada");
		
	}

	
	public static void main(String[] args) {
		olaMundo();
		String msg = olaMundo2();
		JOptionPane.showMessageDialog(null,msg);
		System.out.print("oi\n");
		String nada = "oi renan\nquer um abraço\n";
		cals(nada);
	}


	

}
