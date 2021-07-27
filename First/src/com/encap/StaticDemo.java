package com.encap;

public class StaticDemo
{
        static int x=100;
        int y;
        void display()
        {
            System.out.println(x);
            x++;
        }
        static void Disp()
        {
            int d=100;
            x=900;
            //y=200;
        }

public static void main(String[] args)
{
            StaticDemo s1=new StaticDemo();
            StaticDemo s2=new StaticDemo();
            StaticDemo s3=new StaticDemo();

            s1.display();
            s2.display();
            s3.display();

            StaticDemo.Disp();

            System.out.println(StaticDemo.x);

}
}
