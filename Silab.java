import java.io.*;

	
class sample
{
	DataInputStream din=new DataInputStream(System.in);

	String name;
	int age;
	long pho;
	
   sample(String Name,int Age,long Pho)
    {
	try{
		this.name=Name;
		this.age=Age;
		this.pho=Pho;
		
		System.out.println("Welcome "+name);
	   }catch(Exception e){}
    }

   public void Method()
    {
	try{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Phone No. : "+pho);
	   }catch(Exception e){}
    }
}

class Silab
{
   public static void main(String arg[])
    {
	sample vv=new sample("Arun",31,9092234532l);
	vv.Method();
    }
}