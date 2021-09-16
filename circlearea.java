import java.util.*;
class circlearea
{
	public static void main(String ar[])
	{
		int rad ;
		double c_area, pi=3.14;
		System.out.println("Enter radius of circle");
		Scanner Sc =new Scanner(System.in);
		rad=Sc.nextInt();
		c_area=pi*rad*rad;
		System.out.println("Area of circle is : "+c_area);
	}
}