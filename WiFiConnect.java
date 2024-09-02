class sample
 {
    String WiFi1="Jio";
    String WiFi2="Airtel";
    String wifi3="BSNL";
    public void Gvariable(int pass)
     {
	if(pass==3424)
	{
		System.out.println("WiFi Name : "+WiFi1);
		System.out.println("*** WiFi is Connected ***");
	}
	else if(pass==9343)
	{
		System.out.println("WiFi Name :"+WiFi2);
		System.out.println("*** WiFi is Connected ***");
	}
	else if(pass==8645)
	{
		System.out.println("WiFi Name :"+wifi3);
		System.out.println("*** WiFi is Connected ***");
	}
     }
 }

class WiFiConnect	
 {					    
     public static void main(String args[]) 
	{
		sample s=new sample();
		s.Gvariable(9343);
	}
 }
