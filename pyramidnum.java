import java.util.*;
class pyramidnum
{
	public static void main(String ar[])
	{
		int num ,i,j;
		System.out.println("Enter the number of rows");
		Scanner Sc =new Scanner(System.in);
		num=Sc.nextInt();
		for(i=1; i<=num; i++)
		{
			for(j=1; j<=i; j++)
			{
			   System.out.print(j+" ");	
			}
	    System.out.println();		
		}
	}		
}