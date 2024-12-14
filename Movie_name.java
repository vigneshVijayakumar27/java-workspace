import java.util.*;

class examble2
{
	static int count=0;
	static public void Loop()
	{
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter Number : ");
		count=ip.nextInt();
		System.out.println("The fibnacci series "+count+" number : ");
		for(int i=0;i<=count;i++)
		{
			System.out.println(i);
		}
	}	
}

class sample extends examble2
{
	public void Method()
	{
		super.Loop();
	}
}

class sample2 extends sample
{
	sample2()
	{
		super.Method();
	}
}

class Movie_name
{
	public static void main(String aarg[])
	{
		sample2 vv=new sample2();
	}
}