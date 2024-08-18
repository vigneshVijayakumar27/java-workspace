class sample 
{
   sample()
   {
	int val=1;
	while(val<10)   			//While Loop 
	{
		System.out.println("Welcome to My Codes");
		val=val+1;
	}
		System.out.println(" ");
   }

   public void For1()
    {
	int val=1;
	do					//Do Whiel Loop
	{
		System.out.println(val);
		val=val+1;
	}
	while(val<10);
		System.out.println(" ");
    }
   public void For2()
    {
	for(int i=1;i<10;i++)			//For Loop
	{
		System.out.println(i+") Hi I'm vignesh");
	}
    }
}

class For1
{
   public static void main(String ar[])
    {
	sample obj=new sample();
	obj.For1();
	obj.For2();
    }
}