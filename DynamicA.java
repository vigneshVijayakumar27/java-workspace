class Dye
{
	static public void Method()
	{
		//String name[]=new String[]{"vicky","kumar","Mullu"};
		String name[]={"vicky","kumar","Mullu"};
		int i=0;
		while(i<name.length)
		{
			System.out.println(name[i]);
			i++;
		}
			System.out.println(" ");
	}
}

class DynamicA
{
	public static void main(String arg[])
	{
		Dye vv=new Dye();
		vv.Method();
	}
}