class sample
{
   public void Main(String pro,int model)
    {
	int cast=650000;
	int COMdis=20;
	if(model==150)
	{
	    System.out.println("You are eligible.");
            System.out.println("----------------");
	    System.out.println("Bike Name    = "+pro);
	    System.out.println("Bike Mode    = "+model);
	    System.out.println("Discount     = "+COMdis+"%");
	    int Dis=(cast*COMdis)/100;
	    int total=cast-Dis;
	    System.out.println("Total Amount = "+total);
	}
	else
 	{
	   int Cast=600000;
	   int comDis=15;
	   if(model==125)
	   {
	      System.out.println("You are eligible for Pulsar-125.");
	      System.out.println("-------------------------------");
	      System.out.println("Bike Name    =    "+pro);
	      System.out.println("Bike Mode    =    "+model);
       	      System.out.println("Discount     =    "+comDis+"%");
	      int dis=(cast*comDis)/100;
	      int total=cast-dis;
	      System.out.println("Total Amount =    "+total);
	   }
	   else
           {
		System.out.print("You are not eligible for offers.");
	   }
	}
    }
}

class BikeSale
{
   public static void main(String args[])
    {
	sample vv=new sample();
	vv.Main("Bulsar",125);
    }
}

/*
   If your bike model is same then you are the eligible, 
But your bike model is not same you will buy Pulsar125.
*/