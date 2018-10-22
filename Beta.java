package 
import java.util.Scanner;

public class Beta {

  public static void main(String[] args)
   {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Put your lenght");
    double lenght = scanner.nextDouble();
    System.out.println("Put your large");
    double large = scanner.nextDouble();
    System.out.println("Put your height");
    double height = scanner.nextDouble();
    System.out.println("Put your rayon");
    double rayon = scanner.nextDouble(); 
    System.out.println("Your lenght is: "+lenght);
    System.out.println("Your large is: "+ large);
    System.out.println("Your height is: "+height);
    System.out.println("Your rayon is: "+rayon);
    double l = lenght;
    double L = large;
    double h = height;
    double r = rayon;
    double d = r*2;
    double b = lenght;
    double a = large;
    
    
    double squarePerimeter = l*4;
    double squareSurface = l*l;
    double squareVolume = l*l*l;
    double rectanglePerimeter = 2*(l+L);
    double rectangleSurface = l*L;
    double rectangleVolume = l*L*h;
    double triangleSurface = (b*a)/2;
    double triangleVolume  = triangleSurface*h;
    double cerclePerimeter = Math.PI*d;
    double cercleSurface   = Math.PI*r*r;
    double cercleVolume    = cercleSurface*r*4/3;
    System.out.println("Your perimeter of a ");
    System.out.println("Square : "+squarePerimeter);
    System.out.println("Rectangle : "+rectanglePerimeter);
    System.out.println("Cercle : "+cerclePerimeter);
    System.out.println("Your surface of a ");
    System.out.println("Square : "+squareSurface);
    System.out.println("Rectangle : "+rectangleSurface);
    System.out.println("Triangle : "+triangleSurface);
    System.out.println("Cercle : "+cercleSurface);
    System.out.println("Your Volume of a ");
    System.out.println("Square : "+squareVolume);
    System.out.println("Rectangle : "+rectangleVolume);
    System.out.println("Triangle : "+triangleVolume);
    System.out.println("Cercle : "+cercleVolume);
    
   }

}
