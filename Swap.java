import java.util.Scanner;
import java.io.*;
abstract class sample
{
    abstract public void Method(int Num5);
}

class sample2 extends sample
{
	DataInputStream ip2=new DataInputStream(System.in);
	Scanner ip=new Scanner(System.in);
	int Num1;
	int Num2;
	int Num3;
	int Num4;
    public void Method(int Num5)
     {	
	try{
		System.out.println("Enter First Number : ");
		int num1=ip.nextInt();

		System.out.println("Enter Second Number : ");
		int num2=ip.nextInt();

		this.Num1=num1;
		this.Num2=num2;
	
		System.out.println("Enter Third Number : ");
		int num3=Integer.valueOf(ip.nextInt()).intValue();

		System.out.println("Enter Forth Number :  ");
		int num4=Integer.parseInt(ip2.readLine());

		this.Num3=num3;
		this.Num4=num4;

     	   }catch(Exception e){}
     }
    public void Method2()
     {
	System.out.println("The First Value is : "+Num1);
	System.out.println("The Second Value is : "+Num2);
	System.out.println("The Third Value is : "+Num3);
	System.out.println("The Forth Value is : "+Num4);
     }
}

class Swap
{
    public static void main(String arg[])
     {
	Scanner ip3=new Scanner(System.in);
	int Num5=ip3.nextInt();

	sample2 vv=new sample2();
	vv.Method(Num5);    
	vv.Method2();
     }
}