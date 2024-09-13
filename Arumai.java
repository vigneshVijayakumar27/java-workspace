class sample
{
	int amount=750;
	int dis=15;
   public void Metho(String product,int qualty)
    {
	System.out.println("Product Name = "+product);
	System.out.println("Product Qualty = "+qualty);
	System.out.println("Product Cast = "+amount*qualty);
	System.out.println("Discount = "+dis+"%");

	int cast=(amount*qualty);
	int Discount=(cast*dis)/100;
	int Total=cast-Discount;
	System.out.println("Total Amount = "+Total);
    }
}

class Arumai
{
   public static void main(String ag[])
    {
	sample vv=new sample();
	vv.Metho("mattan",5);
    }
}