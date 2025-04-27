package com.jason;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

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

//        Laptop lp1 = new Laptop();
//        lp1.setBrand("HP");
//        lp1.setModal("Omen");
//        lp1.setRam(16);
//        lp1.setLid(101);
//
//        Laptop lp2 = new Laptop();
//        lp2.setBrand("Asus");
//        lp2.setModal("Rog");
//        lp2.setRam(32);
//        lp2.setLid(102);
//
//        Laptop lp3 = new Laptop();
//        lp3.setBrand("Acer");
//        lp3.setModal("Nitro");
//        lp3.setRam(8);
//        lp3.setLid(103);
//
//        Engineer e = new Engineer();
//        e.setEid(1);
//        e.seteName("Hecker");
//        e.setTech("Dev");
//
//        Engineer e2 = new Engineer();
//        e2.setEid(2);
//        e2.seteName("ChadHecker");
//        e2.setTech("Python");

//        Engineer e3 = new Engineer();
//        e3.setEid(3);
//        e3.seteName("GigaHecker");
//        e3.setTech("AI");

//        e.setLaptops(Arrays.asList(lp1, lp2));
//        e2.setLaptops(Arrays.asList(lp2, lp3));
//        e3.setLaptops(Arrays.asList(lp1));


//        lp1.setEngineer(Arrays.asList(e, e3));
//        lp2.setEngineer(Arrays.asList(e, e2));
//        lp3.setEngineer(Arrays.asList(e2));


//        e.setLaptops(Arrays.asList(lp1, lp2));
//        e2.setLaptops(Arrays.asList(lp3));


//        Laptop lp1 = new Laptop();
//        lp1.setBrand("HP");
//        lp1.setModal("Victus");
//        lp1.setRam(8);
//        lp1.setLid(104);


//        SessionFactory sf = new Configuration()
//                .addAnnotatedClass(com.jason.Engineer.class)
//                .addAnnotatedClass(com.jason.Laptop.class)
//                .configure()
//                .buildSessionFactory();

//        Session session = sf.openSession();

//        Transaction transaction = session.beginTransaction();

//        session.persist(lp1);
//        session.persist(lp2);
//        session.persist(lp3);
//
//        session.persist(e);
//        session.persist(e2);

//        session.persist(e3);

//        transaction.commit();

//        Engineer er = session.get(Engineer.class, 1);
//        System.out.println(er);

//        session.close();

//        Session session2 = sf.openSession();
//        Engineer er2 = session2.get(Engineer.class, 1);
//        session2.close();

//        sf.close();

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.jason.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session s = sf.openSession();

//        Laptop l1 = s.get(Laptop.class, 104);
//        System.out.println(l1);

//        HQL
//        Query query = s.createQuery("from Laptop where Ram = 8", Laptop.class);
        Query query = s.createQuery("from Laptop where brand Like 'HP'", Laptop.class);
        List<Laptop> Laptops = query.getResultList();
        System.out.println(Laptops);

        s.close();
        sf.close();

    }
}
