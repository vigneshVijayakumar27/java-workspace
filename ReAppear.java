import java.util.*;

class Due
{
	static int Units=1000;
	static String Bill_name="Current Bill.";
	static public void Bill(String name,String Add,long pho)
	{
		double total=(Units*5.65);
		System.out.println("Your Name : "+name);
		System.out.println("Bill Name : "+Bill_name);
		System.out.println("Bill Amount : "+total);
	}
}

class ReAppear
{
	public static void main(String arg[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String name=ip.nextLine();
		System.out.println("Enter your Add. : ");
		String Add=ip.nextLine();
		System.out.println("Enter your Phone No. : ");
		long pho=ip.nextLong();

		Due.Bill(name,Add,pho);
	}
}