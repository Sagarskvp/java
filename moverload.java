package sagar;

class moverloading
{
	int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	int add(int a,int b,int c)
	{
		int sum=a+b+c;
		return sum;
		
	}
	float add(float a,float b)
	{
		float sum=a+b;
		return sum;
	}
}
	public class moverload
	{
		public static void main(String args[])
		{
			moverloading obj=new moverloading();
			int s1=obj.add(10,20);
			int s2=obj.add(10,20,30);
			float s3=obj.add(2.2f,2.2f);
			System.out.println("method overload sum1="+s1);
			System.out.println("method overload sum2="+s2);
			System.out.println("method overload="+s3);
			
		}
	}



