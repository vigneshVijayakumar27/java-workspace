import java.io.*;

class sample
{
	DataInputStream vv=new DataInputStream(System.in);
   public void Method()
    {
	try{
		System.out.print("Enter A Value : ");
		int A=Integer.valueOf(vv.readLine()).intValue();
		System.out.print("Enter B Value : ");
		int B=Integer.valueOf(vv.readLine()).intValue();
		System.out.print("Enter C Value : ");
		int C=Integer.valueOf(vv.readLine()).intValue();
		System.out.print("Enter D Value : ");
		int D=Integer.valueOf(vv.readLine()).intValue();
		System.out.println(" ");
		System.out.println("A Value = "+A);
		System.out.println("B Value = "+B);
		System.out.println("C Value = "+C);
		System.out.println("D Value = "+D);
		System.out.println(" ");
		int output=A+B;
		System.out.println("A+B = "+output);
		output=B-C;
		System.out.println("B-C = "+output);
		output=C*D;
		System.out.println("C*D = "+output);
		output=A/B;
		System.out.println("A/B = "+output);
		output=B%2;
		System.out.println("B%2 = "+output);
		System.out.println(" ");
		String T=(A<D)?"True":"False";
		System.out.println("The T is :"+T);
	   }catch(Exception e){}
    }
}

class AllOpe
{
   public static void main(String args[])
    {
	sample obj=new sample();
	obj.Method();
    }
}