import java.util.Scanner;

public class IT24102407Lab5Q1
{

    public static void main(String[] args)
  {
         int max,min;
    
        Scanner sc= new Scanner(System.in);
        
       System.out.println("Enter first integer:");  
       int no01= sc.nextInt();      
       System.out.println("Enter second integer:");  
       int no02= sc.nextInt();
       System.out.println("Enter third integer:");  
       int no03= sc.nextInt();
      System.out.println("User entered numbers are: " + no01 + " " + no02 + " " + no03);

       
       if (no01 >= no02 && no01 >= no03) {
    max = no01;
} else if (no02 >= no01 && no02 >= no03) {
    max = no02;
} else {
    max = no03;
}

if (no01 <= no02 && no01 <= no03) {
    min = no01;
} else if (no02 <= no01 && no02 <= no03) {
    min = no02;
} else {
    min = no03;
}

          System.out.println("The smallest no is"+min);
          System.out.println("The largest no is"+max);
         }
}   
 