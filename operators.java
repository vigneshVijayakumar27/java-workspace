class math
{ 
   math(int x,int y)
    {
	System.out.println(x<y);
	System.out.println(x<=y);
	System.out.println(x>y);
	System.out.println(x>=y);
	System.out.println(x==y);
	System.out.println(x!=y);
    }
   public void normal(int a,int b)
     {
	System.out.println(a<b);
	System.out.println(a<=b);
	System.out.println(a>b);
	System.out.println(a>=b);
	System.out.println(a==b);
	System.out.println(a!=b);
     }
}

class operators
{
   public static void main(String arag[])
    {
	math vv=new math(22,33);
	System.out.println("  ");
	math vv2=new math(3,3);
	System.out.println("  ");
	math vv3=new math(45,23);
	System.out.println("  ");
	vv.normal(99,88);
	
    }
}



//69>99  flash   69>=99 flash

//	99>69  ture    99>=69 ture