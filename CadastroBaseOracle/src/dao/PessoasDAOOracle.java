package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import util.EntityManagerFactoryOracle;
import entidades.PessoaOracle;

public class PessoasDAOOracle {
	
	public static int inserirPessoa(PessoaOracle pessoaOracle){
		
		int result = 0;
		
		//Oracle
		EntityManager managerOracle = EntityManagerFactoryOracle.getInstanceOracle();
		try{
			managerOracle.getTransaction().begin();
			managerOracle.persist(pessoaOracle);
			result = pessoaOracle.getPessoaID();
			managerOracle.getTransaction().commit();
		}
		catch (Exception e) {
			// TODO: handle exception
			managerOracle.getTransaction().rollback();
		}
		
		return result;
	}
	
	public static PessoaOracle atualizarObjeto(int id){
		EntityManager managerFirebird = EntityManagerFactoryOracle.getInstanceOracle();
		Query q = managerFirebird.createQuery("FROM PessoaOracle WHERE pessoaID = :ID");
		q.setParameter("ID", id);
		return (PessoaOracle) q.getSingleResult();
	}
}
