import java.util.*;

class sample
{
  public void Argu(int time)
   {
	 if((time>1)&&(time<=3))
	 {
		int one=1;
		int two=2;
		int three=3;
		System.out.println(one);	
		System.out.println(two);
		System.out.println(three);
	 }
	 else if((time>3)&&(time<=6))
	 {
		int one=4;
		int two=5;
		int three=6;
		System.out.println(one);	
		System.out.println(two);
		System.out.println(three);
	 }
	else if((time>6)&&(time<=9))
	 {
		int one=7;
		int two=8;
		int three=9;
		System.out.println(one);	
		System.out.println(two);
		System.out.println(three);
	 }
	else if((time>9)&&(time<=12))
	 {
		int one=10;
		int two=11;
		int three=12;
		System.out.println(one);	
		System.out.println(two);
		System.out.println(three);
	 }
	 else
	 {
		System.out.println("Someting went wrong");
	 }
   }
}

class Timer
{
  public static void main(String arg[])
   {
	Scanner Tim=new Scanner(System.in);
	System.out.println("Time Options : 1,2,3,4,5,6,7,8,9,10,11,12");
	System.out.print("Enter Time :");
	int num=Tim.nextInt();
	System.out.println(" ");

	sample vv=new sample();
	vv.Argu(num);
   }
}