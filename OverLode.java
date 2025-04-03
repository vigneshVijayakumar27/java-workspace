class sample
{
	double Method(float i,float w,float e)
	{
		return i*w*e;
	}
	double Method(float i)
	{
		return i*i*i;
	}
	double Method(float r,float e)
	{
		return 3.1416*r*r*e;
	}
}

class OverLode
{
	public static void main(String arg[])
	{
		sample vv=new sample();
		double rec=vv.Method(5,8,9);
		System.out.println(rec+"\n");
		
		double cube=vv.Method(5);
		System.out.println(cube+"\n");
		
		double cylinder=vv.Method(6,12);
		System.out.println(cylinder);	
	}
}