import java.util.*;
class stack
{
	int num=10,top;
	int stk[] = new int [num];
	stack()//constructor
	{
		top=-1;
	}
	void push (int item)
	{
		if(top==num)
			System.out.println("stack is full");
		else
			stk[++top] =item;
	}
	int pop()
	{
	    if(top<0)
	    {
	     	System.out.println("stack is empty");
	     	return 0;
	    }
	    else
	     	return stk[top--];
	}
}
class stackclass
{
 public static void main (String ar[])
 { 
 	int n,item;
 	stack obj1=new stack();
 	Scanner sc=new Scanner(System.in);  
    System.out.print("Enter the number of elements you want to store: ");   
    n=sc.nextInt();   
    System.out.println("Enter the elements of the stack: ");  
    for(int i=0; i<n; i++)  
    {  
    item=sc.nextInt(); 
    obj1.push(item); 
    }  
    System.out.println("Popped elements are: ");  
    for (int i=0; i<n; i++)   
    {  
    System.out.println(obj1.pop());  
    }  
 }  
}  