class c_language
{
   public void C_Language()
    {
	System.out.println("""
			   main()
			   {
			   
			   } """);
	System.out.println("The above codes is C Language.");
	System.out.println(" ");
	System.out.println(" ");	
    }
}

class c_plesples_Language
{
    public void C_plesples_cods()
     {
 	System.out.println("""
			   void main()
			   {
			   
			   }""");
	System.out.println("The above code is C++ Language.");
	System.out.println(" ");
	System.out.println(" ");	
     }
}

class java_Language
{
    public void Java_Language()
     {
	System.out.println("""
			   public static void main()
			   {

			   }""");
	System.out.println("The above code is java Language.");
     }
}

class codes
{
    public static void main(String aeg[])
      {
	c_language vv=new c_language(); 

	c_plesples_Language cc=new c_plesples_Language();

	java_Language jj=new java_Language();

	vv.C_Language();
	cc.C_plesples_cods();
	jj.Java_Language();
      }
}