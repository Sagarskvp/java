package sagar;
import java.util.*;
public class exception 
{
float c;

void div(float a, float b)
{
	try
	{
		c=a/b;
		System.out.println("result="+c);
	}
	catch(ArithmeticException e)
	{
		System.out.println("cannot divide by zero");
	}
}
public static void main(String args[])
{
	exception obj=new exception();
	Scanner in=new Scanner(System.in);
	System.out.println("enter valus of a and b ");
	float no1=in.nextFloat();
	float no2=in.nextFloat();
	obj.div(no1, no2);
}
}
