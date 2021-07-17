package model.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
<<<<<<< HEAD
import java.util.Date;
=======
>>>>>>> 641a3999fa877620400f58a082eb8b772184f36c
import java.util.List;

import db.DB;
import db.DBException;
import model.dao.ProcessoDao;
import model.entities.Processo;

public class ProcessoDaoSQLite implements ProcessoDao {
	
<<<<<<< HEAD
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
					+ "(id, numero, ano, assunto, data_solicitacao, observacao, idRequerente)"
					+ "VALUES "
					+ "(?, ?, ?, ?, ?, ?, ? ) ",
					Statement.RETURN_GENERATED_KEYS);
			
			st.setInt(1, obj.getId());           //referencia dados para a query sql
=======
	private Connection conn;
	
	public ProcessoDaoSQLite(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Processo obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"INSERT INTO processos"
					+ "(id, numero, ano, assunto, data_solicitacao, observacao)"
					+ "VALUES "
					+ "(?, ?, ?, ?, ?, ? ) ",
					Statement.RETURN_GENERATED_KEYS);
			
			st.setInt(1, obj.getId());
>>>>>>> 641a3999fa877620400f58a082eb8b772184f36c
			st.setInt(2, obj.getNumero());
			st.setInt(3, obj.getAno());
			st.setString(4,  obj.getAssunto());
			st.setDate(5, new java.sql.Date(obj.getDataSolicitacao().getTime()));
			st.setString(6, obj.getObservacao());
<<<<<<< HEAD
			st.setInt(7, obj.);
			
			st.execute(); //executa a query
=======
			
			st.execute();
>>>>>>> 641a3999fa877620400f58a082eb8b772184f36c
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
<<<<<<< HEAD
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
=======
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}
>>>>>>> 641a3999fa877620400f58a082eb8b772184f36c

	@Override
	public Processo findById(Integer id) {
		
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
<<<<<<< HEAD
			st = conexaoDatabase.prepareStatement(
=======
			st = conn.prepareStatement(
>>>>>>> 641a3999fa877620400f58a082eb8b772184f36c
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
<<<<<<< HEAD
				Date data = rs.getDate("data_solicitacao");
				processo.setDataSolicitacao(data);
=======
>>>>>>> 641a3999fa877620400f58a082eb8b772184f36c
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
