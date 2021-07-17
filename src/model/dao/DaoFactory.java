package model.dao;

import db.DB;
import model.dao.imp.ProcessoDaoSQLite;
import model.dao.imp.RequerenteDaoSQLite;

public class DaoFactory {

	public static ProcessoDao createProcessoDao() {
		return new ProcessoDaoSQLite(DB.getConnection());
	}
	
	public static RequerenteDao createRequerenteDao() {
		return new RequerenteDaoSQLite(DB.getConnection());
	}

}
