import java.util.*;
class reversedpyramid
{
	public static void main(String ar[])
	{
		int num ,i,j;
		System.out.println("Enter the number of rows");
		Scanner Sc =new Scanner(System.in);
		num=Sc.nextInt();
		for(i=num; i>=1; --i)
		{
			for(j=1; j<=i; ++j)
			{
			   System.out.print(" * ");
			}
	        System.out.println();    		
		}
	}		
}
