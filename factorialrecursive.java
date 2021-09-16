import java.util.*;
class factorialrecursive
{   
	static int factorial(int num)
	{
	  if(num==0)
			return 1;
		else
			return(num*factorial(num-1));
	}
	public static void main(String ar[])
	{
		int num ,i, fact=1;
		System.out.println("Enter any number");
		Scanner Sc =new Scanner(System.in);
		num=Sc.nextInt();
		fact=factorial(num);
		System.out.println("Factorial of "+num +" is "+fact);
	}
}