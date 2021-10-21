class A extends Thread
{
	public void run()
	{
		try
		{
			for(int i =0;i<5;i++)
			{
				System.out.println(Thread.currentThread()+"from A="+i);
				Thread.sleep(1000);
			}
			int num1 = 10,num2 =20,sum;
			sum = num1+num2;
			System.out.println(Thread.currentThread()+"from A addition=" +sum);

		}
		catch(InterruptedException e)
		{
			System.out.println(e.toString());
		}
	}
}

class B extends Thread
{
	public void run()
	{
		try
		{
			for(int i =0;i<5;i++)
			{
				System.out.println(Thread.currentThread()+"from B="+i);
				Thread.sleep(1000);
			}
			int num1 = 40,num2 =20,sub;
			sub = num1-num2;
			System.out.println(Thread.currentThread()+"from B subtraction =" +sub);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.toString());
		}
	}
}
	
class C extends Thread
{
	public void run()
	{
		try
		{
			for(int i =0;i<5;i++)
			{
				System.out.println(Thread.currentThread()+"from C="+i);
				Thread.sleep(1000);
			}
			int num1 = 7,num2 =5,mul;
			mul = num1*num2;
			System.out.println(Thread.currentThread()+"from C multiplications =" +mul);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.toString());
		}
	}
}	

public class thread
{
   public static void main(String[] args)
    {
    	new A().start();
    	new B().start();
    	new C().start();
    }
}