import java.util.*;

class sample
{
	int name[][]=new int[2][2];
	int mark[][]=new int[2][2];
	int sum[][]=new int[2][2];
	Scanner ip=new Scanner(System.in);
	sample()
	{	
		System.out.println("_Enter First Set of Group_");
		for(int i=0;i<name.length;i++)
		{
			for(int j=0;j<name.length;j++)
			{
				name[i][j]=ip.nextInt();
			}
		}
		
		System.out.println(" \n");
		for(int i=0;i<name.length;i++)
		{
			for(int j=0;j<name.length;j++)
			{
				mark[i][j]=ip.nextInt();
			}
		}

		System.out.println("****************************");
		for(int i=0;i<name.length;i++)
		{
			for(int j=0;j<name.length;j++)
			{
				System.out.print(name[i][j]+" ");
			}
		}
		System.out.println(" ");
		for(int i=0;i<name.length;i++)
		{
			for(int j=0;j<name.length;j++)
			{
				System.out.print(mark[i][j]+" ");
			}
		}
		System.out.println("\n-----------------------------");
		for(int i=0;i<sum.length;i++)
		for(int j=0;j<sum.length;j++)
		{
			System.out.print((name[i][j]+mark[i][j])+" ");
		}
		
	}
}

class Inp
{
	public static void main(String arg[])
	{
		new sample();
	}
}