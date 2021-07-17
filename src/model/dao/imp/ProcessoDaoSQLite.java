package model.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;

import db.DB;
import db.DBException;
import model.dao.ProcessoDao;
import model.entities.Processo;

public class ProcessoDaoSQLite implements ProcessoDao {
	
	private Connection conexaoDatabase;
	
	public ProcessoDaoSQLite(Connection conexaoDatabase) {
		this.conexaoDatabase = conexaoDatabase;
	}

	@Override
	public void insert(Processo obj) { //insere um registro
		PreparedStatement st = null; //objeto para gerar query sql
		try {
			st = conexaoDatabase.prepareStatement(
					"INSERT INTO processos"
					+ "(id, numero, ano, assunto, data_solicitacao, observacao)"
					+ "VALUES "
					+ "(?, ?, ?, ?, ?, ? ) ",
					Statement.RETURN_GENERATED_KEYS);
			
			st.setInt(1, obj.getId());           //referencia dados para a query sql
			st.setInt(2, obj.getNumero());
			st.setInt(3, obj.getAno());
			st.setString(4,  obj.getAssunto());
			st.setDate(5, new java.sql.Date(obj.getDataSolicitacao().getTime()));
			st.setString(6, obj.getObservacao());
			
			st.execute(); //executa a query
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
	public void update(Processo obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) { //deleta um registro dado um id
		
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
	}//end deleteById()

	@Override
	public Processo findById(Integer id) {
		
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			st = conexaoDatabase.prepareStatement(
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
				Date data = rs.getDate("data_solicitacao");
				processo.setDataSolicitacao(data);
				processo.setDataSolicitacao(new java.util.Date(rs.getTimestamp("data_solicitacao").getTime()));
				processo.setObservacao(rs.getString("observacao"));
				return processo;
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
	public List<Processo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
