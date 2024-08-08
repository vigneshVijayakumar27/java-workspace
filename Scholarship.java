class sample
{
	int Addamo=5000;
   public void Mark(String name,int mark)
    {
	int amount=15000;
	
	if(mark==50)
	{
	    System.out.println("Student Name = "+name);
	    System.out.println("Student Mark = "+mark);
	    System.out.println("Scholarship Amount = "+amount);
	}
	else if((mark>50)&&(mark<=100))
	{
	    System.out.println("Student Name = "+name);
	    System.out.println("Student Mark="+mark);
	    int total=amount+Addamo;
	    System.out.println("Scholarship Amount = "+total);
	}
	else 
	{
	    System.out.println("**You are not eligible for Scholarship Amount**");
	}
    }
}

class Scholarship
{
   public static void main(String arg[])
    {
	sample vv=new sample();
	vv.Mark("Manoj",50);
    }
}

/*
If you will get 50 Marks then you eligible for Scholarship amount of 15000.
Then if you will get greater then 50 marks then you eligible for Extra 5000.
*/