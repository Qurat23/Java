import java.util.*;
class palindrome
{
	public static void main(String ar[])
	{
		int rem,num, temp,sum=0;
		System.out.println("Enter any number");
		Scanner Sc =new Scanner(System.in);
		num=Sc.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp == sum)
		   System.out.println("This is palindrome number");
	    else
           System.out.println("This is not a palindrome number");
	}
}