class sample
{
   public void First()
    {
	for(int i=0;i<3;i++)    // 0 1 2
	{
		for(int j=0;j<2;j++)   // 0 1
		{
			System.out.println(j);
		}

			System.out.println(" ");
	}
    }
   public void Second()
    {
	for(int i=0;i<3;i++)    // 0 1 2   (OutLine(Pack))
	{
		for(int j=0;j<3;j++)   // 0 1 2   (inLine(PackIn))
		{
			for(int x=0;x<2;x++)     // 0 1  (number)
			{
				System.out.println(i);
			}
		}
			System.out.println(" ");
	}
    }
}

class Kernel
{
   public static void main(String arg[])
    {
	sample obj=new sample();
	//obj.First();
	obj.Second();
    }
}