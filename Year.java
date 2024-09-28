import java.io.*;

class sample
{
	DataInputStream vv=new DataInputStream(System.in);   
sample()
      {
           try{
	
	System.out.print("Enter your Birth Year : ");
	int year=Integer.valueOf(vv.readLine()).intValue();
	System.out.print("Enter your Class : ");
	int cls=Integer.valueOf(vv.readLine()).intValue();
	int total=((cls+year)+5);
	System.out.println("Your "+cls+"th Year : "+total);

               }catch(Exception e){}
      }
}

class Year
{
    public static void main(String arg[])
     {
	sample obj=new sample();
     }
}