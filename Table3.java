class sample
{
   public void Two(int table)
    {
	if(table==2)
	{
		for(int x=1;x<=20;x++)
		{
			System.out.println(x+"*2="+x*2);
		}
	}
	else if(table==3)
	{
		for(int x=1;x<=20;x++)
		{
			System.out.println(x+"*3="+x*3);
		}
	}
	else if(table==4)
	{
		for(int x=1;x<=20;x++)
		{
			System.out.println(x+"*4="+x*4);
		}
	}
	else if(table==5)
	{
		for(int x=1;x<=20;x++)
		{
			System.out.println(x+"*5="+x*5);
		}
	}
    }
}

class Table
{
  public static void main(String arag[])
   {
	sample vv=new sample();
	vv.Two(5);
   }
}