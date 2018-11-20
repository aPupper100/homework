import java.util.Scanner;
import java.lang.Math;

public class Fraction
{
   private int numerator;
   private int denominator;
   private static int count = 0;

   //Default Constructor
   public Fraction()
   {
      numerator = 0;
      denominator = 1;
      count++;

   }

   //Constructor with arguments
   public Fraction(int num, int denom)
   {
      if (denom == 0)
      {
         System.out.println("Cannot have 0 in the denominator.");
         numerator = 0;
         denominator = 1;
         count++;
      }

      else
      {
         //if either numerator or denominator is negative
         if(denom*num < 0)
         {
            num = Math.abs(num)*-1;  //numerator becomes negative
            denom = Math.abs(denom); //denominator always positive
         }
         numerator = num;
         denominator = denom;
         count++;
      }
   }

   private int gcd(int num1, int num2)
   {
      if (num1 < 0 || num2 < 0)
      {
         num1 = num1 * -1;
         num2 = num2 * -2;
      }

      while(num1 != num2)
      {
         if (num1 > num2)
            num1 = num1 - num2;

         else
            num2 = num2 - num1;
      }

      return num1;
   }

   public Fraction add(Fraction f2)
   {
      Fraction a = new Fraction((numerator * f2.denominator) +
                                (denominator * f2.numerator), (denominator * f2.denominator));

      return a;
   }

   public Fraction subtract(Fraction f2)
   {
      Fraction s = new Fraction( (numerator * f2.denominator) -
                                 (f2.numerator * denominator), (denominator * f2.denominator));

      return s;
   }

   public Fraction multiply(Fraction f2)
   {
      Fraction m = new Fraction( (numerator * f2.numerator), (denominator * f2.denominator));

      return m;
   }

   public Fraction divide(Fraction f2)
   {
      Fraction d = new Fraction( (numerator * f2.denominator), (denominator * f2.numerator));

      return d;
   }

   public String toString()
   {
      int fractionGcd = gcd(numerator,denominator);
      return (numerator/fractionGcd + "/" + denominator/fractionGcd);
   }

   public void printAsFloat()
   {
      //convert fraction to float with type casting
      float fraction = (float)numerator/denominator;
      System.out.println(fraction);
   }

   public static int numberOfFractions()
   {

      return count;
   }

   public static Fraction read()
   {
      Scanner kb = new Scanner(System.in);

      System.out.print("enter an integer numerator: \n");
      int nmr1 = kb.nextInt();
      System.out.println("enter an integer denominator: \n");
      int dmr1 = kb.nextInt();

      Fraction fraction1 = new Fraction(nmr1,dmr1);

      return fraction1;

   }
}
