class sample
{
	public void Method(int x)
	{
		x--;
		System.out.println(x);
		if(x>0)
		Method(x);
	}
}

class Col
{
	public static void main(String arg[])
	{
		sample vv=new sample();
		vv.Method(5);
	}
}