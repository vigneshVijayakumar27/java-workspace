import java.io.*;

class sample
{
	DataInputStream din=new DataInputStream(System.in);

	int price=150;
	String Name;
	String Addres;
	long PhoNo;

    sample(String name,String add,long pho)
     {
	this.Name=name;
	this.Addres=add;
	this.PhoNo=pho;
     }

    public void Method2()
     {
	try{

		System.out.println("Your Name : "+Name);
		System.out.println("Your Address : "+Addres);
		System.out.println("Your Phone No. : "+PhoNo);

		System.out.print("Enter your Product : ");
		String name=din.readLine();

		System.out.print("Enter your quantity : ");
		int qual=Integer.valueOf(din.readLine()).intValue();

		int total=price*qual;
		System.out.println("Total Amount : "+total);
	
	   }catch(Exception e){}
     }
}

class Neel
{
   public static void main(String arg[])
    {
	sample vv=new sample("Mark","Salem",9022334455l);
	vv.Method2();
    }
}

