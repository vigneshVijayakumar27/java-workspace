class normal
{
    normal()
     {
	System.out.println("****************************");   // Consturstor
     }
    normal(int c,String d)                                  
     {
	System.out.println("C="+c);
	System.out.println("D="+d);
     }
   public void Hi()                                          // Methods
    {
	int y=22+8;
	System.out.println("Y="+y);
	System.out.println("Hello I'm vignesh");
    }
   public void Hi2()
    {
	int x=3022;
	System.out.println(x);
    }
}

class naturels
{
   public void Hi3(int z,int a)                                     // Perameters
    {
	System.out.println("Z="+z);
	System.out.println("A="+a);
	byte b=2*2;
	System.out.println("B="+b);
    }
}

class Main_method
{
   public int Normals()
    {
	int aa=2200;
	return aa;
    }
   public int Normals2(int nan)
    {
	int aaa=nan;
	return aaa;
    }
}

class third
{
   public int Third()
     {
	byte oo=2;
	return oo;
     }
}

class S_tring
{
   public static void main(String arag[])
    {
	normal vv=new normal();
	normal vv2=new normal(2000,"Twothousen");            // Arguments
	vv.Hi();
	vv.Hi2();
	naturels yy=new naturels();
	yy.Hi3(22,33);	

	Main_method yy2=new Main_method();
	int total=yy2.Normals();
	System.out.println("AA Values = "+total);
	int total2=yy2.Normals2(13002);
	System.out.println("AAA Values = "+total2);
	int totla3=total+total2;
	System.out.println("TOTAL = "+totla3);

	third yy3=new third();
	int TOTAL2=yy3.Third();
	System.out.println("values ="+TOTAL2);
	int kala=total+TOTAL2;
	System.out.println("AMOUNT = "+kala);
	
    }
}