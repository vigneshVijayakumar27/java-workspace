import java.io.*;

class sample
{
	sample()
	{
	try{
			for(int i=5;i>0;i--)
			{
				Thread.sleep(0);
				System.out.println(i);
			}
			System.out.println("HAPPY NEW YEAR");
		}catch(Exception e){}	
	}
}

class Sleep
{
	public static void main(String arag[])
	{
		new sample();
	}
}