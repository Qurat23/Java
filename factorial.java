import java.util.*;
class factorial
{
	public static void main(String ar[])
	{
		int num ,i, fact=1;
		System.out.println("Enter any number");
		Scanner Sc =new Scanner(System.in);
		num=Sc.nextInt();
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+num +" is "+fact);
	}
}