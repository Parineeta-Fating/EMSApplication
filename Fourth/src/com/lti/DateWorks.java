package com.lti;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateWorks 
{
	public static void main(String[] args) throws ParseException 
	{
		String var="15-07-2021";
        SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yyyy");
        Date obj=null;
        obj=sdf1.parse(var);
        System.out.println(obj);

        SimpleDateFormat sdf2=new SimpleDateFormat("EEEE");
        String dayName=sdf2.format(obj);
        System.out.println(dayName);
	}
}
