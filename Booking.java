import Pack.*;
import java.util.*;

class shale extends Books
{
	shale(int quant,String Book)
	{
		super(quant,Book);
	}
}
class Booking
{
	public static void main(String arg[])
	{
		String book1="Programming in Java";
		String book2="Programming in C";
		String book3="Python Programming";
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter your Book Name : ");
		String Book=ip.nextLine();
		
//		if((book1=="Programming in Java")&&(book2=="Programming in C")&&(book3=="Python Programming"))
//		{
//			System.out.print("Enter your Book Name : ");
//			String Book=ip.nextLine();
//		}

		System.out.print("Enter your Quantity : ");
		int Quan=ip.nextInt();

		new shale(Quan,Book);
	}
}