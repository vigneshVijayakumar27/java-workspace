abstract class Shopping
{
	abstract public void Method1(String Pro);
	abstract public void Method2();
}

class Shop1 extends Shopping
{
	private int Discount=25;
	public String Pro1;
      public void Method1(String Pro)
       {
	Pro1=Pro;
	if(Pro=="Phone")
	{
		int price=55000;
		int sum=((Discount*price)/100);
		int total=price-sum;	
		System.out.println("Product Name : "+Pro);
		System.out.println("Product Price : "+price);
		System.out.println("Product Discount : "+Discount);
		System.out.println("Total Amount : "+total);
		System.out.println();
	}
	else 
	{
		System.out.println("Worng comment");
	}
       }
      public void Method2()
       {
 	this.Method1("Phone");
       }
}

class product
{
      public static void main(String arg[])
       {
	Shop1 vv=new Shop1();
	vv.Method2();
       }
}