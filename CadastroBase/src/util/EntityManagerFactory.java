package util;

import javax.persistence.Persistence;
import javax.persistence.EntityManager;

public class EntityManagerFactory {
	private static EntityManager managerFirebird, managerOracle, managerPostgre;
	
	
	public static EntityManager getInstanceFirebird(){
		
		if (managerFirebird == null){
			managerFirebird = Persistence.createEntityManagerFactory("firebird").createEntityManager();
		}
		
		return managerFirebird;
	}
	
	public static EntityManager getInstanceOracle(){
		
		if (managerOracle == null){
			managerOracle = Persistence.createEntityManagerFactory("oracle").createEntityManager();
		}
		
		return managerOracle;
	}

	public static EntityManager getInstancePostgre(){
	
	if (managerPostgre == null){
		managerPostgre = Persistence.createEntityManagerFactory("postgre").createEntityManager();
	}
	
	return managerPostgre;
}
}
