/*
***Dynamic Method Dispatch***

If you create base class then extends to derived class so create a referal code in Main class to base class
then we will call the base class methods in extends of derived class.
*/

class sample
{
		String Name;
		int Age;
	sample(String name,int age)
	{
		Name=name;
		Age=age;
	}
	sample()
	{
		this("Vignesh",21);
	}
	public void Method()
	{
		System.out.println(Name);
		System.out.println(Age);
	}
}

class sample2 extends sample
{
	public void Method2()
	{
		super.Method();
		System.out.println("This is for sample2 Method");
	}
}

class Temp
{
  public static void main(String arg[])
  {
	  sample ref;
	  sample2 vv2=new sample2();
	  
	  ref=vv2;
	  ref.Method();
  }
}

