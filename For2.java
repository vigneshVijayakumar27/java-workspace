class sample
{
    public void ForLoop()
    {
	for(int i=1;i<20;i++)
	{
		System.out.println(i*2);
	}
    }
}

class For2
{
   public static void main(String ar[])
    {
	sample obj=new sample();
	obj.ForLoop();
    }
}