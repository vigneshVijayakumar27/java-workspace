import java.io.*;

class sample
{
	DataInputStream cls=new DataInputStream(System.in);
     sample()
      {
	try{
		System.out.print("Enter your Name : ");
		String name=cls.readLine();

		System.out.print("Enter your Date of Borth : ");
		int Borth=Integer.valueOf(cls.readLine()).intValue();
		System.out.println("");
		System.out.println("Your Name : "+name);
		if(Borth<32)
		{
			System.out.println("Your Born Date : "+Borth);
		}
		else
		{
			System.out.println("***This is Invalied Input***");
		}
	     }catch(Exception e){}
      }
}

class Yel
{
     public static void main(String ar[])
      {
	new sample();
      }
}