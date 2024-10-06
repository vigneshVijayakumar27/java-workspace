class sample
{
	String Name1,Name2,Name3;
	String name1,name2,name3;
    sample(String Nam1,String Nam2,String Nam3)  		//Boys Name
    {
		Name1=Nam1;
		Name2=Nam2;
		Name3=Nam3;
		{
				System.out.println("   ***BOYS***");
			System.out.println("First Name = "+Name1);
			System.out.println("Second Name = "+Name2);
			System.out.println("Third Name = "+Name3);
				System.out.println();
		}	
    }
	public void Method(String Nam1,String Nam2,String Nam3)
	{
		name1=Nam1;
		name2=Nam2;
		name3=Nam3;
		{
				System.out.println("   ***GIRLS***");
			System.out.println("First Name = "+name1);
			System.out.println("Second Name = "+name2);
			System.out.println("Third Name = "+name3);
		}
	}
    sample()		//Girs Name
    {
		this("Raja","Mani","Ram");
    }
}

class Acer
{
    public static void main(String arg[])
     {
		sample vv=new sample();
		vv.Method("Rani","Manima","Rami");
     }
}

// If you give Boys name and Girs name, which is Boys name put in one Constractor  then Girs name put in another Constractor.
