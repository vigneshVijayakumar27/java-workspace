import java.io.*;

class sample
{
	static public void Method()
	{
		try{
			
			File file=new File("S:/Captures/mydata.txt");
		
			FileInputStream fi=null;
			StringBuffer strContent=new StringBuffer("");
			fi=new FileInputStream(file);
			
			int i;
			while((i=fi.read())!=-1)
			{
				System.out.print((char)i);
			}
			
		 }catch(FileNotFoundException e)
		 {
			 System.out.println(e);
		 }
		  System.out.println(strContent);
	}
}

class in
{
	public static void main(String arg[])
	{
		sample.Method();
	}
}