import java .util.*;
class Area
{
	int length;
    int breadth;
	private void getinput()
	{
		System.out.println("Enter length and breadth of an area : ");
		Scanner Sc=new Scanner(System.in);
		length=Sc.nextInt();
		breadth=Sc.nextInt();
	}
	public int area()
	{
		getinput();
		return length*breadth;
	}
}

public class privatemethod
{
   public static void main(String[] args)
    {
	   Area obj1 = new Area();
	   int a= obj1.area();
	   System.out.println("area is = "+a);
    }
}