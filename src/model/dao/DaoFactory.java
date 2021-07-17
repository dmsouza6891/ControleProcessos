package model.dao;

import db.DB;
import model.dao.imp.ProcessoDaoSQLite;
<<<<<<< HEAD
import model.dao.imp.RequerenteDaoSQLite;
=======
>>>>>>> 641a3999fa877620400f58a082eb8b772184f36c

public class DaoFactory {

	public static ProcessoDao createProcessoDao() {
		return new ProcessoDaoSQLite(DB.getConnection());
	}
<<<<<<< HEAD
	
	public static RequerenteDao createRequerenteDao() {
		return new RequerenteDaoSQLite(DB.getConnection());
	}
=======
>>>>>>> 641a3999fa877620400f58a082eb8b772184f36c
}
