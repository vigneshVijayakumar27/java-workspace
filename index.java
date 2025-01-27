/*
class sample	// Var keyword can't using in the instence block.
{
     var people=100000; 
     Systme.out.println(people);
}
*/

class sample1 extends sample
{
	String Name;
    public void Method1(String name)
     {
	this.Name=name;
	var with=25;
	var lenght=40;
	var sum=with*lenght;
	System.out.println("Sum : "+sum);
     }
    public void Method1()
     {
	System.out.println("***Calculate Area***");
     }
}

class sample2 extends sample1
{
    public void Method3()
     {
	System.out.println("Normal c");
     }
}

class index
{
  public static void main(String arg[])
   {
	sample1 v=new sample2();
	v.Method1("madra");
	v.Method3();	
   }
}