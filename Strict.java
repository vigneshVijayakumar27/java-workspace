class shop1
{
    shop1(String pro1,String pro2,String pro3)
    {
		System.out.println("First Product : "+pro1);
		System.out.println("Second Product : "+pro2);
		System.out.println("Third Product : "+pro3);
		System.out.println();
    }
    shop1()
    {
		this("Banan","Apple","Orreng");
    }
}
 
class shop2 extends shop1
{
      shop2(String pro1,String pro2,String pro3)
       {
			System.out.println("First Product : "+pro1);
			System.out.println("Second Product : "+pro2);
			System.out.println("Third Product : "+pro3);
			System.out.println();
       }
      shop2()
       {
			this("Ereser","Pencil","Pen");
       }
}

class Strict
{
     public static void main(String arg[])
      {
			new shop2();
      }
}