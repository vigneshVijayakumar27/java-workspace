class time
{
   public int Nur(int one,int two,int three,int fore,int five,int six,int seven,int eight,int nine,int ten,int leven,int twele)
    {
	int a=one;
	int b=two;
	int c=three;
	int d=fore;
	int e=five;
	int f=six;
	int g=seven;
	int h=eight;
	int i=nine;
	int j=ten;
	int k=leven;
	int l=twele;
	return a+k+100;
    } 
}

class clock
{
   public static void main(String args[])
    {
	time vv=new time();
	int tot=vv.Nur(1,2,3,4,5,6,7,8,9,10,11,12); 
	System.out.println(tot);
    }
}