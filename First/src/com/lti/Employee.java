package com.lti;

public class Employee 
{
		String name="Ram";
		String city="Chennai";
		
		void displayData()
		{
			System.out.println("Name is "+name);
			System.out.println("City is "+city);
		}
		public static void main(String[] args) {
			Employee e1=new Employee();
			e1.displayData();
			
		}
}

