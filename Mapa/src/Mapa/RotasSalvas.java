package Mapa;

public class RotasSalvas {
	private String nomerua;
	private String Cep;
	private String Bairro;

	
	public RotasSalvas(String nomerua, String Cep, String Bairro) {
		this.nomerua = nomerua;
		this.Cep = Cep;
		this.Bairro = Bairro;
	}

	public String getNomerua() {
		return nomerua;
	}

	public void setNomerua(String nomerua) {
		this.nomerua = nomerua;
	}

	public String getCep() {
		return Cep;
	}

	public void setCep(String cep) {
		Cep = cep;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}
}
