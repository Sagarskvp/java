package sagar;

interface resume

{
void biodata();
}
class teacher implements resume
{
	String name,qualification,achievements;
	float experience;
	public void biodata()
	{
		name="sagar";
		qualification="M.tech,(phd)";
		achievements="q1 publications";
		experience=8.6f;
		System.out.println("teacher resume");
		System.out.println("name:"+name);
		System.out.println("qualification:"+qualification);
		System.out.println("experience:"+experience);
	}
}
class Student implements resume
{
	String name,discipline;
	float result;
	public void biodata()
	{
		name="sagar";
		result=9.8f;
		discipline="information science and engineering";
		System.out.println("");
		System.out.println("student resume");
		System.out.println("name;"+name);
		System.out.println("result:"+result+"cgpa");
		System.out.println("discipline"+discipline);
		
	}
}
public class Sresume
{
	public static void main(String[]args)
	{
		teacher obj1=new teacher();
		obj1.biodata();
		Student obj2=new Student();
		obj2.biodata();
		
	}
}
