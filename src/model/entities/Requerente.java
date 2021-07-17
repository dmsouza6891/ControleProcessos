package model.entities;

public class Requerente {
	
	private int id;
	private String cpf;
	private String nome;
	
	public Requerente() {
	}
	
	public Requerente(int id, String cpf, String nome) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return String.format("Id: %d CPF: %s Nome: %s", this.id, this.cpf, this.nome);
	}
	
}//end of class
