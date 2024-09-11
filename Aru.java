class sample
{
   public void jack()
    {
	try{
		int x=20;
		int y=19;
		System.out.println(x+y);		
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		System.out.println("--------");
		System.out.println(x<y);
		System.out.println(x>y);
		System.out.println(x<=y);
		System.out.println(x>=y);
		System.out.println(x==y);
		System.out.println(x!=y);
		System.out.println("--------");
		System.out.println((x>y)&&(y>x));
		System.out.println((y<x)||(x<y));

	   }catch(Exception e){}
    }
}

class Aru
{
   public static void main(String arg[])
    {
	sample vv=new sample();
	vv.jack();
    }
}