package day1;

import java.util.Random;
import java.util.Scanner;

public class Day1_2{
    public static void main(String []args)
    {   
        Random rand = new Random();
        int runs[] = new int[30];
        int freq[] = new int[7];
        int total=0;
        double StrikeRate=0;
        for(int i=0; i<30; i++)
        {
            runs[i] = rand.nextInt(7);
        }
        for(int i=0; i<30; i++)
        {
            total = total + runs[i];
        }
        for(int i=0; i<30; i++)
        {
            freq[runs[i]] = freq[runs[i]] + 1; 
        }
        StrikeRate = (total/30.0)*100;
        System.out.println("Total Runs made in 30 balls are :  ");
        for(int i=0; i<30; i++)
        {
            System.out.print(runs[i] + "  ");
        }
        System.out.println();
        System.out.println("Total number of runs made in 30 balls : "+ total);
        System.out.println("The frequecies are : ");
        for(int i=0; i<7; i++)
        {
            System.out.print(i +" : "+freq[i] + "\t");
        }
        System.out.println();
        System.out.println("Strike rate is : "+ StrikeRate);
    }
}
