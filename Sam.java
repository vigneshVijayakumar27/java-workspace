class vahicle
{
		public String color;	// Global Variable
		public int speed;
	public void Start()			// Method 
	{
		System.out.println("***Start the Vahicle in the road***");
	}
	public void Stop()
	{
		System.out.println("***Stop the Vahicle in the road***");
	}
}

class Sam
{
	public static void main(String arg[])
	{
		vahicle vv=new vahicle();
		vv.color="pink";
		vv.speed=300;
		vv.Start();
		vv.Stop();
	}
}