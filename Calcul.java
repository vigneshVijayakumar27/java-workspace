import java.util.Scanner;

class Calcul
{
   public static void main(String arg[])
   {
	   System.out.println("Welcoem to 10th pursentage calculater.");
	   Scanner vv=new Scanner(System.in);
	   int exam=5;
	   int sum=0;
	   double average=0;
	   for(int i=0;i<exam;i++)
	   {
		   System.out.print("\n Enter exam mark : ");
		   int mark=vv.nextInt();
		   sum+=mark;
	   }
		average=sum/exam;
		System.out.println("***********************");
		System.out.println("Average = "+average);
		System.out.println("***********************");
   }
}