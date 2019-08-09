package classesobjetoscasa;

public class Janela {

	// declareção dos atributos 
	private String identificacao;
	private int status;
	
	//Método que lê e retorna o dado armazenado no atributo identificacao
	public String getIdentificacao() {
		return identificacao;
	}
	//Método que armazena o dado no atributo identificacao
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	//Método que lê e retorna o dado no atributo status
	public int getStatus() {
		return status;
	}
	//Método que armazena o dado no atributo atatus
	public void setStatus(int status) {
		this.status = status;
	}
}//Término da classe Janela
