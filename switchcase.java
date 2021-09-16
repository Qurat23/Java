import java.util.*;
class switchcase 
{
	public static void main(String ar[])
	{
		int day;
		System.out.println("Enter any number between 1 to 7");
		Scanner Sc =new Scanner(System.in);
		day=Sc.nextInt();
		switch(day)
		{
			case 1:
			System.out.println("MONDAY");
			break;
			case 2:
			System.out.println("TUESDAY");
			break;
			case 3:
			System.out.println("WEDNESDAY");
			break;
			case 4:
			System.out.println("THURDAY");
			break;
			case 5:
			System.out.println("FRIDAY");
			break;
			case 6:
			System.out.println("SATURDAY");
			break;
			case 7:
			System.out.println("SUNDAY");
			break;
            default:
            System.out.println("Entered value is not correct");
		}
	}
}