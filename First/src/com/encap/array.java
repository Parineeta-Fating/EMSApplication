package com.encap;

public class array 
{
	public static void main(String[] args) {
		
	
	int a[]= {1,2,3};

    int b[]=new int[5];
    b[0]=100;
    b[1]=200;

    int c[];
    c=new int[5];

    for(int x=0;x<5;x++)
    {
        c[x]=(x+1);
    }
    for(int x=0;x<c.length;x++)
    {
        System.out.println( c[x] );
    }
    for(int  x : c)
    {
        System.out.println(x);
    }
    

}
}
