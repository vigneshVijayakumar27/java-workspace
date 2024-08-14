class yono
{   
    public int casecare(String accountName,int Balance,int date,int amount)
      {
	System.out.println("AccountName="+accountName);
	System.out.println("Amount="+Balance);
	System.out.println("Withdrawl Date="+date);
	System.out.println("Withdrawl Amount="+amount);
	System.out.println("-----------------------------");
      }
}

class yono2
{
    public int game(String accountname,int balance,int Date,int Amount)
      {
	System.out.println("AccountName="+accountname);
	System.out.println("Amount="+balance);
	System.out.println("Withdrawl Date="+Date);
	System.out.println("Withdrawl Amount="+Amount);
        int sum=balance-Amount;
	System.out.println("Balance=s"+sum);
	System.out.println("-----------------------------");
      }
}

class yono3
{
    public int Mark(int x,int y,int z,long a,float b,double c)
      {
	System.out.println("X="+x);
	System.out.println("Y="+y);
	System.out.println("Z="+z);
	System.out.println("A="+a);
	System.out.println("B="+b);
	System.out.println("C="+c);
      }
}

class Bank
{
    public static void main(String arag[])
      {
	yono vv=new yono();
	yono2 bar=new yono2();
	yono3 total=new yono3();
	int value1=vv.casecare("Kumar",20000,2018,2000);
	int value2=bar.game("Arun",100000,2007,50000);
	int value3=total.Mark(50,20000,150000,500000000l,99.99f,100.223344);
	System.out.println(value1);
	System.out.println(value2);
	System.out.println(value3);
      }
}