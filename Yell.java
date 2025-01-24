import java.util.*;

class sample
{
		Scanner ip=new Scanner(System.in);
		int sub1[][]=new int[2][2];
		int sub2[][]=new int[2][2];
		int sum[][]=new int[2][2];
	sample()
	{
		System.out.println("***Subject 1***");
		System.out.println("Enter Marks : ");
		for(var i=0;i<sub1.length;i++)
		{
			for(var j=0;j<sub1.length;j++)
			{
				sub1[i][j]=ip.nextInt();
			}
		}
		
		System.out.println("\n= = = = = = = = \n");
		
		System.out.println("***Subject 2***");
		System.out.println("Enter Marks");
		for(int i=0;i<sub2.length;i++)
		for(int j=0;j<sub2.length;j++)
		{
			sub2[i][j]=ip.nextInt();
		}
		System.out.println(" ");
	}
	public void Method()
	{
		for(var i=0;i<sub1.length;i++)
		for(var j=0;j<sub1.length;j++)
		{
			sum[i][j]=sub1[i][j]+sub2[i][j];
			System.out.println(sum[i][j]);
		}
	}
}

class Yell
{
    public static void main(String rg[])
	{
		new sample().Method();
	}
}