import java.util.Scanner;
//import Calculator.Addition;
public class Calculator
{
  public static void main(String[] args)
  {
     Scanner in = new Scanner(System.in);
     char operation;
     boolean continueA;
     continueA = true;
     while(continueA){
       System.out.println("Write + or - or q");
       operation = in.next().charAt(0);

       switch(operation)
       {
         case '+' :
          Addition addObject = new Addition();
          addObject.add();
        break;

        case '-' :
         Subtraction.minus();

       break;

       case 'q' :
       continueA = false;
       break;

       default :
       System.out.println("Not available Operation");
       break;


       }
   }


     in.close();
  }

}
