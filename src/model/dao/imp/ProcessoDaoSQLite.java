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
import model.entities.Requisicao;

public class ProcessoDaoSQLite implements ProcessoDao {
	
	private Connection conexaoDatabase; //responsável pela conexão com o Banco de Dados
	
	public ProcessoDaoSQLite(Connection conexaoDatabase) { //atribui a conexão à classe
		this.conexaoDatabase = conexaoDatabase;
	}

	@Override
	public void insert(Requisicao obj) { //insere um processo no banco de dados
		PreparedStatement comandoSql = null;  //responsável em processar os comandos na linguagem SQL
		try {
			comandoSql = conexaoDatabase.prepareStatement(
							"INSERT INTO processos"
							+ "(id, numero, ano, assunto, data_solicitacao, observacao, id_requerente)"
							+ "VALUES "
							+ "(?, ?, ?, ?, ?, ?, ?) ",
							Statement.RETURN_GENERATED_KEYS);
			
			comandoSql.setInt(1, obj.getId());
			comandoSql.setInt(2, obj.getNumero());
			comandoSql.setInt(3, obj.getAno());
			comandoSql.setString(4,  obj.getAssunto());
			comandoSql.setDate(5, new java.sql.Date(obj.getDataSolicitacao().getTime()));
			comandoSql.setString(6, obj.getSumula());
			comandoSql.setInt(7, obj.getRequerente().getId());
			
			comandoSql.execute(); //executa o comando sql
		}
		catch (SQLException e) {
			try {
				throw new SQLException(e.getMessage());
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}//end insert()

	@Override
	public void update(Requisicao obj) {
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
	public Requisicao findById(Integer id) {
		
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
				Requisicao processo = new Requisicao();
				processo.setId(rs.getInt("id"));
				processo.setNumero(rs.getInt("numero"));
				processo.setAno(rs.getInt("ano"));
				processo.setAssunto(rs.getString("assunto"));
				Date data = rs.getDate("data_solicitacao");
				processo.setDataSolicitacao(data);

				processo.setDataSolicitacao(new java.util.Date(rs.getTimestamp("data_solicitacao").getTime()));
				processo.setSumula(rs.getString("observacao"));
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
	public List<Requisicao> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
