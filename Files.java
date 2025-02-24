import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;
class Files
{
	static Scanner ip=new Scanner(System.in);
	public static void main(String arg[])throws Exception
	{
		FileOutputStream fo=new FileOutputStream("S:/Captures/mydata.txt");
		
		String word="Enter your Name : ";
		
		byte a[]=word.getBytes();
		
		fo.write(a);
		
		FileInputStream fi=new FileInputStream("S:/Captures/mydata.txt");
		
		int i=0;
		while((i=fi.read())!=-1)
		{
			System.out.print((char)i);
		} 
		
		
		FileOutputStream FO=new FileOutputStream("mydata.txt");
		
		String word2=ip.nextLine();
		
		byte b[]=word2.getBytes();
		
		FO.write(b);
	}
}