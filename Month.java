class sample
{
    public void January()
     {
	System.out.println("***January***");
	System.out.println("-------------");
	for (int x=1;x<2;x++)
      	{
	 	for(int y=1;y<8;y++)
		{
			System.out.print(" "+y);
		}
		System.out.println(" ");
      	}
	for (int x=1;x<2;x++)
      	{
		for(int y=8;y<15;y++)
		{
			System.out.print(" "+y);
		}
		System.out.println(" ");
      	}
	for (int x=1;x<2;x++)
      	{
		for(int y=15;y<22;y++)
		{
			System.out.print(" "+y);
		}
		System.out.println(" ");
      	}
	for (int x=1;x<2;x++)
      	{
		for(int y=22;y<29;y++)
		{
			System.out.print(" "+y);
		}
		System.out.println(" ");
      	}
	for (int x=1;x<2;x++)
      	{
		for(int y=29;y<32;y++)
		{
			System.out.print(" "+y);
		}
		System.out.println(" ");
      	}
   }
}

class Month
{
	public static void main(String[] args) 
    	{
      		sample vv=new sample();
		vv.January();
    	}
} 