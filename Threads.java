class sample extends Thread
{
	public void Method()
	{
		Thread t=new Thread(this);
		Thread t1=new Thread(t);
		System.out.println(t.getName());
		System.out.println(t1);
		
	}
}

class Threads extends sample
{
	public static void main(String arg[])
	{
		sample vv=new sample();	
		vv.start();
		
	}
}