class Sample
{
		String Name;
	Sample(String name)
	{
		this.Name=name;
	}
	public void Method()
	{
		System.out.println("Name = "+Name);
		System.out.println(Name.toUpperCase());
		System.out.println(Name.toLowerCase());
	}
}
class Fors
{
	public static void main(String arg[])
	{
		Sample vv=new Sample("Naveen");
		vv.Method();
	}
}