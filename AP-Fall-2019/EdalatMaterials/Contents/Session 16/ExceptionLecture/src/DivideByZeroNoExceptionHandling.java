// Fig. 11.2: DivideByZeroNoExceptionHandling.java
// Integer division without exception handling.
import java.util.Scanner;

public class DivideByZeroNoExceptionHandling
{
   // demonstrates throwing an exception when a divide-by-zero occurs
   public static int quotient(int numerator, int denominator)
   {
      if(denominator != 0)
      return numerator / denominator;
      else return 0;// possible division by zero
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Please enter an integer numerator: ");
      int numerator = 0;

         numerator = scanner.nextInt();
         System.out.print("Please enter an integer denominator: ");
         int denominator = scanner.nextInt();

         int result = quotient(numerator, denominator);
         System.out.printf(
                 "%nResult: %d / %d = %d%n", numerator, denominator, result);
      }
   }
 // end class DivideByZeroNoExceptionHandling


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
