class normal
{
   public String Normal_Pursons()
    {
	String x="Normal Pursons = "+"Normal purson is used only simple dreses,simple life styles";
	return x;
    }
   public String Popular_Pursons(String a)
    {
	String y=a;
	return y;
    }
}

class thote
{
   public static void main(String []arg)
     {
	normal vv=new normal();
 	String Thote=vv.Normal_Pursons();
	System.out.println(Thote);
	System.out.println("                   ");
	String Thote2=vv.Popular_Pursons("Popular Pursons = "+"Popular Pursons is used many kind of dreses and then Smart life styles");
	System.out.println(Thote2);
	System.out.println("                   ");
	normal vv2=new normal();
	String Thote3=vv2.Popular_Pursons("Defferent Pursons = "+"Some pursons is think defferent hangles and defferent thotes");
	System.out.println(Thote3);
     }
}