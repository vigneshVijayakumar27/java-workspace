class time
{
   public void laptop(String name,String add,String proct,int first,int Dis)
    {
	int lap=20000;
	if(first<5)
       	{
		System.out.println("- - - - - - - - - - - - - - - - ");
		System.out.println("       ***Today Offer***");
		System.out.println(" - - - - - - - - - - - - - - - - -");
		System.out.println("Name = "+"Sri");
		System.out.println("Address = "+"Chennai");
		System.out.println("Product = "+"Laptop");
		System.out.println("Discount = "+Dis+"%");
		System.out.println("Amount = "+(lap-8000));
	}
    }
}

class calce
{
   public static void main(String args[])
    {
	time vv=new time(); 
	vv.laptop("Sri","Chennai","Laptop",1,50); 
    }
}

/*
- - - - - - - - - - - - - - - -
       ***Today Offer***
 - - - - - - - - - - - - - - - - -
Name = Sri
Address = Chennai
Product = Laptop
Discount = 50%
Amount = 12000
*/