class players
{

   public String dhoni()
    {
	String y="""
		     M.S.Dhoni :
		     ---------
	   		      -> He is a Captain Cool of indian cricket players then world cricket players.""";
	return y;
    }
   public String virat()
    {
	String z="""
		Virat Kohil :
		-----------
		     -> He is a fitness purson in indian players and he is top-most athletes athlete purson.""";
	return z;
    }
   public String rohit()
    {
	String a="""
		Rohit Sharama :
		-------------
		     -> He is a very impressed purson, he is a most catches is indian criket players.""";
	return a;
    }
}

class Criket
{
   public static void main(String arg[])
    {
	players vv=new players();
	String name1=vv.dhoni();
	System.out.println(name1);
	System.out.println("      ");
	System.out.println("      ");
	String name2=vv.virat();
	System.out.println(name2);
	System.out.println("      ");
	System.out.println("      ");
	String name3=vv.rohit();
	System.out.println(name3);
    }
}