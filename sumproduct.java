import java.util.*;
class sumproduct
{
	public static void main(String ar[])
	{
		int num1,num2,sum=0,pro=0;
		System.out.println("Enter any two numbers");
		Scanner Sc =new Scanner(System.in);
		num1=Sc.nextInt();
		num2=Sc.nextInt();
		sum=num1+num2;
		pro=num1*num2;
		System.out.println(sum+" is the SUM of these two number's");
		System.out.println(pro+" is the PRODUCT of these two number's");
	}
}