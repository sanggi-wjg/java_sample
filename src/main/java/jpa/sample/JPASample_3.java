package jpa.sample;

import jpa.sample.model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPASample_3 {

    public void sample_1() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("hello");
        EntityManager manager = factory.createEntityManager();

        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();

        try {


            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            manager.close();
        }
        factory.close();
    }

}
