import java.io.*;

class title
{
	DataInputStream vv=new DataInputStream(System.in);

    String name="JaVa";        	      // <- Global variable

  public String Title()
   {
	double verson=3.5;            // <- Local variable
	System.out.println(verson);
	return name;
   }
  public String Langu()
   {
	double verson=5.00;
	System.out.println(verson);
	return name;
   }

  public static void main(String arag[])
    {	
	title vv=new title();

	String val=vv.Title();
	System.out.println(val+" Script");

	String val2=vv.Title();
	System.out.println(val2+" Script");
	
	
    }
}