import java.io.FileOutputStream;
import java.io.FileInputStream;

class F1
{
	public static void main(String arg[])throws Exception
	{
		/*
		FileOutputStream OP=new FileOutputStream("mydata.txt");
		
		String text="Red color is stop color";
		
		byte a[]=text.getBytes();
		
		OP.write(a);
		*/
		FileInputStream IP=new FileInputStream("mydata.txt");
		
		for(int i=0;(i=IP.read())!=-1;i++)
		{
			System.out.print((char)i);
		}
	}
}