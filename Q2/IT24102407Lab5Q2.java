import java.util.Scanner;

public class IT24102407Lab5Q2
{

    public static void main(String[] args)
  {

        Scanner scanner = new Scanner(System.in);
        
        
       System.out.println("Enter the nomber of new members introduced:");
        int nMembers=scanner.nextInt();
      
         if(nMembers<0)
           {
            System.out.println("number of new members be 0 or greater:");
           }
           else
         {
          String prize;
        switch(nMembers)
        {
         case 0:
              prize= "NO Prize";
               break;
           case 1:
              prize= "pen";
               break;
           case 2:
              prize= "Umbrella";
               break;
             case 3:
              prize= "Bag";
               break;
             case 4:
              prize= "Travelling Chair";
               break;
             default:
              prize= "Headphone";
               break;
        }
         System.out.println("prize is: " + prize);
     }
   }
}