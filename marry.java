class Date
{
   Date(int a,int b)
    {
	int sum1=a;
	int sum2=b;
	System.out.println("Addition = "+(a+b));
	System.out.println("Sub      = "+(b-a));
	System.out.println("Mul      = "+(a*b));
	System.out.println("Div      = "+(b/a));
 	System.out.println("Modulus  = "+(a%b));
	System.out.println("_ _ _ _ _ _ _ _ _ _ _");
    }
   public void meaning(int x,int y)
     {
	int sum1=x;
	int sum2=y;
	System.out.println("Addition = "+(x+y));
	System.out.println("Sub      = "+(y-x));
	System.out.println("Mul      = "+(x*y));
	System.out.println("Div      = "+(y/x));
 	System.out.println("Modulus  = "+(y%x));
	System.out.println("_ _ _ _ _ _ _ _ _ _ _");
     }
}

class marry
{
   public static void main(String argp[])
    {
	Date vv=new Date(15,16);
	Date vv2=new Date(20,30);
	vv.meaning(2,2);
    }
}