class sample
{
		String Animal;
	public void Method1(String animal)
	{
		Animal=animal;
		System.out.println("The Animal makes a sound");
		System.out.println("The Animal name "+Animal);
	}
}
class sample2 extends sample
{
	public void Method2()
	{
		super.Method1("leo");
		System.out.println("the Dog says : Bow wow");
	}
}

class sample3
{
	sample3(String anima)
	{
		System.out.println("The Anothe Animal Name :"+anima);
	}
}

class sample4 extends sample3
{
	sample4()
	{
		super("Tiger");
	}
}

class Dream
{
	public static void main(String arg[])
	{
		sample2 vv=new sample2();
		vv.Method2();
	}
}