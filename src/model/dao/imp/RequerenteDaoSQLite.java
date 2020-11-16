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
import model.entities.Processo;
import model.entities.Requerente;

public class RequerenteDaoSQLite implements RequerenteDao {
	
	private Connection conn;
	
	public RequerenteDaoSQLite(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Requerente obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"INSERT INTO requerentes"
					+ "(id, nome)"
					+ "VALUES "
					+ "(?, ?) ",
					Statement.RETURN_GENERATED_KEYS);
			
			st.setInt(1, obj.getId());
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public Requerente findById(Integer id) {
		
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			st = conn.prepareStatement(
					"SELECT * " +
					"FROM processos " +
				    "WHERE id = ?");
			st.setInt(1, id);
			rs = st.executeQuery();
			if(rs.next()) {
				Processo processo = new Processo();
				processo.setId(rs.getInt("id"));
				processo.setNumero(rs.getInt("numero"));
				processo.setAno(rs.getInt("ano"));
				processo.setAssunto(rs.getString("assunto"));
				processo.setDataSolicitacao(new java.util.Date(rs.getTimestamp("data_solicitacao").getTime()));
				processo.setObservacao(rs.getString("observacao"));
				return null;
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
