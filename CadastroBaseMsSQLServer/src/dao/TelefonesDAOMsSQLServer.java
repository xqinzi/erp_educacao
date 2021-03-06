package dao;

import entidades.TelefoneMsSQLServer;
import util.EntityManagerFactoryMsSQLServer;
import javax.persistence.EntityManager;

public class TelefonesDAOMsSQLServer {
	
	public static void inserirTelefone(TelefoneMsSQLServer tMsSqlServer){
		
		//SQLServer
		EntityManager managerSQLServer = EntityManagerFactoryMsSQLServer.getInstanceSQLServer();
		try {
			managerSQLServer.getTransaction().begin();
			managerSQLServer.persist(tMsSqlServer);
			managerSQLServer.refresh(tMsSqlServer.getPessoa());
			managerSQLServer.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			managerSQLServer.getTransaction().rollback();
		}
	}
}
