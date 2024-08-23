import java.util.Scanner;
class linear
{
   public void tab(int val)
    {
	for(int x=1;x<=15;x++)
	{
		System.out.println(x+"*"+val+"="+x*val);
	}
    }

   public static void main(String agr[])
    {
	Scanner total=new Scanner(System.in);
	int val=total.nextInt();
	
	linear vv=new linear();
	vv.tab(val);
    }
}