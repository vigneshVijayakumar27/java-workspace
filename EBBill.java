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
	    System.out.println("EB Amount = "+((units-200)*4.70)+a);
	}
	else if(units<500)
	{
	     int a=235;
	     int b=940;
	     System.out.println("Your Bill amount is Rs."+(((units-400)*6.30)+a+b));
	}
	else if(units<600)
	{
	     int a=1410;
	     int b=630;
	     System.out.println("EB Amount = "+(((units-500)*8.40)+a+b)); 
	}
	else if(units<800)
	{
	     int a=1410;
	     int b=630;
	     int c=840;
	     System.out.println("EB Amount = "+(((units-600)*9.45)+a+b+c));  
	}
	else if(units<1000)
	{		
	     int a=1410;
	     int b=630;
	     int c=840;
	     int d=1890;
	     System.out.println("EB Amount = "+(((units-800)*10.50)+a+b+c+d));  
	}
	else if(units>1000)
	{
	     int a=1410;
	     int b=630;
	     int c=840;
	     int d=1890;
	     int e=2100;
	     System.out.println("EB Amount = "+(((units-1000)*11.55)+a+b+c+d+e));  
	}

	else
	{
		System.out.println("not Valid unit");
	}
    }
}

class EBBill
{
   public static void main(String art[])
    {
	bill vv=new bill();
	vv.calculate(450);
    }
}