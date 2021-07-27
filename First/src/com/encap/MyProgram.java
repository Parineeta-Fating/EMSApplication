package com.encap;

public class MyProgram
{
	int x, y, z;
	public MyProgram() {
		x=10; y=20;
	}
	public MyProgram(int x1, int y1) {
		x=x1;
		y=y1;
	}
	void add()
	{
		z=x+y;
	}
	void disp()
	{
		System.out.println("Res "+z);
	}
	public static void main(String[] args) {
		MyProgram mp=new MyProgram();
		mp.add(); mp.disp();
		MyProgram mp2=new MyProgram(20,20);
				mp2.add(); mp2.disp();
	}
}
