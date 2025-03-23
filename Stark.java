class sample
{
		int eid,sal,bon;
		String name;
		public void Method()
		{
			System.out.println("***************");
			System.out.println("Single Inheritance");
			System.out.println("*************** \n");
			System.out.println("Employe Deatils \n");
			System.out.println("Employe Edi    : "+eid);
			System.out.println("Employe Name   : "+name);
			System.out.println("Employe Salary : "+sal);
		}
}
class Bonus extends sample
	{
		void Method2()
		{
			if(sal>1000)
			{
				bon=500;
				System.out.println("Bonus Amount   : "+bon);
			}
			else
			{
				System.out.println("You Don't Have Bonus");
			}
		}
}

class Stark extends sample
{
	public static void main(String arg[])
	{
		Bonus vv=new Bonus();
		vv.eid=2124;
		vv.sal=1500;
		vv.name="Guru";
		vv.Method();
		vv.Method2();
	}
}