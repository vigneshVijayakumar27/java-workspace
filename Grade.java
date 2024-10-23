import java.io.*;

class mark
{
	DataInputStream vv=new DataInputStream(System.in);
    mark()
     {
          try{
	System.out.print("Enter Mark : ");
	int Mark=Integer.valueOf(vv.readLine()).intValue();
	if((Mark>91)&&(Mark<100))
	{
		System.out.print("\n O Grade");
	}
	else if((Mark>80) &&(Mark<91))
	{
		System.out.print("\n A+ Grade");
	}
	else if((Mark>70)&&(Mark<81))
	{
		System.out.print("\n A Grade");
	}
	else if((Mark>65)&&(Mark<71))
	{
		System.out.print("\n B+ Grade");
	}
	else if((Mark>59)&&(Mark<66))
	{
		System.out.print(" \n B Grade");
	}
	else if(Mark<60)
	{
		System.out.print(" \n Arear");
	}
               }catch(Exception e){}
     }
}

class Grade
{
     public static void main(String arg[])
      {
	new mark();
      }
}