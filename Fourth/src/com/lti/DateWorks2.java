package com.lti;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class DateWorks2
{
   public static void main(String[] args)
   {
	Date d=new Date();
	System.out.println(d);
	
	DateFormat df=DateFormat.getDateInstance(DateFormat.LONG,Locale.US);
	String fo=df.format(d);
	System.out.println(fo);
	
	//Date to String
	SimpleDateFormat sdf=new SimpleDateFormat("G dd-MM-yyyy");
	String d1=sdf.format(d);
	System.out.println(sdf);
	
	//String to Date
	SimpleDateFormat sd2=new SimpleDateFormat("dd/MM/yyyy");
	Date obj=null;
	try {
		obj=sd2.parse("14/11/1983");
	}catch(ParseException e)
	{
		e.printStackTrace();
	}
	System.out.println(obj);
   }
  
 }