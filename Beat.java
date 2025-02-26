import java.util.*;

class exam
{
	exam()
	{
		String ques[]={
			"What color is the sky?",
			"How many legs does a dog have?",
			"Which fruit is typically yellow?"
		};
		String opt[][]={
			{"1) Green" ,"2) Blue" , "3) Red" , "4) Purple"},
			{"1) 2" , "2) 4","3) 6" , "4) 8" },
			{"1) Apple" , "2) Banana" , "3) Orange" , "4) Grape"}
		};
		
		int curectAns[]={2,2,3};
		Scanner ip=new Scanner(System.in);
		int score=0;
		
		for(int i=0;i<ques.length;i++)
		{
			System.out.println(ques[i]);
			for(String options : opt[i])
			{
				System.out.println(options);
			}
			System.out.println("Enter your choice(1-4) : ");
			int Ans=ip.nextInt();
			
			if(Ans==curectAns[i])
			{
					System.out.println(" ");
					score++;
			}
			else
			{
				System.out.println("Enter Valied Anser");
			}
		}
		System.out.println("*********************************************");
		System.out.println("Your exam Score "+score+" out of "+ques.length);
		System.out.println("*********************************************");
		
	}
}

class Beat
{
	public static void main(String arg[])
	{
		new exam();
	}
}