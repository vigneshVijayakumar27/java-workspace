import java.util.*;

class sample
{
	static public void Method()
	{
		System.out.println("Enter your number for where you need the multiplication tables : ");
		Scanner ip=new Scanner(System.in);
		int tables=ip.nextInt();
		
		for(int i=1;i<=tables;i++)
		{
			System.out.println("\n"+"Multiplication table for "+i+"\n");
			for(int j=1;j<=10;j++)
			{
				System.out.println(j+" * "+i+" = "+i*j);
			}
		}
		
	}
}

class Mult
{
	public static void main(String arg[])
	{
		sample.Method();
	}
}