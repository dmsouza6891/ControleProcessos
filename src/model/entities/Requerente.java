package model;

public class Requerente {
	
	private int id;
	private int matricula;
	private String nome;
	private String cpf;
	
	public Requerente() {
		
	}
	
	public Requerente(int id, int matricula, String nome, String cpf) {
		this.id = id;
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return String.format("Id: %d Matricula: %d Nome: %s Cpf: %s", this.id, this.matricula, this.nome, this.cpf);
	}
	

}//end of class
