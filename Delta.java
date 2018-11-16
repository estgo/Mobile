package Beta;
import java.util.Scanner;
public class Delta {

  public static void main(String[] args)
   {
   Scanner in = new Scanner(System.in);
   System.out.println("Put your a");
   double a = in.nextDouble();
   System.out.println("Put your b");
   double b = in.nextDouble();
   System.out.println("Put your c");
   double c = in.nextDouble();
   
   double delta = Math.pow(b ,2)-4*a*c;
   System.out.println("Your delta is "+ delta);
   if (delta < 0)
       {
         System.out.println("You don't have a Solution");
       }
   else
        if (delta > 0)
          {
            double x1 = (-b+Math.sqrt(delta))/2*a;
            System.out.println("x1 = "+x1);
            double x2 = (-b-Math.sqrt(delta))/2*a;
            System.out.println("x2 = "+x2);
          }
          else if (delta == 0)
             {
               double x1= -b/2*a;
               System.out.println("x = "+x1);
          
          

             }
   in.close();
  }
  
}
