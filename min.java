import java.util.*;
class min
{
	public static void main(String ar[])
	{
		int num1,num2;
		System.out.println("Enter any two numbers");
		Scanner Sc =new Scanner(System.in);
		num1=Sc.nextInt();
		num2=Sc.nextInt();
		if(num1<num2)
		{
			System.out.println(num1+" is a minimum number");
		}
		else
		{
			System.out.println(num2+" is a minimum number");
		}
	}
}