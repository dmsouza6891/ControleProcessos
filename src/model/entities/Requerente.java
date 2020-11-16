package model.entities;

public class Requerente {
	
	private int id;
	private String nome;
	
	public Requerente() {
	}
	
	public Requerente(int id, int matricula, String nome, String cpf) {
		this.id = id;
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

	@Override
	public String toString() {
		return String.format("Id: %d Nome: %s", this.id, this.nome);
	}
	
}//end of class
