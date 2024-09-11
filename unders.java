import java.io.*;

class add
{
	DataInputStream vv=new DataInputStream(System.in);
   add(String hi)
    {
	try{
		System.out.print("Enter your name :");
		String name=vv.readLine();
		System.out.println("Your Name : "+name);
		System.out.println("");
	   }catch(Exception E){}
    }
   add()
    {
	try{
		System.out.print("Enter your Mobile No. : ");
		int num=Integer.valueOf(vv.readLine()).intValue();
		System.out.println("Your Mobile Number : "+num);
		System.out.println("");
	   }catch(Exception E){}
    }
	
   public void meen()
    {
	try{
		System.out.print("Enter your own trust =");
		boolean num=Boolean.valueOf(vv.readLine()).booleanValue();
	   }catch(Exception E){}
    }

}

class unders
{
   public static void main(String arg[])
    {
	add vv3=new add("hi da");
	add vv=new add();
	vv.meen();
	
    }
}