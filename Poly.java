class aa
{
     public void Method1(int no)
      {
	System.out.println("This is aa class Method");
	System.out.println(no);
      }
}
 
class bb extends aa
{
     public void Method2()
       {
	Method1(10000);
	System.out.println("This is bb class Method");
       }
}

class Poly
{
      public static void main(String arg[])
       {
	bb ref;
	bb vv2=new bb();
	
	ref=vv2;
	ref.Method2();
        }
}