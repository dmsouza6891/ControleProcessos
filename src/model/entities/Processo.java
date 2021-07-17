package model.entities;

import java.util.Date;

public class Processo {
	
	private int id;
	private int numero;
	private int ano;
	private String assunto;
	private Date dataSolicitacao;
	private String observacao;
	
<<<<<<< HEAD
	private Requerente requerente;
	
	public Processo() {
	}
	
	public Processo(int id, int numero, int ano, String assunto, Date dataSolicitacao, String observacao, Requerente requerente) {
=======
	public Processo() {
	}
	
	public Processo(int id, int numero, int ano, String assunto, Date dataSolicitacao, String observacao) {
>>>>>>> 641a3999fa877620400f58a082eb8b772184f36c
		this.id = id;
		this.numero = numero;
		this.ano = ano;
		this.assunto = assunto;
		this.dataSolicitacao = dataSolicitacao;
		this.observacao = observacao;
<<<<<<< HEAD
		this.requerente = requerente;
=======
>>>>>>> 641a3999fa877620400f58a082eb8b772184f36c
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public Date getDataSolicitacao() {
		return dataSolicitacao;
	}
	public void setDataSolicitacao(Date dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
<<<<<<< HEAD
	public Requerente getRequerente() {
		return requerente;
	}
	public void setRequerente(Requerente requerente) {
		this.requerente = requerente;
	}
=======
>>>>>>> 641a3999fa877620400f58a082eb8b772184f36c
	@Override
	public String toString() {
		return String.format("Número: %d/%d Assunto: %s Data: %s", this.numero, this.ano, this.assunto, this.dataSolicitacao.toString());
	}
	
}
