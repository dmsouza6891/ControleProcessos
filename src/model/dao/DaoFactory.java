package model.dao;

import db.DB;
import model.dao.imp.ProcessoDaoSQLite;

public class DaoFactory {

	public static ProcessoDao createProcessoDao() {
		return new ProcessoDaoSQLite(DB.getConnection());
	}
}
