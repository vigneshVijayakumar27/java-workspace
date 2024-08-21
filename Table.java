class sample
{
   public void Two()
    {
	for(int x=1;x<=20;x++)
	{
		System.out.println(x+"*2="+x*2);
	}
		System.out.println(" ");
    }
   public void Five()
    {
	int x=1;
	while(x<=18)
	{
		System.out.println(x+"*5="+x*5);
		x++;
	}
    }
}

class Table
{
  public static void main(String arag[])
   {
	sample vv=new sample();
	vv.Two();
	vv.Five();
   }
}