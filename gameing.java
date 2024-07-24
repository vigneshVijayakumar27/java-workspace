class FF
{
   FF()
    {
	System.out.println("Gameing Charecters");
    }
   FF(int x,int y)
   {
	System.out.println(x);
	System.out.println(y);
	int sum=x+y;
	System.out.println("Total="+sum);
   }
   public void Noob()
    {
	System.out.println("Noob Power= "+"Any skills in use");
    }
   public void Alok()
    {
	System.out.println("Alok Power="+"Tuch the skill icon then increse HP in 10sec");
    }
   public void Wukong()
    {
	System.out.println("Wukong Power="+"Transform");
    }
}

class gameing
{
   public static void main(String arg[])
    {
	FF vv=new FF();
	vv.Noob();
	vv.Alok();
	FF yy=new FF(20,30);
    }
}