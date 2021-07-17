//classe respons�vel em realizar tarefas de conex�o com o banco de dados. 

package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DB {
	
	static final String JDBC_Driver = "org.sqlite.JDBC";
	static final String DATABASE_URL = "jdbc:sqlite:C:/dms/databases/processcontrol/dbcontrolprocess";
	
	private static Connection conexao=null; //objeto respons�vel pela conex�o
	
	//realiza a conex�o com o banco de dados
	public static Connection getConnection(){
		
		if(conexao == null) {
			try {
				Class.forName(JDBC_Driver); //carrega classe de driver do banco de dados
				conexao = DriverManager.getConnection(DATABASE_URL); //tenta a conex�o com o BD caso o banco n�o exista � criado
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
				throw new DBException("Erro na conex�o. Classe Banco n�o foi encontrada:\n" + e);
			}
			catch(SQLException sqlE) {
				sqlE.printStackTrace();
				throw new DBException("Erro na conex�o:\n" + sqlE);
			}
			System.out.println("Conectado com sucesso");
		}
		
		return conexao;
	}//fim m�todo getConnection()
	
	public static void closeConnection() {
		if(conexao != null) {
			try {
				conexao.close();
			} 
			catch (SQLException e) {
				e.printStackTrace();
				throw new DBException("Erro ao fechar conex�o:\n"+e);
			}
		}
	}
	
	public static void closeStatement(Statement st) {
		if(st != null)
			try {
				st.close();
			} 
			catch (SQLException e) {
				e.printStackTrace();
				throw new DBException("Erro ao fechar o Statement"+e);
			}
	}
	
	public static void closeResultSet(ResultSet rs) {
		if(rs != null)
			try {
				rs.close();
			} 
			catch (SQLException e) {
				e.printStackTrace();
				throw new DBException("Erro ao fechar o Statement"+e);
			}
	}
	
}//end class()
	

	

