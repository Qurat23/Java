import java.util.*;
class prime
{
	public static void main(String ar[])
	{
		int num ,i;
		boolean flag=false;
		System.out.println("Enter any number");
		Scanner Sc =new Scanner(System.in);
		num=Sc.nextInt();
		for(i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		System.out.println(num+" is a prime number");	
	    else
	    System.out.println(num+" is not a prime number");
	}
}