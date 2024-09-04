import java.io.*;

class Feet
{
   public static void main(String arg[])
    {
	DataInputStream vv=new DataInputStream(System.in);
	try{
		String pro="Land";
		int rate=2700;

		System.out.print("Enter Your Name :");
		String name=vv.readLine();
		System.out.print("Enter Your Address :");
		String add=vv.readLine();
		System.out.print("Enter Your PhoneNo. :");
		int Pho=Integer.valueOf(vv.readLine()).intValue();
		
		System.out.print("Enter your SquareFeet  = ");
		int feet=Integer.valueOf(vv.readLine()).intValue();
	
		int total=feet*rate;

		System.out.println("-----------------");
		System.out.println("Name : "+name);
		System.out.println("Address :"+add);
		System.out.println("PhoneNo. :="+Pho);

		System.out.println(pro);
		System.out.println("Your SquareFeet : "+feet);
		System.out.println("Your Land Rate = "+total);
		System.out.println("-----------------");
	   }catch(IOException e){}
    }
}