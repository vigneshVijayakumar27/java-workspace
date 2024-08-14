class eb
{
   public void calculate(int units)
    {
	if(units<100)
	{
	     System.out.println("**No Cast**");
	}
	else if(units<200)
	{
	     System.out.println("Your Amount is = "+(units-100)*2.35);
	}
	else if(units<400)
	{
	     int a=235;
	     System.out.println("Your Amount is  = "+((units-200)*4.70+235));
	}
	else if(units<500)
	{
	     int a=235;
	     int b=940;
	     System.out.println("Your Amount is = "+((units-400)*6.30+a+b));
	}
	else if(units<600)
	{
	     int a=1410;
	     int b=630;
	     System.out.println("Your Amount is = "+((units-500)*8.40+a+b));
	}
	else if(units<800)
	{
	     int a=
	}
    }
}

class curent
{
   public static void main(String arg[])
    {
	eb vv=new eb();
	vv.calculate(350);
    }
}