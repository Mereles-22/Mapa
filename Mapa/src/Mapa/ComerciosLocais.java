package Mapa;

public class ComerciosLocais {
	private String TipoEstabelecimento;
	private String NomeEstabelecimento;
	private String ruaE;
	private String Cbairro;
	
	public void getComercio() {
		System.out.println(this.TipoEstabelecimento = "Restaurante");
		System.out.println(this.NomeEstabelecimento = "Restaurante Josimar");
		System.out.println(this.ruaE = "Rua Barao");
		System.out.println(this.Cbairro = "Poerao");
	}
	
	public String getTipoEstabelecimento() {
		return TipoEstabelecimento;
	}
	public void setTipoEstabelecimento(String tipoEstabelecimento) {
		TipoEstabelecimento = tipoEstabelecimento;
	}
	public String getNomeEstabelecimento() {
		return NomeEstabelecimento;
	}
	public void setNomeEstabelecimento(String nomeEstabelecimento) {
		NomeEstabelecimento = nomeEstabelecimento;
	}
	public String getRuaE() {
		return ruaE;
	}
	public void setRuaE(String ruaE) {
		this.ruaE = ruaE;
	}
	public String getCbairro() {
		return Cbairro;
	}
	public void setCbairro(String cbairro) {
		Cbairro = cbairro;
	}
	
	
}
