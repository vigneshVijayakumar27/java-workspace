package Pack;

import java.util.*;

class samplee
{
	int mark1;
	int mark2;
	int mark3;
	int mark4;
	int mark5;
	int mark6;
	
	samplee(int mark1,int mark2,int mark3,int mark4,int mark5,int mark6)
	{
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		this.mark4=mark4;
		this.mark5=mark5;
		this.mark6=mark6;
	}
	public void Method()
	{
		int swp=0;
		
		swp=mark1;
		mark1=mark6;
		mark6=swp;
		
		swp=mark2;
		mark2=mark5;
		mark5=swp;
		
		swp=mark3;
		mark3=mark4;
		mark4=swp;
		    System.out.println("- - - - - - -");
			System.out.println(mark1);
			System.out.println(mark2);
			System.out.println(mark3);
			System.out.println(mark4);
			System.out.println(mark5);
			System.out.println(mark6);
			System.out.println("- - - - - - -");
	}
}


class Swap2
{
	public static void main(String arg[])
	{
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int b=ip.nextInt();
		int c=ip.nextInt();
		int d=ip.nextInt();
		int e=ip.nextInt();
		int f=ip.nextInt();
		samplee vv=new samplee();//a,b,c,d,e,f);
		vv.Method();
	}
}

