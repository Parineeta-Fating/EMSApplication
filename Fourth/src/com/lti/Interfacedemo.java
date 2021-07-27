package com.lti;

import java.util.*;

interface MyInterface
{
   int findSquare(int x);
}
public class Interfacedemo
{
    public static void main(String[] args)
    {
            MyInterface obj= (num)->{
                return num*num;
                };
           System.out.println(obj.findSquare(2));
           
           List<Integer> nums=new ArrayList<Integer>();
           for(int y=100;y<107;y++)
           {
        	   nums.add(y);
        	   
           }
           nums.forEach((num)->System.out.println(num));
    }
}
