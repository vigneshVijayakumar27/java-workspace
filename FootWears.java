class foot
{
   public void rate(String pro)
    {
	if(pro.equals("Men Slipper"))
	{
		int pri=500;
		int dis=5;
		System.out.println("Product = "+pro); 

		int offr=(pri*dis)/100;
		int total=pri-offr;

		System.out.println("Discount = "+dis+"%");

		System.out.println("Total Amount = "+total);
	}
	if(pro.equals("Women Slipper"))
	{
		int pri=550;
		int dis=7;
		System.out.println("Product = "+pro); 

		int offr=(pri*dis)/100;
		int total=pri-offr;

		System.out.println("Discount = "+dis+"%");

		System.out.println("Total Amount = "+total);
	}

	else if(pro.equals("Shoe"))
	{
		int pri=1500;
		int dis=10;
		System.out.println("Product  = "+pro);

		
		int offr=(pri*dis)/100;
		int total=pri-offr;

		System.out.println("Discount = "+dis+"%");

		System.out.println("Total Amount = "+total);
	}
	if(pro.equals("Baby Shoe"))
	{
		int pri=250;
		int dis=6;
		System.out.println("Product = "+pro); 

		int offr=(pri*dis)/100;
		int total=pri-offr;

		System.out.println("Discount = "+dis+"%");

		System.out.println("Total Amount = "+total);
	}

	else if(pro=="Socks")
	{
		int pri=100;
		int dis=5;
		System.out.println("Product  = "+pro);

		
		int offr=(pri*dis)/100;
		int total=pri-offr;

		System.out.println("Discount = "+dis+"%");

		System.out.println("Total Amount = "+total);
	}
    }
}

class FootWears	
 {					    
     public static void main(String args[]) 
	{
	    foot vv=new foot();
	    vv.rate("Baby Shoe");
	}
 }
