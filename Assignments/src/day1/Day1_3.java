package day1;

import java.util.Random;
import java.util.Scanner;

public class Day1_3{
    public static void main(String []args)
    {   
        Random rands = new Random();
        int runs[][] = new int[5][30];
        int freq[] = new int[7];
        int total=0;
        double StrikeRate=0;
        for(int i=0; i<5; i++)
        {
            for(int j = 0; j< 30; j++)
                runs[i][j] = rands.nextInt(7);
        }
        for(int i=0; i<5; i++)
        {
            for(int j = 0; j<30; j++)
                total = total + runs[i][j];
        }
        for(int i=0; i<5; i++)
        {
            for(int j = 0; j< 30; j++)
                freq[runs[i][j]] = freq[runs[i][j]] + 1; 
        }
        StrikeRate = (total/150.0)*100;
        System.out.println("The Runs made in last 5 innings each match of 30 balls are :  ");
        for(int i=0; i<30; i++)
        {
            for(int j = 0; j< 5 ; j++)
                System.out.print(runs[j][i] + "  ");
            System.out.println();
        }
        System.out.println();
        System.out.println("Total runs made in last 5 innings each match of 30 balls are : "+ total);
        System.out.println("The frequecies are : ");
        for(int i=0; i<7; i++)
        {
            System.out.print(i +" : "+freq[i] + "\t");
        }
        System.out.println();
        System.out.println("Strike rate is : "+ StrikeRate);
    }
}