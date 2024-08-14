class contect
{
   public void marvel(String name,String add,String pro)
     {
	int x=1;
	while(x<=1)
	{
		System.out.print("-----------");
		System.out.print("Furniturs ");	
		System.out.println("-----------");
		x+=1;
	}
    
	int price=5000;
	int dis=15;
        if(add=="Salem")
	{
		if(pro=="Bench")
		{
			System.out.println("Customer Name  = "+name);
			System.out.println("Address  = "+add);
			System.out.println("Product  = "+pro);
			System.out.println("Discount = "+dis+"%");
			int Dis=price*dis/100;
			int total=price-Dis;
			System.out.println("Total amount = "+total);
		}
		else if(pro=="Chare")
		{
			System.out.println("Customer Name  = "+name);
			System.out.println("Address  = "+add);
			System.out.println("Product  = "+pro);
			int Dis=price*dis/100;
			int total=price-Dis;
			System.out.println("Total amount = "+total);
		}
	else
	{ 
		System.out.println("Customer Name  = "+name);
		System.out.println("Address  = "+add);
		System.out.println("Product  = "+pro);
		System.out.println("Total Amount = "+price);
	}
	}
     }
}

class values
{
   public static void main(String argu[])
     {
         contect nn=new contect();
	 nn.marvel("Mara","Salem","Bench");
     }
}

/*
-----------Furniturs -----------
Customer Name  = Mara
Address  = Salem
Product  = Bench
Discount = 15%
Total amount = 4250
*/
