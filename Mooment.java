package Pack;

public class Mooment
{
		String acting,tuching;
	public Mooment(String Actor,String Tuch,String Walk)
	{
		if(Actor.equals("Rajini"))
		{
			System.out.println("Rajini Tuch the door \n");
			if(Tuch=="tuch")
			{
				System.out.println("The Door is Open \n");
				if(Walk=="Walking")
				{
					System.out.println("Rajini Walking the floor");
				}
			}
			else
			{
				System.out.println("Wrong comment : ");
			}
		}
	}
}