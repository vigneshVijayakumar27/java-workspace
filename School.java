class School                     // Main class
{
  public static void main(String args[])
   {
	subjects vv=new subjects();
	vv.Tamil();
	vv.English();
	vv.Math();
	vv.Science();
	vv.Social();
   }
}

class subjects
{
   public void Tamil()
    {
	String T="Tamil - "+" (அ  ஆ இ ஈ உ ஊ எ ஒ ஓ ஔ ஃ) ";				     
	System.out.println(T);
	System.out.println(" ");
    }
   public void English()
    {
	String eng="English - "+"(a b c d e f g h i  j k l m n o p q r s t u v w x y z)";
	System.out.println(eng);
	System.out.println(" ");
    }
   public void Math()
    {
	String maths="Mathemetics - "+"(+ - * / % =)";
	System.out.println(maths);
	System.out.println(" ");
    }
   public void Science()
    {
	String Sce="Science - "+("A system of knowledge about the physic,chemistry and biology is called science.");
	System.out.println(Sce);
	System.out.println(" ");
    }
   public void Social()
    {
	String SS="Social Science - "+"Social Science is the study of people and society. 'Science of society.' " ;
	System.out.println(SS);
    }
}



