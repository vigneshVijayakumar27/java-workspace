import java.io.*;

class sample
{
		DataInputStream vv=new DataInputStream(System.in);
	sample()
	{
		try{
			System.out.print("Enter any number : ");
			int count=Integer.valueOf(vv.readLine()).intValue();
				for(int i=1;i<=count;i++)
				{
					System.out.println(i);
				}
		   }catch(Exception e){}
	}
}
class Loo
{
	public static void main(String arg[])
	{
		new sample();
	}
}