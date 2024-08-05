class simple
{
   public void game(int No)
    {
	if(No<1)
	{
	    System.out.println("The Game is Draw");
	}
	else if((No>=1)&&(No<=5))
	{
	    System.out.println("A = "+"You are the Win");
	}
	else if((No>=6)&&(No<=10))
	{
	    System.out.println("B = "+"You are the Win");
	}
	else if ((No>=11)&&(No<=15))
	{
	    System.out.println("C = "+"You are the Win");
	}
	else if ((No>=16)&&(No<=20))
	{
	    System.out.println("D = "+"You are the Win");
	}
	else
	{
	     System.out.println("The Game is Over");
	}
    }
}

class Game
{
   public static void main(String arg[])
    {
	simple vv=new simple();
	vv.game(21);
    }
}