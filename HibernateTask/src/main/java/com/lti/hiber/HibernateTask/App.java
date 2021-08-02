package com.lti.hiber.HibernateTask;

import java.util.HashSet;
import org.hibernate.cfg.Configuration;

import com.lti.inheritance.Bank;
import com.lti.inheritance.ICICI;
import com.lti.inheritance.SBI;
import com.lti.mapping.Course;
import com.lti.mapping.Student;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        SessionFactory sFac = cfg.configure().buildSessionFactory();
        
        //Department d=new Department(70, "Mechanical", "India");
        
        Session s=sFac.openSession();
        
        Transaction tx=s.beginTransaction();
        
        //Course course1=new Course(201, "Angular", 120);
        //Course course2=new Course(202, "Maven", 45);
        
        
        //Student s1=new Student(1001, "Rahul", course1);
        //Student s2=new Student(1002, "David", course2);
        //Department d=new Department(41, "RuralDev", "India");
        //Department d2=new Department(21, "Sports", "India");
        //s.save(d);
       // s.save(d2);
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
        
        /*Student s1=new Student(101, "John", "Male");
        Student s2=new Student(102, "David", "Male");
        Student s3=new Student(103, "Jonathan", "Male");
        
        Course crs=new Course();
        crs.setCourseid(2001);
        crs.setCourseName("Angular");
        crs.setDuration(42);
        
        Set<Student> sObj=new HashSet<Student>();
        sObj.add(s1); sObj.add(s2); sObj.add(s3);
        
        crs.setStudents(sObj);*/
        
        
       /* Course course1=new Course(100,"Java", 200);
        Course course2=new Course(150,"React", 100);
        
        Set<Course> courses=new HashSet<Course>();
        courses.add(course1);
        courses.add(course2);
        
        Student s1=new Student(1001, "Paras", "Male");
        Student s2=new Student(1002, "Sakshi", "Female");
        Student s3=new Student(1003, "Nanda", "Female");
        
        Set<Student> students=new HashSet<Student>();
        students.add(s1); students.add(s2); students.add(s3);
        
        
        s1.setCourses(courses);
        s2.setCourses(courses);
        s3.setCourses(courses);
        
        s.save(s1);
        s.save(s2);
        s.save(s3);
        
        //s.save(crs);*/
        
        
        Bank bank=new Bank(101,"RBI", "Delhi");
        ICICI ico=new ICICI(201, "ICICI bank", "Chennai");
        ico.setLombardInsurance("With Higher benefits");
        SBI sbi=new SBI(301, "SBI Bank", "Mumnbai");
        sbi.setCarLoanInt("10.67/annum");
        
        s.save(bank);
        s.save(ico);
        s.save(sbi);
        
        tx.commit();
        s.close();
        sFac.close();
        
        //System.out.println("Students Info Updated..");
        System.out.println("Banks Program success..");
        
        
    }
}