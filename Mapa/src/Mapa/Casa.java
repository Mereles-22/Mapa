package Mapa;

public class Casa {
	private String tipo_casa;
	private int numero_casa;
	private String cor_casa;
	private String cercada;
	
	// construtor 
	
	public Casa(String tipo_casa,int numero_casa, String cor_casa, String cercada){
		this.tipo_casa = tipo_casa;
		this.numero_casa = numero_casa;
		this.cor_casa = cor_casa;
		this.cercada = cercada;
    }

	public String getTipo_casa() {
		return tipo_casa;
	}

	public void setTipo_casa(String tipo_casa) {
		this.tipo_casa = tipo_casa;
	}

	public int getNumero_casa() {
		return numero_casa;
	}

	public void setNumero_casa(int numero_casa) {
		this.numero_casa = numero_casa;
	}

	public String getCor_casa() {
		return cor_casa;
	}

	public void setCor_casa(String cor_casa) {
		this.cor_casa = cor_casa;
	}

	public String getCercada() {
		return cercada;
	}

	public void setCercada(String cercada) {
		this.cercada = cercada;
	}
	
}