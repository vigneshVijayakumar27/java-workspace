import pack1.Key;

class sample extends Key
{
            String Move1,Move2,Move3;
     sample(String Mov1,String Mov2,String Mov3)
      {
	this.Move1=Mov1;
	this.Move2=Mov2;
	this.Move3=Mov3;
      }
    public void Method1()
      {
	System.out.println(Move1);
	System.out.println(Move2);
	System.out.println(Move3);
      }
}

class Map
{
      public static void main(String arg[])
       {
	sample vv=new sample("Kanguva","Leo","Kuruvi");
	vv.Method1();
        }
}