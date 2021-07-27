package com.encap;

public class overload {
	int max(int x, int y)
	{
		if(x>y)
			return x;
		else
			return y;
	}
	double max(double x, double y)
	{
		if(x>y)
			return x;
		else
			return y;
	}
	public static void main(String[] args)
	{
		overload ov=new overload();
		System.out.println(ov.max(10.9,8));
	}

}
