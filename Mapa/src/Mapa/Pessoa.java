package Mapa;

public class Pessoa {
	private String nomePessoa;
	private String email;
	private String senha;
	
	public Pessoa(String nomePessoa, String email, String senha) {
		this.nomePessoa = nomePessoa;
		this.email = email;
		this.senha = senha;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
