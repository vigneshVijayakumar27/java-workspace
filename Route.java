import java.util.Scanner;

class Bus
{
  public static void Root(int rupees)
   {      
	System.out.println("*My home*  to  *4 Rodes*");
	System.out.println(" - - - - - - - - - - - - - ");

	if(rupees==5)
	{
		System.out.println("You will go to Nazhikkal patty.");
	}
	else if(rupees==7)
	{
		System.out.println("You will go to Pypas.");
	}
	else if(rupees==11)
	{
		System.out.println("You will go to Bus_Stand.");
	}
	else if(rupees==17)
	{
		System.out.println("You will go to Bus Stand to 4 Rodes.");
	}
	else 
	{
		System.out.println(" $_Enter your curect Options_$ ");
	}
   } 
}    


class Route
{
   public static void main(String arg[])
    {
	Scanner Rup=new Scanner(System.in);
	System.out.println("Options = 5 , 7 , 11 , 17 ");
	System.out.print("Cundector = ");
	int no=Rup.nextInt();
	Bus vv=new Bus();
	vv.Root(no);
    }
}