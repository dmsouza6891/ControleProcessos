package model.entities;

//classe para representar os colaboradores lotados no departamento que serão responsáveis por executar as tarefas
public class Colaborador {
	
	private int id; //para acesso ao banco de dados
	private int matricula; //matrícula do servidor
	private String nome; //nome do servidor
	
	public Colaborador() {
	}
	
	public Colaborador(int id, int matricula, String nome) {
		this.id = id;
		this.matricula = matricula;
		this.nome = nome;
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
	
	@Override
	public String toString() {
		return String.format("Matrícula: %d Nome: %s", this.matricula, this.nome);
	}

}
