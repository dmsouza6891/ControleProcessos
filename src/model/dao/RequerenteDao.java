package model.dao;

import java.util.List;

import model.entities.Requerente;

public interface RequerenteDao {
	
	void insert(Requerente obj);
	void update(Requerente obj);
	void deleteById(Integer id);
	Requerente findById(Integer id);
	List<Requerente> findAll();

}
