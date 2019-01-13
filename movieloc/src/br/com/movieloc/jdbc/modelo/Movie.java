package br.com.movieloc.jdbc.modelo;

public class Movie {
	private String nome;
	private int registry;
    private int quantity; 
    
    public int getRegistry() {
		return registry;
	}
	public void setRegistry(int registry) {
		this.registry = registry;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
