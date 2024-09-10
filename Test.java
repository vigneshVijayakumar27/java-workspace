import java.io.*;

class market
{
	DataInputStream vv=new DataInputStream(System.in);
    public void sample(String Name,int Regno)
     {
	try{
		if(Regno==abc2233)
		{
			System.out.print("Enter your name : "+Name);
			String name=vv.readLine();
			System.out.print("Enter your Reg.NO. :");
			int number=Integer.valueOf(vv.readLine()).intValue();
	
			System.out.println("Hello "+Name+name);
			System.out.println("***Give the Anser***");
		
			System.out.print("2*2=");
			int ans1=Integer.valueOf(vv.readLine()).intValue();
			System.out.print("5*2=");
			int ans2=Integer.valueOf(vv.readLine()).intValue();
			System.out.println("Ans = "+"2*2=4");
			System.out.println("Ans = "+"5*2=10");
		}
	   }catch(Exception e){}
     }	
}

class Test
{
    public static void main(String argument[])
    {
	market  v=new market();
	v.sample("Mr.",abc2233);
    }

}	