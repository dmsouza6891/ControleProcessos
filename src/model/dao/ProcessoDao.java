package model.dao;

import java.util.List;

import model.entities.Requisicao;

public interface ProcessoDao {
	
	void insert(Requisicao obj);
	void update(Requisicao obj);
	void deleteById(Integer id);
	Requisicao findById(Integer id);
	List<Requisicao> findAll();

}
