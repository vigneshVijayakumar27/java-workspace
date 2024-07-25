class One
{
   public void Math()
    {
	int x=25;
	int y=22;
	int add=x+y;
	int sub=x-y;
	System.out.println("Add="+add);
	System.out.println("Sub="+sub);
	System.out.println(" ");
    }
   public void Math2()
    {
	int a,b,sum;
	a=5;
	b=5;
	sum=a+b;
	System.out.println(sum);
	System.out.println(" ");
    }
   public void Integers(int xx,String yy,int zz)
    {
	int aa=xx+zz;
	String bb=yy;
	System.out.println(aa);
	System.out.println(bb);
	System.out.println(" ");
    }
   public int Return()
    {
	int cc=66;
	int dd=55;
	int sum=cc+dd;
	return sum;
    } 
   public float Return2()
    {
	float Nur=44.675f;
	float Mur=55.325f;
	float Equls=Nur+Mur;
	return Equls;
    }
  public void Structure()
    {
	int Aa=30,Bb=35;
	System.out.println("Add="+(Aa+Bb));
	System.out.println("Sub="+(Aa-Bb));	
    }
  public void Total_s(int CC,int BB)
    {
	System.out.println(CC>BB);      // CC and BB is just a variable names
	System.out.println(CC>=BB);
	System.out.println(CC<BB);
	System.out.println(CC<=BB);
	System.out.println(CC==BB);
	System.out.println(CC!=BB);
    }
  public void Operators()
   {
	int rate=78;
	boolean qual=true;
	boolean offer=true;
	System.out.println("Kumar buy the "+"Fise");
	System.out.println((rate>65) && (qual==true) || (offer==true));
   }  
}

class Opetion
{
   public static void main(String []kk)
    {
	One vv=new One();
	vv.Math();
	vv.Math2();
	System.out.println(" ");
	vv.Integers(20,"Hi da",20);
	int total=vv.Return();
	System.out.println(total);
	System.out.println(" ");
	float total2=vv.Return2();
	System.out.println(total2);
	System.out.println(" ");
	vv.Structure();
	System.out.println(" ");
	vv.Total_s(8,9);
	System.out.println(" ");
	vv.Operators();
    }
}