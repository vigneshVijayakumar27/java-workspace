package pack1;
import java.util.*;
class morning
{
	String Name;
     morning()
      {
	Scanner ip=new Scanner(System.in);
	System.out.println("Enter your name : ");
	String name=ip.nextLine();
	this.Name=name;
      }
     public void Method1()
      {
	System.out.println("Your Name : "+Name);
       }
}