// Create a programe for Method Overloding.
// Calculate Students mark total.
// Taken two or three marks in different Methods.

class Public_Mark
{
	int mark1,mark2,mark3;
	public void Student(int mark1,int mark2,int mark3)
	{
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		
		System.out.println("Mark 1 : "+mark1);
		System.out.println("Mark 2 : "+mark2);
		System.out.println("Mark 3 : "+mark3);
	}
	public void Std1_Mark()
	{
		int total=mark1+mark2+mark3;
		System.out.println("Total Mark : "+total+"\n");
	}
	//@Overloading
	public void Student(int mark1,int mark2)
	{
		this.mark1=mark1;
		this.mark2=mark2;
		System.out.println("Mark 1 : "+mark1);
		System.out.println("Mark 2 : "+mark2);
	}
	public void Std2_Mark()
	{
		int total=mark1+mark2;
		System.out.println("Total Mark : "+total);
	}
}

class Method_Overlod_This
{
	public static void main(String arg[])
	{
		Public_Mark vv=new Public_Mark();
		vv.Student(70,80,90);
		vv.Std1_Mark();
		//vv.Student(88,96);
		//vv.Std2_Mark();
		
	}
}