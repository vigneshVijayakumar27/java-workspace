class customer
{
    customer()
     {
	int price=250;
	int offer=40;
	boolean qual=true;
	boolean warenty=true;  
	System.out.println("Customer_1 ");
	System.out.println((price>170) && (offer>35) && (qual==true) && (warenty==true));
	System.out.println(" ");
     }

   customer(int prices,int offers,boolean qualt,int warent)
    {
	System.out.println("Cystomer_2 ");
	System.out.println((prices<200) || (offers<50) || (qualt==true) || (warent>35));
    }
}

class Books_shope
{
  public static void main(String arg[])
   {
	new customer();
	new customer(250,40,true,30);
   }
}