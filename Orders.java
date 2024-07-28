class shope
{
   shope(String name,String loca,String product,int Kg,int pric)
    {
	
	if(pric<=200)
	{
		System.out.println("Name = "+name);
		System.out.println("Location = "+loca);

		int Purchase=4;
		System.out.println("Total Purchases = "+Purchase);

		System.out.println("Product = "+product);

		int KG=Kg;
		System.out.println("Total Kg = "+KG);

		int total_amount=KG*pric;

		int Dis=Purchase*pric/total_amount;
		System.out.println("Discount = "+Dis+"%");

		int amount=400-8;
		System.out.println("Amount = "+amount);
		
	}
    }
}

class Orders
{
   public static void main(String arg[])
    {
	new shope("Guna","salem","Fish",2,200);
    }
}



/*

*O/P*
-----

Name = Guna
Location = salem
Total Purchases = 4
Product = Fish
Total Kg = 2
Discount = 2%
Amount = 392
*/
