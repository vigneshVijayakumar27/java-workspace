import java.io.*;

class sample
{
  	DataInputStream vv=new DataInputStream(System.in);
   public void Capa()
    {
   	{
		try{
			System.out.print("Enter your Name :");
			String name=vv.readLine();
			System.out.print("Enter your Address :");
			String add=vv.readLine();
			System.out.print("Enter your Age :");
			int age=Integer.valueOf(vv.readLine()).intValue();
			System.out.print("Enter your Captch :");
			String capt=vv.readLine();

			System.out.println("----------------------------");
			System.out.println("Your Profile is ready");
			System.out.println("Name :"+name);
			System.out.println("Address :"+add);
			System.out.println("Age :"+age);
			System.out.println("----------------------------");

		}catch(Exception e){System.out.println("Give valied inputs");}
	}
    }
}

class captcha
{
   public static void main(String arg[])
    {
	sample obj=new sample();
	obj.Capa();
    }
}