import Pack.Mooment;

class Do extends Mooment
{
	Do(String actor,String tuch,String walk)
	{
		super(actor,tuch,walk);
	}
	Do()
	{
		super("Rajini","tuch","Walking");
	}
}

class Act
{
	public static void main(String arg[])
	{
		Do vv=new Do();
	}
}