import java.io.*;

class sample
{
	DataInputStream cls=new DataInputStream(System.in);
      public void Method1()
       {
	try{	
		System.out.print("Enter Phone No. : ");
		long number=Long.valueOf(cls.readLine()).longValue();
		System.out.println();
		System.out.println("Colling....");
	    }catch(Exception e){}	
       }
}

class sample2 extends sample
{
     public void Method2()
      {
	System.out.println("This is Parent class Method");
	System.out.println("");	
      }
}
class Clear
{
     public static void main(String arg[])
      {
	sample ref;

	sample2 vv=new sample2();
	vv.Method2();

	ref=vv;
	ref.Method1();
      }
}