package com.jason;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.setsName("Kaukau");
        s1.setRollNo(1);
        s1.setsAge(5);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.jason.Student.class);
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(s1);

        transaction.commit();

        System.out.println(s1);
    }
}
