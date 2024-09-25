class sample
{
	String College;
	String ID;
	String Address;
    sample(String Col, String id, String add)
      {
	College=Col;
	ID=id;
	Address=add;

	System.out.println("Your College = "+College);
	System.out.println("Your ID = "+ID);
	System.out.println("Your Address = "+Address);
      }
     sample()
      {
	this("MASC","21BCS1061","Namakkal");
      }
}

class Twocon
{
     public static void main(String arg[])
      {
	sample obj=new sample();
	//obj.
      }
}