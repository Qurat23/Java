import java.util.*;
class pyramid
{
	public static void main(String ar[])
	{
		int num ,i,j;
		System.out.println("Enter the  number of rows");
		Scanner Sc =new Scanner(System.in);
		num=Sc.nextInt();
		for(i=0; i<num; i++)
		{
			for(j=0; j<=i; j++)
			{
			   System.out.print(" * ");	
			}
	    System.out.println();		
		}
	}		
}
