import java.util.Scanner;

public class Subtraction
{
  Subtraction()
  {

  }

  public static void minus()
  {
    Scanner in = new Scanner(System.in);

    System.out.println("Put your a");
    double a = in.nextDouble();
    System.out.println("Put your b");
    double b = in.nextDouble();


    double speicher = a - b;
    System.out.println("A - B = " + speicher);





  }




}
