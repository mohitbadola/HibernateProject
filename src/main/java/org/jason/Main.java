package org.jason;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.setsName("Kaukau");
        s1.setRollNo(1);
        s1.setsAge(5);

        System.out.println(s1);
    }
}
