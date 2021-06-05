package br.com.x10d.banco;

public class DataRoot {

	private String conteudo;
	private int numero;

	public DataRoot() {
		super();
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Root: " + this.conteudo;
	}
}