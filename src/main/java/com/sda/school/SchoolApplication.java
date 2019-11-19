package com.sda.school;

import com.google.common.collect.Lists;
import com.sda.school.model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class SchoolApplication {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.sda.school_project");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();


        Person p = new Person();
        p.setFirstName("Mateusz");
        p.setLastName("Informatyk");

//        Student s = new Student();
//        s.setPerson(p);
//        em.persist(s);

        Teacher t = new Teacher();
        t.setPerson(p);
        em.persist(t);
//
//
        Subject sub = new Subject();
        sub.setSubjectName("Informatyka");
        sub.setTeacher(t);
        em.persist(sub);
//
//       Student student = em.find(Student.class, 1L);
//
//        Subject subject = em.find(Subject.class, 1L);
//
//
//        Grade mathGrade = new Grade();
//        mathGrade.setStudent(student);
//        mathGrade.setValue(4);
//        mathGrade.setSubject(subject);
//        em.persist(mathGrade);

//        Principal principal = new Principal();
//        principal.setPerson(p);
//        em.persist(principal);



//        Student found = em.find(Student.class, 1L);
//        em.remove(found);
//        Student found2 = em.find(Student.class, 2L);
//        em.remove(found2);
//
//        Student found3 = em.find(Student.class, 3L);
//        found3.getPerson().setFirstName("Marta");
//        em.merge(found3);

        em.getTransaction().commit();

        List<Student> people = em.createQuery("SELECT s FROM Student s Where s.person.firstName=:parametr ")
                .setParameter("parametr","Mysia").getResultList();

//        String query = "SELECT s FROM STUDENT s WHERE s.person.firstName=:firstName AND s.person.lastName=:lastName";
//        List <Student> people =
//                em.createQuery(query)
//                        .setParameter("firstName", "Mysia").setParameter("lastName","Pysia")
//                        .getResultList();










    }
}
