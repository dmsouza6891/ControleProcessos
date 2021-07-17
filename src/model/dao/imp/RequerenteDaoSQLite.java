package model.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import db.DB;
import db.DBException;
import model.dao.RequerenteDao;
import model.entities.Requerente;

public class RequerenteDaoSQLite implements RequerenteDao {
	
	private Connection conexaoDatabase;
	
	public RequerenteDaoSQLite(Connection conn) {
		this.conexaoDatabase = conn;
	}

	@Override
	public void insert(Requerente obj) {
		PreparedStatement st = null;
		try {
			st = conexaoDatabase.prepareStatement(
					"INSERT INTO requerentes"
					+ "(id, cpf, nome)"
					+ "VALUES "
					+ "(?, ?, ?) ",
					Statement.RETURN_GENERATED_KEYS);
			
			st.setInt(1, obj.getId());
			st.setString(2, obj.getCpf());
			st.setString(3, obj.getNome());
			
			st.execute();
		}
		catch (SQLException e) {
			try {
				throw new SQLException(e.getMessage());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}//end insert()

	@Override
	public void update(Requerente obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		PreparedStatement st = null; //objeto que gera sql
		
		try {//monta query sql
			st = conexaoDatabase.prepareStatement(
					"DELETE FROM processos WHERE id = ?");
			st.setInt(1, id);
			st.execute();
		}
		catch (SQLException e) {
			try {
				throw new SQLException(e.getMessage());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}	
	}

	@Override
	public Requerente findById(Integer id) {
		
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			st = conexaoDatabase.prepareStatement(
					"SELECT * " +
					"FROM requerentes " +
				    "WHERE id = ?");
			st.setInt(1, id);
			rs = st.executeQuery();
			if(rs.next()) {
				Requerente requerente = new Requerente();
				requerente.setId(rs.getInt("id"));
				requerente.setCpf(rs.getString("cpf"));
				requerente.setNome(rs.getString("nome"));
				return requerente;
			}
			return null;
		}
		catch(SQLException e) {
			throw new DBException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}//end findById()

	@Override
	public List<Requerente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
