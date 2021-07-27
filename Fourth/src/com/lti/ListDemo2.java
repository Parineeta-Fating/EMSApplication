package com.lti;

import java.util.*;
import java.util.Map.Entry;

class Employee
{
    private int empno;
    private String name;
    private int age;
    public Employee(int empno, String name, int age) {
        super();
        this.empno = empno;
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Employee [empno=" + empno + ", name=" + name + ", age=" + age + "]";
    }
 

    public int getEmpno() {
        return empno;
    }
    public void setEmpno(int empno) {
        this.empno = empno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
 
}
class SortByID implements Comparator<Employee>
{
 
    @Override
    public int compare(Employee o1, Employee o2) {

        return o1.getEmpno()-o2.getEmpno();
    }    
}
class SortByName implements Comparator<Employee>
{
 
    @Override
    public int compare(Employee o1, Employee o2) {

        return o1.getName().compareTo(o2.getName());
    }

}
public class ListDemo2 
{
public static void main(String[] args) 
{
        List<Employee> empList=new ArrayList<Employee>();
        Employee e1=new Employee(101, "Bunny", 19);
        Employee e2=new Employee(100,"Pappu",21);
        Employee e3=new Employee(102, "Akil", 20);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

       // Collections.sort(empList,new SortByName());
        
        Collections.sort(empList,new Comparator<Employee>() 
        {
 
            @Override
            public int compare(Employee o1, Employee o2) {
                // TODO Auto-generated method stub
                return o1.getEmpno()-o2.getEmpno();
            }
        });

        for(Employee e : empList)
        {
            System.out.println(e);
        }

}
}
