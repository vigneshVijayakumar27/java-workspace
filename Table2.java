class sample
{
   public void table(int tab)
    {
 	for(int x=1;x<=10;x++)
	{
		System.out.println(x+"*"+tab+"="+x*tab);
	}
    }
}

class Kernel
{
   public static void main(String arg[])
    {
	sample vv=new sample();
	vv.table(4);
    }
}