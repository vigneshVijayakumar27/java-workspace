import java.io.DataInputStream;

class sample
{
	DataInputStream ip=new DataInputStream(System.in);
	int CollegeMark=380;
	public void Display(String name,String place,int age)
	{
		System.out.println("Your name : "+name);
		System.out.println("Your Place : "+place);
		System.out.println("Your Age : "+age+"\n");
	}
	public void Display(int mark1,int mark2,int mark3,int mark4,int mark5)
	{
		//System.out.println("Enter your 5 Subjects Marks : ");
		
		System.out.println("Mark 1 : "+mark1);
		System.out.println("Mark 2 : "+mark2);
		System.out.println("Mark 3 : "+mark3);
		System.out.println("Mark 4 : "+mark4);
		System.out.println("Mark 5 : "+mark5);
		
		int sum=mark1+mark2+mark3+mark4+mark5;
		System.out.println("Your Total Mark : "+sum+"\n");
		
		if(sum>CollegeMark)
		{
			System.out.println("**Wellcome to My College** \n");
			System.out.println("Fill this Application");
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

class MethodOver
{
	public static void main(String arg[])
	{
		sample vv=new sample();
		vv.Display("Vingesh ","Salem ",23);
		vv.Display(68,68,89,89,89);
	}
}