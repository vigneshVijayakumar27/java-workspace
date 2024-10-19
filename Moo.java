class sample
{
	String Name="Meen";
   sample()
   {
	byte Age=10;
	for(int x=0;x<10;x++)
	{
		System.out.println(x);
		x=x+1;
	}
	System.out.println(Age);
   }
}  

class sample1 extends sample
{
    sample1()
	{
 		System.out.println("Name = "+Name);
	}
}
 
class Moo
{
   public static void main(String arg [])
    {
	sample1 obj=new sample1();
    }
}