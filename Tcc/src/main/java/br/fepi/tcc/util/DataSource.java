package br.fepi.tcc.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataSource {
	
private static EntityManagerFactory factory ;
	
	static { factory = Persistence.createEntityManagerFactory("TCCPU"); }
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
		
	}
}
