class sample
{
	String Name;
	String Color;
      sample(String name,String color)
       {
	this.Name=name;
	this.Color=color;
       }
      public void Method1()
       {
	System.out.println("Your Color : "+Color);
	System.out.println();
	System.out.println("Your Name : "+Name);
	System.out.println();
       }
}

class Ltd
{
      public static void main(String arg[])
       {
	sample vv=new sample("mara","pink");
	
       }
}