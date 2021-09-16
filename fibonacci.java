import java.util.*;
class fibonacci{
	public static void main(String ar[])
	{
		int n1=0,n2=1 ,n3,i,num;
		System.out.println("Enter any number");
		Scanner Sc =new Scanner(System.in);
		num=Sc.nextInt();
		System.out.print(n1+" "+n2);
		for(i=2;i<num;i++)
		{
			n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
		}
	}
}