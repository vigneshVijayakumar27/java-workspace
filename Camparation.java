class sample
{
   sample()
    {
	int x=2;
	int y=3;
	System.out.println(x>y && x<y);    //false
	System.out.println(x>y || x<y);   // ture
	System.out.println(" ");
    }
  public void Sample()
    {
	int a=20;
	int b=20;
	System.out.println(a<b);            //false
	System.out.println(a>b);           // false
	System.out.println(a<b && a>b);    // false
	System.out.println(" ");
    } 
   public void Sample2()
    {
	int mark=82;
	boolean money=false;
	boolean spo=true;
	System.out.println(""" 
				Manoj 
				----- """);
	System.out.println((mark>=81) && (spo==true)&&(money=true));
	System.out.println((mark>79) || (spo==true)||(money=false));
	System.out.println(" ");
    }
  public void Sample3()
    {
	int marks=75;
	boolean moneys=false;
	System.out.println((marks>79) || (moneys=false));
    } 
}


class Camparation
{
   public static void main(String arg[])
    {
	sample vv=new sample();
	vv.Sample();
	vv.Sample2();
	vv.Sample3();
    }
}
