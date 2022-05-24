package jpa.sample.sample;

import jpa.sample.sample.model.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JPASample {

    public void insert_sample() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("hello");
        EntityManager manager = factory.createEntityManager();

        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();

        try {
            Member member = new Member();
            member.setId(2L);
            member.setUsername("Snow");

            manager.persist(member);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            manager.close();
        }
        factory.close();
    }

    public void select_sample() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("hello");
        EntityManager manager = factory.createEntityManager();

        EntityTransaction transaction = manager.getTransaction();

        try {
            Member findMember = manager.find(Member.class, 1L);
            System.out.println("id :" + findMember.getId());
            System.out.println("username :" + findMember.getUsername());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            manager.close();
        }
        factory.close();
    }

    public void select_paginate_sample() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("hello");
        EntityManager manager = factory.createEntityManager();

        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();

        try {
//            TypedQuery query = manager.createQuery("select m from Member as m", Member.class);
//            System.out.println(query.getResultList());
            List<Member> resultList = manager.createQuery("select m from Member as m", Member.class).getResultList();
            for (Member member : resultList) {
                System.out.println(member.getUsername());
            }

            // pagination
            List<Member> resultList2 = manager.createQuery("select m from Member as m", Member.class)
                    .setFirstResult(1)
                    .setMaxResults(5)
                    .getResultList();

            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            manager.close();
        }
        factory.close();
    }

    public void delete_sample() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("hello");
        EntityManager manager = factory.createEntityManager();

        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();

        try {
            Member findMember = manager.find(Member.class, 1L);
            manager.remove(findMember);

            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            manager.close();
        }
        factory.close();
    }

    public void update_sample() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("hello");
        EntityManager manager = factory.createEntityManager();

        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();

        try {
            Member findMember = manager.find(Member.class, 1L);
            findMember.setUsername("Peter Fx");

            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            manager.close();
        }
        factory.close();
    }


}
