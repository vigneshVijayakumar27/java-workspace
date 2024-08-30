
class sample
{
   public void month(String Month)
    {
	System.out.println(" - - - -2024 - - - -");
	if(Month=="January")
	{
	    System.out.println("   ***January***");
  	    System.out.print(""" 
			  1  2  3  4  5  6  7  
			  8  9  10 11 12 13 14 
			  15 16 17 18 19 20 21 
			  22 23 24 25 26 27 28 
			  29 30 """);
	}
	else if(Month=="February")
	{
	    System.out.println("   ***February***");
  	    System.out.print(""" 
			           1  2  3  4  
			  5  6  7  8  9  10 11
			  12 13 14 15 16 17 18 
			  19 20 21 22 23 24 25 
			  26 27 28 29 """);
	}
	else if(Month=="March")
	{
	    System.out.println("   ***March***");
  	    System.out.print(""" 
			              1  2  3  
			  4  5  6  7  8  9  10 
			  11 12 13 14 15 16 17 
			  18 19 20 21 22 23 24 
			  25 26 27 28 29 30 31 """);
	}
	else if(Month=="April")
	{
	    System.out.println("   ***April***");
  	    System.out.print(""" 
			  1  2  3  4  5  6  7  
			  8  9  10 11 12 13 14 
			  15 16 17 18 19 20 21 
			  22 23 24 25 26 27 28 
			  29 30 """);
	}
	else if(Month=="May")
	{
	    System.out.println("   ***May***");
  	    System.out.print(""" 
			        1  2  3  4  5 
			  6  7  8  9  10 11 12 
			  13 14 15 16 17 18 19 
			  20 21 22 23 24 25 26 
			  27 28 29 30 31 """);
	}
	else if(Month=="June")
	{
	    System.out.println("   ***June***");
  	    System.out.print(""" 
			                 1  2  
			  3  4  5  6  7  8  9  
			  10 11 12 13 14 15 16 
			  17 18 19 20 21 22 23 
			  24 25 26 27 28 29 30 """);
	}
	else if(Month=="July")
	{
	    System.out.println("   ***April***");
  	    System.out.print(""" 
			  1  2  3  4  5  6  7  
			  8  9  10 11 12 13 14 
			  15 16 17 18 19 20 21 
			  22 23 24 25 26 27 28 
			  29 30 31 """);
	}
	else if(Month=="August")
	{
	    System.out.println("   ***August***");
  	    System.out.print(""" 
			           1  2  3  4  
			  5  6  7  8  9  10 11
			  12 13 14 15 16 17 18 
			  19 20 21 22 23 24 25 
			  26 27 28 29 30 31""");
	}
	else if(Month=="September")
	{
	    System.out.println("   ***September***");
  	    System.out.print(""" 
			                    1  
			  2  3  4  5  6  7  8  
			  9  10 11 12 13 14 15 
			  16 17 18 19 20 21 22 
			  23 24 25 26 27 28 29 
			  30 """);
	}
	else if(Month=="October")
	{
	    System.out.println("   ***October***");
  	    System.out.print(""" 
			     1  2  3  4  5  6  
			  7  8  9  10 11 12 13 
			  14 15 16 17 18 19 20 
			  21 22 23 24 25 26 27 
			  28 29 30 31 """);
	}
	else if(Month=="November")
	{
	    System.out.println("   ***November***");
  	    System.out.print(""" 
			              1  2  3  
			  4  5  6  7  8  9  10 
			  11 12 13 14 15 16 17 
			  18 19 20 21 22 23 24 
			  25 26 27 28 29 30  """);
	}
	else if(Month=="December")
	{
	    System.out.println("   ***December***");
  	    System.out.print(""" 
			                    1  
			  2  3  4  5  6  7  8  
			  9  10 11 12 13 14 15 
			  16 17 18 19 20 21 22 
			  23 24 25 26 27 28 29 
			  30 31""");
	}
    }
}
class Month1
{
   public static void main(String ara[])
    {
	sample vv=new sample();
	vv.month("July");
    }
}