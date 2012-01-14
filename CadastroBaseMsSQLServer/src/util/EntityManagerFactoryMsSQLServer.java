package util;

import javax.persistence.Persistence;
import javax.persistence.EntityManager;

public class EntityManagerFactoryMsSQLServer {
	private static EntityManager managerSQLServer;
	
	public static EntityManager getInstanceSQLServer(){
		
		if (managerSQLServer == null){
			managerSQLServer = Persistence.createEntityManagerFactory("sqlserver").createEntityManager();
		}
		
		return managerSQLServer;
	}
}
