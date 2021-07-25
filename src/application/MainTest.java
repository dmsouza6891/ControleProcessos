package application;

import java.util.Date;

import model.entities.Atribuicao;
import model.entities.Colaborador;
import model.entities.Requerente;
import model.entities.Requisicao;
import model.entities.TipoRequisicao;

public class MainTest {
	
	public static void main(String args[]) {

		//ProcessoDao processoDao = DaoFactory.createProcessoDao();
		//RequerenteDao requerenteDao = DaoFactory.createRequerenteDao();
		
		Requerente requerente1 = new Requerente(1,"11122233344","Corregedoria");
		Requerente requerente2 = new Requerente(2, "22233344455", "Raphaela Rodrigues");
		
		Colaborador colaborador1 = new Colaborador(1, 12345, "Fabio");
		Colaborador colaborador2 = new Colaborador(2, 12346, "Alexandre");
	
		Requisicao processo1 = new Requisicao(1, 100, 2021, "Aposentadoria",new Date(), "sumula", requerente1, TipoRequisicao.PROCESSO);
		Requisicao processo2 = new Requisicao(2, 101, 2021, "Abono", new Date(), "sumula", requerente2, TipoRequisicao.MEMORANDO);
		
		System.out.println(colaborador1);
		System.out.println(colaborador2);
		System.out.println(processo1);
		System.out.println(processo2);
		System.out.println(requerente1);
		System.out.println(requerente2);
		
		Atribuicao atribuicao1 = new Atribuicao(1, colaborador1, processo1, new Date(), new Date());
		System.out.println(atribuicao1);
		
		//processoDao.insert(processo1);
		//processoDao.insert(processo2);
		//requerenteDao.insert(requerenteUm);
		//requerenteDao.insert(requerenteDois);
		
		//Requisicao processoBusca = processoDao.findById(1);
		//System.out.println(processoBusca);
		//processoBusca = processoDao.findById(3);
		//System.out.println(processoBusca);
		//processoDao.deleteById(3);
		
	}

}
