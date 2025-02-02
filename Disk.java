import java.io.*;

class Arr
{
		DataInputStream ip=new DataInputStream(System.in);
	Arr()
	{
		int a[]=new int[3];
		int []b=new int[3];
		
		System.out.println("***First Array***");
		try{
				for(int x=0;x<a.length;x++)
				{
					a[x]=Integer.valueOf(ip.readInt()).intValue();
				}
		  }catch(Exception e){}
		  System.out.println("\n");
		  System.out.println("***Second Array***");
		  try{
				int i=0;
			    do
				{
					a[i]=Integer.valueOf(ip.readInt()).intValue();
					i++;
				}while(i<b.length);
		     }catch(Exception e){}
	}
}

class Disk
{
	public static void main(String arg[])
	{
		new Arr();
	}
}