package classesobjetoscasa;

public class Janela {

	// declare��o dos atributos 
	private String identificacao;
	private int status;
	
	//M�todo que l� e retorna o dado armazenado no atributo identificacao
	public String getIdentificacao() {
		return identificacao;
	}
	//M�todo que armazena o dado no atributo identificacao
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	//M�todo que l� e retorna o dado no atributo status
	public int getStatus() {
		return status;
	}
	//M�todo que armazena o dado no atributo atatus
	public void setStatus(int status) {
		this.status = status;
	}
}//T�rmino da classe Janela
