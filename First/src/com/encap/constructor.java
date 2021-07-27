package com.encap;

public class constructor
{

    public constructor() {
        this(10);
        System.out.println("Default");
    }
    public constructor(int x,int y) {
        System.out.println("Params 2 - "+x+ "  "+y);
    }
    public constructor(int x) {
        this(10,20);
        System.out.println("Param 1 " +x);
    }

    public static void main(String[] args) {
            constructor mp=new constructor();

    }
}