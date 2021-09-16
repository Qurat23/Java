import java.util.*;
class leap
{
	public static void main(String ar[])
	{
		int year;
		System.out.println("Enter any year");
		Scanner Sc =new Scanner(System.in);
		year=Sc.nextInt();
		if(year%4==0)
		{
			System.out.print("This is a leap year");
		}
		else
		{
			System.out.print("This is not a leap year");
		}
	}
}