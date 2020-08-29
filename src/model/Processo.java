package model;

import java.util.Date;

public class Processo {
	
	private int id;
	private int numero;
	private int ano;
	private String assunto;
	private Date dataSolicitacao;
	private String observacao;
	
	public Processo() {
		
	}
	
	public Processo(int id, int numero, int ano, String assunto, Date dataSolicitacao, String observacao) {
		this.id = id;
		this.numero = numero;
		this.ano = ano;
		this.assunto = assunto;
		this.dataSolicitacao = dataSolicitacao;
		this.observacao = observacao;
	}
	
	public int makeId() {
		String numero = String.format("%d", this.numero);
		String ano = String.format("%d", this.ano);
		String id = numero.concat(ano);
		return Integer.parseInt(id);
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
	@Override
	public String toString() {
		return String.format("Número: %d/%d Assunto: %s Data: %s", this.numero, this.ano, this.assunto, this.dataSolicitacao.toString());
	}
	
}
