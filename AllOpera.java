class sample
{
	int a;
	int b;
	int c;
	int d;
	int one;
	int two;
   sample(int x,int y,int z,int s)
    {
	this.a=x;
	this.b=y;
	this.c=z;
	this.d=s;
    }
   public void Method()
    {
	int output=a+one;
	System.out.println(output);
	output=b-c;
	System.out.println(output);
	output=c*d;
	System.out.println(output);
	output=a/2;
	System.out.println(output);
	output=25%3;
	System.out.println(output);
	String total=(a<b)?"True":"False";
	System.out.println(total);
    }
	
   public void Method2(int One,int Two)
    {
	this.one=One;
	this.two=Two;
	System.out.println(" ");
	System.out.println(one+two);
    }
}

class AllOpera
{
   public static void main(String arg[])
    {
	sample vv=new sample(20,25,30,35);
	vv.Method();
	vv.Method2(200,300);
    }
}