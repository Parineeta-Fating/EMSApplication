package com.lti;

public class DemoZ {
	
	public static void main(String[] args)
	{
		int x=100;
		long y=x; // implicit casting
		x=(int) y; // explicit casting
		char ch='A';
		int k=ch; // implicit casting
		char ch2=(char) k; // explicit casting
		System.out.println(ch2);
		System.out.println(k);
		System.out.println(y);
	}

}
