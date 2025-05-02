import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

class sample
{
  public void Method()
   {
	File dir=new File("Mark");  
	dir.mkdir();
	try{
		FileOutputStream Fill=new FileOutputStream("S:/Captures/Mark/New.txt");
		//Fill.createNewFile();
		String note="Hello i am vignesh";
		byte a[]=note.getBytes();
		Fill.write(a);
		
		/*
		if(Fill.delete())
	    {
			System.out.println("The file is deleted");
		}
		else
			System.out.println("not deleted");
		*/
		
	}
	catch(Exception e){}
	
	try{
		FileInputStream fi=new FileInputStream("S:/Captures/Mark/New.txt");
		int red;
		while((red=fi.read())!=-1)
		{
			System.out.print((char)red);
		}
	}catch(Exception e2){}
	
	
   }
}

class FileMang
{
   public static void main(String argp[])
    {
	sample vv=new sample();
	vv.Method();
    }
}