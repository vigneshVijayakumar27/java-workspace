class car
{
      public void Method(String Signel)
       {
	if(Signel=="Red")
	{
		System.out.println("***Stop***");
	}
	else if(Signel=="Orreng")
	{
		System.out.println("***Ready***");
	}
	else if(Signel=="Green")
	{
		System.out.println("***Start***");
	}
	else
	{
		System.out.println("Enter Currect Value");
	}
       }    
}

class Sample extends car
{
     Sample()
       {
	System.out.println(" \n The above program is Signals Control \n");
       }
}

class Colors
{
     public static void main(String arg[])
      {
	car vv=new car();
	vv.Method("Orreng");
	Sample vv1=new Sample();
      }
}