package model.entities;

import java.util.Date;

public class Requisicao {
	
	private int id;
	private int numero;
	private int ano;
	private String assunto; 
	private Date dataSolicitacao;
	private String sumula;
	private TipoRequisicao tipoRequisicao; //forma da requisi��o (Memorando, Of�cio, Processo)
	
	private Requerente requerente;
	
	public Requisicao() {
	}
	
	public Requisicao(int id, int numero, int ano, String assunto, Date dataSolicitacao, String sumula, Requerente requerente, TipoRequisicao tipoRequisicao) {
		this.id = id;
		this.numero = numero;
		this.ano = ano;
		this.assunto = assunto;
		this.dataSolicitacao = dataSolicitacao;
		this.sumula = sumula;
		this.requerente = requerente;
		this.tipoRequisicao = tipoRequisicao;
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
	public Requerente getRequerente() {
		return requerente;
	}
	public void setRequerente(Requerente requerente) {
		this.requerente = requerente;
	}
	public String getSumula() {
		return sumula;
	}
	public void setSumula(String sumula) {
		this.sumula = sumula;
	}
	public TipoRequisicao getTipoRequisicao() {
		return tipoRequisicao;
	}
	public void setTipoRequisicao(TipoRequisicao tipoRequisicao) {
		this.tipoRequisicao = tipoRequisicao;
	}

	@Override
	public String toString() {
		return String.format("N�mero: %d/%d Assunto: %s Data: %s Sumula: %s Tipo: %s Requerente: %s", this.numero, this.ano, this.assunto, 
				              this.dataSolicitacao.toString(), this.sumula, this.tipoRequisicao, this.requerente.getNome());
	}
	
}
