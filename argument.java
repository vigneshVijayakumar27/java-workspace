class bill
{
   public void calculate(int units)
    {
	if(units<100)
	{
		System.out.println("EB Amount = "+"0.00");
	}
	else if(units<200)
	{
		System.out.println("EB Amount = "+(units-100)*2.35);
	}
	else if(units<400)
	{
	    int a=235;
	    System.out.println("EB Amount = "+(((units-200)*4.70)+a));
	}
	else if(units<500)
	{
	     int a=235;
	     int b=940;
	     System.out.println("Your Bill amount is Rs."+(((units-400)*6.30)+a+b));
	}
	else if(units<800)
	{
	     int a=235;
	     int b=630;
	     int c=840;
	     System.out.println("EB Amount = "+(((units-500)*9.45)+a+b+c)); 
	}

	else
	{
		System.out.println("not Valid unit");
	}
    }
}

class argument
{
   public static void main(String art[])
    {
	bill vv=new bill();
	vv.calculate(750);
    }
}