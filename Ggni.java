import java.io.*;

class sample
{
	DataInputStream din=new DataInputStream(System.in);
    public void Method()
     {
       try{
	     for(int x=5;x>0;x--)
             {
		Thread.sleep(500);
		System.out.println(x);
	     }
	    System.out.println("Happy Diwali");
	  }catch(Exception n){}
     }
}
class sample2 extends sample
{
	DataInputStream din=new DataInputStream(System.in);
    sample2()
     {
       try{
	     for(int x=3;x>0;x--)
              {
		Thread.sleep(1000);
		System.out.println(x);
	      }
	     System.out.println("Happy Diwali");
	  }catch(Exception n){}
     }
}

class Ggni
{
    public static void main(String arg[])
     {
	sample vv1=new sample();
	sample2 vv=new sample2();
	vv.Method();
     }
}