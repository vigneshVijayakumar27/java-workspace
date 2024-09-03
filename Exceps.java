import java.io.DataInputStream;

class sample
{
   DataInputStream vv=new DataInputStream(System.in);
   sample()
    {
	try
	{
		System.out.print("Enter your Name : ");
		String name=vv.readLine();
		System.out.print("Enter your Age: ");
		String age=vv.readLine();
		System.out.print("Enter your Collage Name: ");
		String coll=vv.readLine();

		System.out.println("---------------------------");
		System.out.println("Your Name is : "+name);
		System.out.println("Your Age is : "+age);
		System.out.println("Your collage is : "+coll);
		System.out.println("Your Form is Completed");
		System.out.println("---------------------------");
	}catch(Exception v){}
    }
}

class Exceps
{
   public static void main(String arag[])
    {
	sample obj=new sample();
    }
}