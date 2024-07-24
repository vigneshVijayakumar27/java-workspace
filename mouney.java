class Rupees
{
  public void Ten()
   {
	System.out.println("Ten Rupees="+(10));
   }
  public void Twenty()
   {
	System.out.println("Twenty Rupees="+(20));
   }
  public void Fifty()
   {
	System.out.println("Fifty Rupees="+(50));
   }
  public void One_Hundred()
   {
	System.out.println("One_Hundred Rupees="+(100));
   }
  public void Two_Hundred()
   {
	System.out.println("Two_Hundred Rupees="+(200));
   }

  public void Five_Hundred()
   {
	System.out.println("Five_Hundred Rupees="+(500));
   }
  public void Two_Thousand()
   {
	System.out.println("Two_Thousand Rupees="+(2000));
   }
}

class mouney
{
   public static void main(String arag[])
    {
 	Rupees vv=new Rupees();
	vv.Ten();
	vv.Twenty();
	vv.Fifty();
	vv.One_Hundred();
	vv.Two_Hundred();
	vv.Five_Hundred();
	vv.Two_Thousand();
    }
}