public class throw_{  
  static void validate_Age(int age)
    {  
     if(age<18)  
      throw new ArithmeticException("Not eligible to vote and drive!!");  
     else 
      System.out.println("Eligible to vote and drive!!");  
   }  
  public static void main(String args[])
  {  
      validate_Age(10);  
      System.out.println("rest of the code...");  
  }  
} 