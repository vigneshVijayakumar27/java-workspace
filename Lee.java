abstract class sample
{
    abstract  public void Senthil(String Std1);  	// Senthil work is Collect the Name.
    abstract public void Yogesh(String Std2);	// Yegesh work is Compar the Name.
    abstract public void Manoj();    	                //Manoj work is Display the Name
}

class sample2 extends sample
{
	String Student1
	String Student2;
      public void Senthil(String Std1="Maran")
       {
	Student1=Std1;
       }
      public void Yogesh(String Std2="Mani")
       {
	if(Student1==Student2)
	{
		System.out.println("The Name is same");
	}
	else
	{
		System.out.println("The Name is not same");
	}
       }
      public void Manoj()
       {
	System.out.println("Student Name : "+Student1);
	System.out.println("Student Name : "+Student2);
       }
}

class Lee
{
      public static void main(String arg[])
       {
	sample2 obj=new sample2();
	obj.Manoj();
       }
}