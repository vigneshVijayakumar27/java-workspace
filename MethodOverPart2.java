import java.util.*;
import java.io.DataInputStream;

class sample
{
	DataInputStream ip=new DataInputStream(System.in);
	int CollegeMark=480;
	public void Display(String name,String place,int age)
	{
		System.out.println("Your name : "+name);
		System.out.println("Your Place : "+place);
		System.out.println("Your Age : "+age+"\n");
	}
	public void Display(int mark1,int mark2,int mark3,int mark4,int mark5,int mark6)
	{	
		int sum=mark1+mark2+mark3+mark4+mark5+mark6;
		System.out.println("Your Total Mark : "+sum+"\n");
		
		if(sum>CollegeMark)
		{
			System.out.println("**Wellcome to My College** \n");
			System.out.println("Fill this Application Form \n");
			try{
				 System.out.print("Enter your Name : ");
				 String name=ip.readLine();
				 
				 System.out.print("Enter your Age : ");
				 int age=Integer.valueOf(ip.readLine()).intValue();
				 
				 System.out.print("Enter your Phone Number : ");
				 long ph=Long.valueOf(ip.readLine()).longValue();
				 
				 System.out.print("Enter your City : ");
				 String ciy=ip.readLine();
				 
			}catch(Exception e){}
		}
	}
}

class MethodOverPart2
{
	public static void main(String arg[])
	{
		Scanner ip1=new Scanner(System.in);
		
		sample vv=new sample();
		//vv.Display("Vingesh ","Salem ",23);
		
		int crtmak=100;
		int patch=2025;
		
		System.out.println("Enter your 5 Subjects Marks : ");
		System.out.print("Mark 1 : ");
		int mrk1=ip1.nextInt();
		if((mrk1<=crtmak)&&(mrk1!=0)&&(mrk1>1))
		{
			System.out.print("Mark 2 : ");
			int mrk2=ip1.nextInt();
			if((mrk2<=crtmak)&&(mrk2!=0)&&(mrk2>1))
			{
				System.out.print("Mark 3 : ");
				int mrk3=ip1.nextInt();
				if((mrk3<=crtmak)&&(mrk3!=0)&&(mrk3>1))
				{
					System.out.print("Mark 4 : ");
					int mrk4=ip1.nextInt();
					if((mrk4<=crtmak)&&(mrk4!=0)&&(mrk4>1))
					{
						System.out.print("Mark 5 : ");
						int mrk5=ip1.nextInt();
						if((mrk5<=crtmak)&&(mrk5!=0)&&(mrk5>1))
						{
							System.out.print("Mark 6 : ");
							int mrk6=ip1.nextInt();
							if((mrk6<=crtmak)&&(mrk6!=0)&&(mrk6>1))
							{
								vv.Display(mrk1,mrk2,mrk3,mrk4,mrk5,mrk6);
							}
							else
							{
								System.out.println("Your Mark is don't support ");
							}
						}
						else
						{
							System.out.println("Your Mark is don't support ");
						}
					}
					else
					{
						System.out.println("Your Mark is don't support ");
					}
				}
				else
				{
					System.out.println("Your Mark is don't support ");
				}
			}
			else
			{
				System.out.println("Your Mark is don't support ");
			}
		}
		else
		{
		System.out.println("Your Mark is don't support ");
		}
	}
}