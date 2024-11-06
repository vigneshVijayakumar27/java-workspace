class ex1
{
    ex1(String god)		// -> Use "super" key word in Consturctore
     {
	System.out.println("God Name : "+god);
     }
}

 class ex2 extends ex1
{
     ex2()
      {
	super("Murugan");
       }
}

class ex3
{
    public void Method1(String temple)		//  -> Use "super" keyword in Method
     {
	System.out.println("Temple Name : "+temple);
     }
}

class ex4 extends ex3
{
     public void Method2()
      {
	super.Method1("Palani");
      }
}

class Identy
{
    public static void main(String arg[])
      {
	new ex2();
	ex4 vv=new ex4();
	vv.Method2();
      }
}