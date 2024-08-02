class sample
{
   public void shop(String pro,int kg)
    {
	  int price=6000;
	  int cast=price*kg;
	  if(cast>15000)
	   {
	      System.out.println("You are eligible for offer");
	      int dis=(cast*10)/100;
	      System.out.println("Your Discount Rate is ="+dis);
	      int total=cast-dis;
	      System.out.println("Total Amount ="+total);
	      System.out.println(" ");
	   }
	  else
	   {
	      System.out.println("You are not eligible ");
   	   }
    }    
}

class untile
{
  public static void main(String args[])
   {
	sample vv=new sample();
	vv.shop("Gold",4);
	System.out.println(" ");
	vv.shop("Silver",5);
   }
}