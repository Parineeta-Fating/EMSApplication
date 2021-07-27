package com.encap;
public class ArrayDemo {
	 
    public static void main(String[] args) {

        Employee e[]=new Employee[3];

        e[0]=new Employee("E001", "Jack", "Oak");
        e[1]=new Employee("E002", "Dev", "Mum");
        e[2]=new Employee("E003","Rishi","Chn");

        for(int x=0;x<e.length;x++)
        {
            System.out.println(e[x]);
        }
        //Enhanced For Loop
        for(Employee x : e)
        {
            System.out.println(x);
        }
    }
 
}

