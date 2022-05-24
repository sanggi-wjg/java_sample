package jpa.sample.sample;

import jpa.sample.sample.model3.Member;
import jpa.sample.sample.model3.Team;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JPASample3 {

    public void sample_1() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("hello");
        EntityManager manager = factory.createEntityManager();

        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();

        try {
            // 1:N 테이블 sample insert 후 list select
            Team team = new Team();
            team.setName("Team A");
            manager.persist(team);

            Member member = new Member();
            member.setUsername("Snow");
            member.changeTeam(team);
            manager.persist(member);
            // 양방향 일때는 객체 두개다 넣도록 하자

            manager.flush();
            manager.clear();

            Member findMember = manager.find(Member.class, member.getId());
            List<Member> members = findMember.getTeam().getMembers();

            for (Member m : members) {
                System.out.println(m);
            }

            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            manager.close();
        }
        factory.close();
    }

}
