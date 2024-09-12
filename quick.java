import java.io.*;

class sample
{
	String prod;
	boolean qual;
   sample(String produ,boolean qual)
    {
	this.prod=produ;
	this.qual=qual;
    }
   public void Class()
    {
	System.out.println(prod);
	System.out.println(qual);
    }
}

class quick
{	
   public static void main(String arg [])
    {
	sample obj=new sample("car",true);
	sample obj1=new sample("bike",true);
	obj.Class();
	obj1.Class();
    }
}