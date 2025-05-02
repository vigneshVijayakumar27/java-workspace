// Create a programe for Method Overloding.
// Calculate Students mark total.
// Taken two or three marks in different Methods.

class Public_Mark
{
	public void Student(int mark1,int mark2,int mark3)
	{
		System.out.println("Mark 1 : "+mark1);
		System.out.println("Mark 2 : "+mark2);
		System.out.println("Mark 3 : "+mark3);
		int total=mark1+mark2+mark3;
		System.out.println("Total Mark : "+total+"\n");
	}
	public void Student(int mark1,int mark2)
	{
		System.out.println("Mark 1 : "+mark1);
		System.out.println("Mark 2 : "+mark2);
		int total=mark1+mark2;
		System.out.println("Total Mark : "+total);
	}
}

class Method_Overlo
{
	public static void main(String arg[])
	{
		Public_Mark vv=new Public_Mark();
		vv.Student(70,80,90);
		vv.Student(88,96,69);
	}
}