import java.io.*;

class sample
{
	DataInputStream vv=new DataInputStream(System.in);
   public void math()
    {
     try{
	System.out.print("Enter your Name : ");
	String name=vv.readLine();
	
	System.out.print("Enter your Mark 1 : ");
    	int mark1=Integer.valueOf(vv.readLine()).intValue();

	System.out.print("Enter your Mark 1 : ");
	int mark2=Integer.valueOf(vv.readLine()).intValue();
	
	System.out.println("--------------------------");
	System.out.println("Your Name  : "+name);
	System.out.println("Mark 1 = "+mark1);
	System.out.println("Mark 2 = "+mark2);
	System.out.println("Total Mark = "+(mark1+mark2));
	System.out.println("--------------------------");
        }catch(IOException e){}
    }
}

class anim
{
   public static void main(String args[])
    {
	sample vv=new sample();
	vv.math();
    }
}