import java.util.*;
import Pack.Score_Display;
class input extends Score_Display
{
	public input(int score,int wickets,int over)
	{
		super(score,wickets,over);
	}
}
class Compo
{
	public static void main(String arg[])
	{
		Scanner ip=new Scanner(System.in);
		
		System.out.print("Enter Score : ");
		int sre=ip.nextInt();
		System.out.print("Enter Wickets : ");
		int wkt=ip.nextInt();
		System.out.print("Enter Over : ");
		int ovr=ip.nextInt();
		
		input vv=new input(sre,wkt,ovr);
	}
}