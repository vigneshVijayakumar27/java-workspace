import java.io.*;

class sample
{
		DataInputStream din=new DataInputStream(System.in);
	sample()
	{
		try{
				System.out.print("Enter Total NO. of Student : ");
				int Student=Integer.valueOf(din.readLine()).intValue();
				System.out.print("Enter No. of Exams : ");
				int Exams=Integer.valueOf(din.readLine()).intValue();
				for(int i=0;i<Student;i++)
				{
					System.out.println("Enter Student Name : ");
					String name=din.readLine();
					System.out.println("Enter Mark : ");
					for(int j=0;j<Exams;j++)
					{
							int marks=Integer.valueOf(din.readLine()).intValue();
					}
				}
		   }catch(Exception e){}
	}
}

class StudentN
{
	public static void main(String arg[]) 
	{
		new sample();
	}
}


/*
**OUTPUT**
Enter Total NO. of Student : 2
Enter No. of Exams : 2
Enter Student Name :
vignesh
Enter Mark :
70
88
Enter Student Name :
mani
Enter Mark :
7
78
*/