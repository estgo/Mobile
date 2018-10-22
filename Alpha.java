package Beta;
import java.util.Scanner;




public class Alpha {

  public static void main(String[] args)
   {
   Scanner scanner = new Scanner(System.in);
   System.out.println("Choose the price");
   double price = scanner.nextDouble();
   System.out.println("My price is: "+price);
   System.out.println("Choose the vatrate");
   double vatRate = scanner.nextDouble()/100;
   System.out.println("My vatRate is: "+vatRate);
   System.out.println("Choose the quantity");
   int quantity = scanner.nextInt();
   System.out.println("My unity is: "+quantity);
   
   
   
   
   double priceWithoutVat = price*quantity;
   double priceVat = priceWithoutVat*vatRate;
   double priceWithVat = priceWithoutVat+priceVat;
   
   System.out.println("The price including vat is: "+priceWithVat);
   
   }
}
