class notpad
{
   public String Notpad()
    {
	String x="Notpad is a simple text editor.";
	return x;
    }
   public String Notpad_ples_ples()
    {
	String y="Notpad ++ is a open-source text editor and source code editor.";
	return y;
    }
   public String WordPad()
    {
	String z="WordPad is a word processor, It is a basic word processor.";
	return z;
    }
}

class Vales
{
   public void total()
   {
	System.out.println("Hello ");
   }
}

class nothing
{
   public static void main(String arg[])
    {
	notpad vv=new notpad();
    	String Text=vv.Notpad();
	System.out.println("Notpad -> "+Text);
	System.out.println("                                        ");

	String Text2=vv.Notpad_ples_ples();
	System.out.println("Notpad ++  ->"+Text2);
	System.out.println("                                        ");

	String Text3=vv.WordPad();
	System.out.println("WordPad -> "+Text3);
	System.out.println("                                        ");
    }
}

/*
Notpad -> Notpad is a simple text editor.

Notpad ++  ->Notpad ++ is a open-source text editor and source code editor.

WordPad -> WordPad is a word processor, It is a basic word processor.
*/