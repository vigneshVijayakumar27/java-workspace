/*
   If you buy above 5Kg to 10kg you are eligible for 10% Discount. Then if you buy above 11Kg to 20Kg 
you are the eligible for 20% Discount with *500 Rupees* Coupon.
*/

class sample
{
   public void cake(String pro,int qunt)
    {
	int cast=300;         
	if((qunt>5)&&(qunt<=10))
	{
		int Disc=10;
		System.out.println("Your eligible for Discount");
		System.out.println("----------------------------");

		System.out.println("Product      = "+pro);
		System.out.println("Total Kg.    = "+qunt);

		int total=cast*qunt;
		int dis=(total*Disc)/100;
		System.out.println("Discount     = "+Disc+"%");	

		int amount=total-dis;
		System.out.println("Total Amount = "+amount);
	}
	else if((qunt>11)&&(qunt<=20))
	{
		int Dis=20;		
	        System.out.println("You are eligible for Discount");
		System.out.println("----------------------------");

		System.out.println("Product      = "+pro);
		System.out.println("Total Kg.    = "+qunt);

		int total=cast*qunt;
		int dis=(total*Dis)/100;
		System.out.println("Discount     = "+Dis+"%");
		
		int amount=total-dis;
		System.out.println("Total Amount = "+amount);
		
		System.out.println("***You Won 500 Rupees Coupon.***");
	}
	else
	{
		System.out.println("Product = "+pro);
		System.out.println("You are not elgible");
		System.out.println("Total Kg. = "+qunt);
		int total=cast*qunt;
		System.out.println("Total Amount = "+total);
	}
    }
}

class normals
{
   public static void main(String arg[])
    {
	sample vv=new sample();
	vv.cake("Cake",12);
    }
}
