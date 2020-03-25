package Mapa;

public class Rua {
	
	private String nome;
	private String CEP;
	private String pavimentacao;
	private String bairro;
	
	public Rua(String nome, String CEP, String pavimentacao, String bairro) {
		this.nome = nome;
		this.CEP = CEP;
		this.pavimentacao = pavimentacao;
		this.bairro = bairro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getPavimentacao() {
		return pavimentacao;
	}

	public void setPavimentacao(String pavimentacao) {
		this.pavimentacao = pavimentacao;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	
}
	
