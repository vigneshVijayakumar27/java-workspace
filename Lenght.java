import java.io.*;

class sample
{
	public void Method()
	{
			DataInputStream din=new DataInputStream(System.in);
		try{
				System.out.println("How may number you want in the sequence : ");
				int num=Integer.valueOf(din.readLine()).intValue();
				System.out.println("");
				System.out.print("Fibonacci Series of "+num+" number : ");
				for(int i=0;i<num;i++)
				{
					System.out.print(i);
				}
				
		
		   }catch(Exception e){}
	}
}

class lenght
{
	public static void main(String arg[])
	{
		sample vv=new sample();
		vv.Method();
	}
}

/*
***OUTPUT***
How may number you want in the sequence :
5
Fibonacci Series of 5 number : 01234
*/