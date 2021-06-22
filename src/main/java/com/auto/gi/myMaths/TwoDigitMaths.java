package com.auto.gi.myMaths;

public class TwoDigitMaths {

	int i;
	int j;
	
	public TwoDigitMaths() {
	
	i=8;
	j=4;
	}
		
	public int addNumbers()
	{
		return i+j;
	}
	public int addNumbers(int a)
	{
		return i+a;
	}
	public int addNumbers(int a, int b)
	{
		return a+b;
	}
	public int addNumbers(int a, String b)
	{
		return a;
	}
	public int getI()
	{
		return i;
	}	
	public int getJ()
	{
		return j;
	}
	public int multipleNumbers()
	{
		return i*j;
	}
	public int lessNumbers()
	{
		return i-j;
	}
	public int devideNumbers()
	{
		return i/j;
	}
}
