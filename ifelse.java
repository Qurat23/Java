import java.util.*;
class ifelse
{
	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
		if (num%2==0)
			System.out.println("Number is even");
		else
		    System.out.println("Number is odd");
	}
}