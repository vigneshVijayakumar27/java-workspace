class cool
{
    cool()  //constructor
    {
	System.out.println("_____________________");
   	System.out.println("MARKET OFFERS");
	System.out.println("_____________________");

    }

  public void price1()
     {
	System.out.println("T-Shirt =     40%");
	System.out.println("----------");

     }
  public void price2()
     {
	System.out.println("Pant    =     35%");
	System.out.println("-----------");

     }
  public void price3()
     {
	System.out.println("Shirt   =     40%");
	System.out.println("-----------");

     }
}

class market_prices
{
  public void math()
     {
	int x=100;
     	int y=100;
	int sum=x+y;
	System.out.println("Total Ammount="+sum);
     }
}
 
class store
{
  public static void main(String args[]) 
     {
	cool v=new cool();
	market_prices y=new market_prices();

	v.price1();
 	v.price2();
	v.price3();
	y.math();
     }

}

/*
_____________________
MARKET OFFERS
_____________________
T-Shirt =     40%
----------
Pant    =     35%
-----------
Shirt   =     40%
-----------
Total Ammount=200
*/