package com.cg.healthAssist.util;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class JPAUtil {
   private static EntityManagerFactory entityManagerFactory;
   static {
	   entityManagerFactory  = Persistence.createEntityManagerFactory("JPA-PU");
   }
      public static EntityManager getEntityManager() {
	      return entityManagerFactory.createEntityManager();
}

   public static void beginTransaction(EntityManager em) {
	   getEntityManager().getTransaction().begin();
   }
   public static void commitTransaction(EntityManager em) {
	   getEntityManager().getTransaction().commit();
   }
   public static void closeEntityManager(EntityManager em) {
	   getEntityManager().close();
   }


	// TODO Auto-generated method stub
	
}
   