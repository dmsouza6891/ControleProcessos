package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.ProcessoDao;
import model.dao.RequerenteDao;
import model.entities.Processo;
import model.entities.Requerente;

public class MainTest {
	
	public static void main(String args[]) {

		ProcessoDao processoDao = DaoFactory.createProcessoDao();
		
		Requerente requerenteUm = new Requerente(1,"11122233344","fulanodetal");
		Requerente requerenteDois = new Requerente(2, "22233344455", "siclanodetal");
		
		
		Processo processoUm = new Processo(1, 100, 2021, "Aposentadoria",new Date(), "Invalidez", requerenteUm);
		Processo processoDois = new Processo(3, 101, 2021, "Abono", new Date(), "Permanencia", requerenteDois);
		//processoDao.insert(processoUm);
		//processoDao.insert(processoDois);
		
		System.out.println(processoUm);
		System.out.println(processoDois);
		
		RequerenteDao requerenteDao = DaoFactory.createRequerenteDao();
		
		//processoDao.insert(processoDois);
		requerenteDao.insert(requerenteUm);
		requerenteDao.insert(requerenteDois);
		
		Processo processoBusca = processoDao.findById(1);
		System.out.println(processoBusca);
		processoBusca = processoDao.findById(3);
		System.out.println(processoBusca);
		processoDao.deleteById(3);
		
	}

}
