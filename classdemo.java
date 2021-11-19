import java .util.*;
class rectangle
{
	int length;
    int breadth;
	public void getinput()
	{
		System.out.println("Enter length and breadth of an area : ");
		Scanner Sc=new Scanner(System.in);
		length=Sc.nextInt();
		breadth=Sc.nextInt();
	}
	public int ract_area()
	{
		return length*breadth;
	}
}

class area
{
	int side;
	public void getinput()
	{
		System.out.println("Enter the side of square : ");
		Scanner Sc=new Scanner(System.in);
		side =Sc.nextInt();
	}
	public int squ_area()
	{
		return side*side;
	}
}
public class classdemo
{
   public static void main(String[] args)
    {
       rectangle obj0 =new rectangle();
       obj0.getinput();
       int a= obj0.ract_area();
       System.out.println("area of rectangle = "+a);
	   area obj1=new area();
	   obj1.getinput();
	   int b= obj1.squ_area();
	   System.out.println("area of square = "+b);
    }
}