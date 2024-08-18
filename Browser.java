import java.util.Scanner;
class sample
{
   public String Values(int val1)
    {
	if(val1>25)
	{
		return "Pass";
	}
	else
	{
		return "Fail";
	}
    }
}

class Browser
{
  public static void main(String []arg)
   {
	Scanner scan=new Scanner(System.in);
	int val=scan.nextInt();

	sample obj=new sample();
	String total=obj.Values(val);
	System.out.println("Result = "+total);
   }
}