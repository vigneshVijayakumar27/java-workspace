class sample
{
	sample()
	{
		Integer a=101;
		int b=10;
		Boolean c=false;
		System.out.println(a == b? "Ture":"False"); // Ternary Operators.
		System.out.println(a instanceof Integer);	// Check Type
		System.out.println((float)b);				// Type Convertion
		System.out.println(a*'!');		// Assici value
		System.out.println(!c);
		
		// switch case 
		switch(b)
		{
			case 10:
				System.out.println("10");
				break;
			case 11:
				System.out.println("11");
				break;
			case 12:
				System.out.println("12");
				break;
			default:
				System.out.println("Different\n");
		}
		
		// multiple conditions
		for(int i=9,y=5;i>0&&y>0;i--,y--)
		{
			System.out.println(i);
		}
		System.out.println(" ");
		
		//  Array 
		String p[]=new String[3];
		p[0]="Your";
		p[1]="name";
		p[2]="is";
		
		//int r[]={10,12,13};
		
		// loop object creations.
		for(String temp: p)
		{
			if(temp=="is")
			continue;
			System.out.println(temp);
		}
		System.out.println(" ");
		
		// creat object using continue statement.
		lable:
		for(String tree:p)
		{
			System.out.println(tree);
			for(int u=0;u<3;u++)
			{
				System.out.println("This is normel nested loop");
				continue lable ;
			}
		}
	}
}

class VV
{
	public static void main(String arg[])
	{
		new sample();
	}
}