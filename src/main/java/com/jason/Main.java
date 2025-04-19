package com.jason;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args){

//        To save data in table
//        Student s1 = new Student();
//
//        s1.setsName("Pulkit");
//        s1.setRollNo(4);
//        s1.setsAge(25);
//
//        SessionFactory sf = new Configuration()
//                .addAnnotatedClass(com.jason.Student.class)
//                .configure()
//                .buildSessionFactory();
//
//        Session session = sf.openSession();
//
//        Transaction transaction = session.beginTransaction();
//
//        session.persist(s1);
//
//        transaction.commit();
//        session.close();
//        sf.close();
//
//        System.out.println(s1);



//        To get data from Table
//        Student s2 = null;
//        SessionFactory sf = new Configuration()
//                .addAnnotatedClass(com.jason.Student.class)
//                .configure()
//                .buildSessionFactory();
//
//        Session session = sf.openSession();
//
//        s2 = session.get(Student.class, 1);
//        session.close();
//        sf.close();
//
//        System.out.println(s2);


        //  To update data from Table
//        Student s3 = new Student();
//        s3.setsName("Riddhi");
//        s3.setRollNo(2);
//        s3.setsAge(6);
//        SessionFactory sf = new Configuration()
//                .addAnnotatedClass(com.jason.Student.class)
//                .configure()
//                .buildSessionFactory();
//
//        Session session = sf.openSession();
//
//        Transaction transaction = session.beginTransaction();
//
//        session.merge(s3);  // if present then update else save
//
//        transaction.commit();
//
//        session.close();
//        sf.close();
//
//        System.out.println(s3);


        //  To delete data from Table
//        Student s4 = new Student();
//
//        SessionFactory sf = new Configuration()
//                .addAnnotatedClass(com.jason.Student.class)
//                .configure()
//                .buildSessionFactory();
//
//        Session session = sf.openSession();
//
//        s4 = session.get(Student.class, 4);
//
//        Transaction transaction = session.beginTransaction();
//
//        session.remove(s4);
//
//        transaction.commit();
//
//        session.close();
//        sf.close();
//
//        System.out.println(s4);


//        Chad c = new Chad();
//        c.setcAge(12);
//        c.setcName("Ahana");
//        c.setChadNo(1);
//
//        SessionFactory sf = new Configuration()
//                .addAnnotatedClass(com.jason.Chad.class)
//                .configure()
//                .buildSessionFactory();
//
//        Session session = sf.openSession();
//
//        Transaction transaction = session.beginTransaction();
//
//        session.persist(c);
//
//        transaction.commit();
//        session.close();
//        sf.close();

        Laptop lp = new Laptop();
        lp.setBrand("HP");
        lp.setModal("Omen");
        lp.setRam(16);
        lp.setLid(101);

        Engineer e = new Engineer();
        e.setEid(1);
        e.seteName("Hecker");
        e.setTech("Dev");
        e.setLaptop(lp);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.jason.Engineer.class)
                .addAnnotatedClass(com.jason.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(lp);
        session.persist(e);

        transaction.commit();

        Engineer er = session.get(Engineer.class, 1);
        System.out.println(er);

        session.close();
        sf.close();

    }
}
