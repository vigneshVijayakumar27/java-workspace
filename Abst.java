// Use Abstract class : The base class hava 3 Methods then the Derived class must be use that 3 Methods of the base class.

abstract class sample1
{
	abstract public void Method1(int Table5);
	abstract public void Method2(int Table6);
	abstract public void Method3(int Table7);
}

class sample2 extends  sample1
{
      public void Method1(int Table5)
      {
	System.out.println("Table : "+Table5);
	for(int x=1;x<=10;x++)
	{
		System.out.println(x+"*5"+"="+x*5);
	}
	System.out.println();
      }
      public void Method2(int Tabel6)
      {
	System.out.println("Tabel 6");
	for(int x=1;x<=10;x++)
	{
		System.out.println(x+"*6"+"="+x*6);
	}
	System.out.println();
      }
      public void Method3(int Table7)
      {
	System.out.println("Tabel 7");
	for(int x=1;x<=10;x++)
	{
		System.out.println(x+"*7"+"="+x*7);
	}
	System.out.println();
      }
}

class Abst
{
     public static void main(String arg[])
      {
	sample2 vv=new sample2();
	vv.Method1(5);
	vv.Method2(6);
	vv.Method2(7);
      }
}