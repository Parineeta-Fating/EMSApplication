package day1;
	
import java.util.Scanner;

	public class Day1_1{
	    double calculateStd(double x)
	    {
	        return ( x * 1.2);
	    }
	    double calculateAvg(double y)
	    {
	        return(y*2);
	    }
	    double calculateMax(double z)
	    {
	        return(z*3);
	    }
	    public static void main(String []args)
	    {
	        Scanner sc = new Scanner(System.in);
	        Day1_1 obj = new Day1_1();
	        double n, price;
	        System.out.print("Enter number of units:  ");
	        n = sc.nextDouble();
	        if(n>300)
	        {
	            price = obj.calculateStd(100)+ obj.calculateAvg(200)+ obj.calculateMax(n-300);
	        }
	        else if( n > 100 & n <= 300 )
	        {
	            price = obj.calculateStd(100)+ obj.calculateAvg(n-100);
	        }
	        else
	        {
	            price = obj.calculateStd(n);
	        }
	        System.out.println("Electric bill: "+ price +" Rs");
	    }

	}


