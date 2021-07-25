package model.entities;

import java.util.Date;

public class Atribuicao {
	
	private int id;
	private Colaborador colaborador;
	private Requisicao requisicao;
	private Date dataDeAtribuicao;
	private Date dataParaEntrega;
	
	public Atribuicao(int id, Colaborador colaborador, Requisicao requisicao, Date dataDeAtribuicao, Date dataParaEntrega) {
		this.id = id;
		this.colaborador = colaborador;
		this.requisicao = requisicao;
		this.dataDeAtribuicao = dataDeAtribuicao;
		this.dataParaEntrega = dataParaEntrega;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Colaborador getColaborador() {
		return colaborador;
	}
	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}
	public Requisicao getRequisicao() {
		return requisicao;
	}
	public void setRequisicao(Requisicao requisicao) {
		this.requisicao = requisicao;
	}
	public Date getDataDeAtribuicao() {
		return dataDeAtribuicao;
	}
	public void setDataDeAtribuicao(Date dataDeAtribuicao) {
		this.dataDeAtribuicao = dataDeAtribuicao;
	}
	public Date getDataParaEntrega() {
		return dataParaEntrega;
	}
	public void setDataParaEntrega(Date dataParaEntrega) {
		this.dataParaEntrega = dataParaEntrega;
	}

	@Override
	public String toString() {
		return String.format("Colaborador: %s Requisição: %d/%d Atribuido em: %s Prazo Para Entrega: %s" , this.colaborador.getNome(), this.requisicao.getNumero(),
				              this.requisicao.getAno(), this.dataDeAtribuicao.toString(), this.dataParaEntrega.toString());
	}
}
