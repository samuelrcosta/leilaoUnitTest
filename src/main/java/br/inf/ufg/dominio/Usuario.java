package br.inf.ufg.dominio;

public class Usuario {
	
	private int id;
	private String nome;
	
	public Usuario(String nome) {
		this(0, nome);
	}
	
	public Usuario(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
}
