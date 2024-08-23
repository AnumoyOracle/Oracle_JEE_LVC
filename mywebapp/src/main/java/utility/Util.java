package utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Util {
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;

    static {
    	entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
    }

    public static EntityManager getEntityManager() {
    	if(entityManager == null || !entityManager.isOpen()) {
    		entityManager = entityManagerFactory.createEntityManager();
    	}
    	return entityManager;
    }
}
