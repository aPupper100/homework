import java.util.Scanner;

public class FractionTest
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);

      System.out.println("Please enter 2 fractions --");

      System.out.println("Fraction 1: ");

      Fraction fractionReader = new Fraction();

      Fraction f1 = fractionReader.read();

      System.out.println("Fraction 2: ");

      Fraction f2 = fractionReader.read();

      Fraction added = f1.add(f2);
      Fraction subtracted = f1.subtract(f2);
      Fraction multiplied = f1.multiply(f2);
      Fraction divided = f1.divide(f2);

      System.out.println(f1 + " + " + f2 + " = " + added.toString() + " = ");
      System.out.println(f1 + " - " + f2 + " = " + subtracted.toString() + " = ");
      System.out.println(f1 + " * " + f2 + " = " + multiplied.toString() + " = ");
      System.out.println(f1 + " / " + f2 + " = " + divided.toString() + " = ");



   }
}
