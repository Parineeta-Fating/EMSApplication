package com.encap;

public class Employee
{
        private String empno;
        private String name;
        private String city;

        public Employee() {
            super();
            // TODO Auto-generated constructor stub
        }

        public Employee(String empno, String name, String city) {
            super();
            this.empno = empno;
            this.name = name;
            this.city = city;
        }
 
        @Override
        public String toString() {
            return "Employee [empno=" + empno + ", name=" + name + ", city=" + city + "]";
        }
 
        

}
