package com.lti.hiber.HibernateTask;


import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

import org.hibernate.Session;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        SessionFactory sFac = cfg.addAnnotatedClass(Department.class).configure().buildSessionFactory();
        
        //Department d=new Department(70, "Mechanical", "India");
        
        Session s=sFac.openSession();
        
        Transaction tx=s.beginTransaction();
        Department d=new Department(41, "RuralDev", "India");
        Department d2=new Department(42, "UrbanDev", "China");
        s.save(d);
        s.save(d2);
        //s.save(d); INSERT
        //Department dep=null;
        //dep=s.get(Department.class, 30);
        
        //s.delete(dep); //DELETE
        
        /*System.out.println(dep);
        dep.setDeptname("Fashion");
        dep.setLocation("Russia");
        s.update(dep); */  //UPDATE 
        
       /* List<Department> deps = s.createQuery("from Department").list();
        for(Department d1: deps) {
        	System.out.println(d1);
        }*/
        
        tx.commit();
        s.close();
        sFac.close();
        
        System.out.println("Data Saved....");
        
        
    }
}