package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.dao.DaoFactory;
import model.dao.ProcessoDao;
import model.dao.RequerenteDao;
import model.entities.Processo;
import model.entities.Requerente;

public class MainTest {
	
	public static void main(String args[]) {
		
		SimpleDateFormat dataFormato = new SimpleDateFormat("yyyy-MM-dd");
		String novaData;
		
		novaData = dataFormato.format(new Date());
		ProcessoDao processoDao = DaoFactory.createProcessoDao();
		
		try {
			Processo processoUm = new Processo(1, 100, 2021, "Aposentadoria",dataFormato.parse("2021-05-31"), "Invalidez");
			//processoDao.insert(processoUm);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Processo processoDois = new Processo(3, 101, 2021, "Abono", new Date(), "Permanencia");
		//processoDao.insert(processoDois);
		Requerente requerenteUm = new Requerente(1,"11122233344","fulanodetal");
		Requerente requerenteDois = new Requerente(2, "22233344455", "siclanodetal");
			
		
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
