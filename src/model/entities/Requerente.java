package model.entities;

public class Requerente {
	
	private int id;
<<<<<<< HEAD
	private String cpf;
=======
>>>>>>> 641a3999fa877620400f58a082eb8b772184f36c
	private String nome;
	
	public Requerente() {
	}
	
<<<<<<< HEAD
	public Requerente(int id, String cpf, String nome) {
		this.id = id;
		this.cpf = cpf;
=======
	public Requerente(int id, int matricula, String nome, String cpf) {
		this.id = id;
>>>>>>> 641a3999fa877620400f58a082eb8b772184f36c
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
<<<<<<< HEAD
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return String.format("Id: %d CPF: %s Nome: %s", this.id, this.cpf, this.nome);
=======

	@Override
	public String toString() {
		return String.format("Id: %d Nome: %s", this.id, this.nome);
>>>>>>> 641a3999fa877620400f58a082eb8b772184f36c
	}
	
}//end of class
