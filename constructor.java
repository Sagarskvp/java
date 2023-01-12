package sagar;

public class constructor
{
int id;
String name;
constructor()
{
	System.out.println("this is default constructor");
	System.out.println("student id:"+id+"\nstudent name:"+name);
	
}
constructor(int i,String n)
{
	System.out.println("this is parametrized constructor");
	id=i;
	name=n;
	System.out.println("studint id:"+id+"\n student name:"+name);
	
}
public static void main(String[]args)
{
	constructor s=new constructor();
	constructor student=new constructor(10,"sagar");
	
}
}
