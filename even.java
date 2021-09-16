import java.util.*;
class even{
	public static void main(String ar[])
	{
		int num ,i;
		System.out.println("Enter any number");
		Scanner Sc =new Scanner(System.in);
		num=Sc.nextInt();
		System.out.println("list of even numbers from 1 to " +num +":");
		for(i=1;i<num;i++)
		{
		    if(num%2==0)
		    {
			  System.out.print(i+" ");
		    }
	}
	}
}