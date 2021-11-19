import java .util.*;
class square
{
	float area;
	int i;
	void cal_area(float side)
	{
		area = (float) side*side;
	}
	void area(int i)
	{
		System.out.println("area of square "+i+" is : "+area);
	}
}
class squareloop
{
	public static void main(String ar[])
	{
		int i;
		int num;
		System.out.println("Enter the no. of square whose area you want to see : ");
		Scanner Sc=new Scanner(System.in);
		num =Sc.nextInt();
		square s=new square();
		for (i=1;i<=num;i++)
		{
			s.cal_area(num+i);
			s.area(i);
		}
	}
}