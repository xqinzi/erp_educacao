package dao;

import entidades.Telefone;
import entidades.Telefones;
import util.EntityManagerFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


public class TelefonesDAO {
	
	public static void inserirTelefone(Telefone t){
		
		Telefone tH = new Telefone();
		tH.setId(t.getId());
		tH.setPessoaID(t.getPessoaID());
		tH.setTelefone(t.getTelefone());
		
		//MySQL
		EntityManager managerMySQL = EntityManagerFactory.getInstanceMySQL();
		try{
			managerMySQL.getTransaction().begin();
			managerMySQL.persist(t);
			managerMySQL.getTransaction().commit();
		}
		catch (Exception e) {
			// TODO: handle exception
			managerMySQL.getTransaction().rollback();
		}
		/*
		//Firebird
		EntityManager managerFirebird = EntityManagerFactory.getInstance(bancoFirebird);
		try{
			managerFirebird.getTransaction().begin();
			managerFirebird.persist(t);
			managerFirebird.getTransaction().commit();
		}
		catch (Exception e) {
			// TODO: handle exception
			managerFirebird.getTransaction().rollback();
		}
		*/
		//HSQLDB
		EntityManager managerHSQLDB = EntityManagerFactory.getInstanceHSQLDB();
		try{
			managerHSQLDB.getTransaction().begin();
			managerHSQLDB.persist(tH);
			managerHSQLDB.getTransaction().commit();
		}
		catch (Exception e) {
			// TODO: handle exception
			managerHSQLDB.getTransaction().rollback();
		}
	}
	
	public static void inserirTelefones(Telefones t){
		/*EntityManager manager = EntityManagerFactory.getInstance();
		Telefone telefone;
		
		try{
			for (int i = 0; i < t.quantidade(); i++) {
				telefone = t.obterTelefone(i);
				
				manager.getTransaction().begin();
				manager.persist(telefone);
				manager.getTransaction().commit();
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			manager.getTransaction().rollback();
		}*/
	}
}
