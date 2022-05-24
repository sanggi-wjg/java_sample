package jpa.sample.sample;

import jpa.sample.sample.model.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPASample2 {

    public void sample_1() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("hello");
        EntityManager manager = factory.createEntityManager();

        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();

        try {
            // 1
            // 비영속
            Member member = new Member();
            member.setId(3L);
            member.setUsername("SSSS");

            // 영속
            manager.persist(member);

            // 영속 테스트
            Member findMember = manager.find(Member.class, 1L);
            System.out.println(findMember);

//             2
//            Member findMember1 = manager.find(Member.class, 1L);
//            Member findMember2 = manager.find(Member.class, 1L);
//            System.out.println(findMember);

            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            manager.close();
        }
        factory.close();
    }

    public void sample_2(){
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
