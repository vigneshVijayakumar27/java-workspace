import java.util.*;

class sample
{
      public void Method1()
       {
	char Lett='a';
	int Store=Lett;
	int Ass=(int)Store;
	System.out.println(Ass);
       }
}

class Two2
{
      public static void main(String arg[])
       {
	sample vv=new sample();
	vv.Method1();
       }
}