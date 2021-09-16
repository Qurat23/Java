import java.util.*;
class elseif
{
	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter the number between 1 to 100");
		Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
		if (num>1 && num<=30)
		{
			System.out.println("This number is between 1 to 30");
		}
		else if(num>31 && num<=60)
		{
		    System.out.println("This number is between 31 to 60");
		}
	    else if(num>61 && num<=100)
	    {
		    System.out.println("This number is between 61 to 100");
	    }
		else
		{
		    System.out.println("You have enter wrong value");
		}
	}
}