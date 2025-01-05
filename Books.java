package Pack;

public class Books
{
		private int Discount=5;
		String Book1="Programming in Java";
		private int price1 =450;
		String Book2="Programming in C";
		private int price2=350;
		String Book3="Python Programming";
		private int price3=400;
	public Books(int quant,String Book)
	{
		if(Book.equals("Programming in Java"))
		{
			if(quant>1)
			{
				System.out.println("\n******************\n");
				System.out.println("Book Name    : "+Book1);
				System.out.println("Discount     : "+Discount+"%");
				System.out.println("Book Price   : "+price1);
				System.out.println("Quantity     : "+quant);
				int total=quant*price1;
				int dis=((total*Discount)/100);
				System.out.println("Total Amount : "+(total-dis));
				System.out.println("");
				System.out.println("******************");
			}
			else
			{
				System.out.println("Book Name  : "+Book1);
				System.out.println("Book Price : "+price1);
			}
		}
		else if(Book.equals("Programming in C"))
		{
			if(quant>1)
			{
				System.out.println("\n******************\n");
				System.out.println("Book Name    : "+Book2);
				System.out.println("Discount     : "+Discount+"%");
				System.out.println("Book Price   : "+price2);
				System.out.println("Quantity     : "+quant);
				int total=quant*price2;
				int dis=((total*Discount)/100);
				System.out.println(dis);
				System.out.println("Total Amount : "+(total-dis));
				System.out.println("");
				System.out.println("******************");
			}
			else
			{
				System.out.println("Book Name  : "+Book2);
				System.out.println("Book Price : "+price2);
			}
		}
		else if(Book.equals("Python Programming"))
		{
			if(quant>1)
			{
				System.out.println("\n******************\n");
				System.out.println("Book Name    : "+Book3);
				System.out.println("Discount     : "+Discount+"%");
				System.out.println("Book Price   : "+price3);
				System.out.println("Quantity     : "+quant);
				int total=quant*price3;
				int dis=((total*Discount)/100);
				System.out.println(dis);
				System.out.println("Total Amount : "+(total-dis));
				System.out.println("");
				System.out.println("******************");
			}
			else
			{
				System.out.println("Book Name  : "+Book3);
				System.out.println("Book Price : "+price3);
			}
		}
		else
		{
			System.out.println("Enter Valied Book Name ");
			System.out.println("""
								For Examble : 
								        Programming in Java	
									Programming in C 
									Python Programming
							  """);
		}
	}
}