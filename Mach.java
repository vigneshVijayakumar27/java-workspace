abstract class sample
{
      abstract public void Method1(String Atack);
      abstract public void Method2();
}

class sample2 extends sample
{
      public void Method1(String Atack)
       {
	if(Atack=="Kick")
          	{
		System.out.println("***The Opponed is Nock***");
	}
	else if(Atack=="Punch")
	{
		System.out.println("***The Opponed is Move ***");
	}
	else
	{
		System.out.println("The Opponed is Kill you");
	}
       }
      public void Method2()
        {
	this.Method1("Punch");
        }
}

class Mach
{
      public static void main(String arg[])
       {
	sample ref;
	sample2 vv=new sample2();
	ref=vv;
	ref.Method2();
       }
}