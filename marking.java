class mark
{
     public void dismark()
	{
	   int x=15;
	   int y=15;
	   int sum=x+y;
	   System.out.println("add:"+sum);
	}

     public void subract()
	{
	   int x=15;
	   int y=10;
	   int sub=x-y;
	   System.out.println("sub:"+sub);
	}

     public void multiple()
	{
	   int x=15;
	   int y=15;
	   int mul=x*y;
	   System.out.println("mul:"+mul);
	}

     public void devide()
	{
	   int x=23;
	   int y=4;
	   int sum=x/y;
	   System.out.println("dev:"+sum);
	}

}
class marking
{
     public static void main(String argu[])
	{
	    mark o=new mark();
	    o.dismark();
	    o.subract();
	    o.multiple();
	    o.devide();
	}
}

