import java.util.Scanner;
class linear
{
   public void tab(int table)
    {
	for(int x=1;x<15;x++)
	{
		System.out.println(x+"*"+table+"="+x*table);
	}
    }

   public static void main(String agr[])
    {
	Scanner total=new Scanner(System.in);
	System.out.print("Enter your name = ");
	String val=total.nextLine();
	System.out.println("Welcome "+val);

	linear vv=new linear();
	vv.tab(2);

    }
}