// Mehak A maqsood
// CS113-018
// HW 01 part 1 
   import java.util.*;
      public class UnitConverter{
         public static void main (String [] args){
            int inches;
            double foot;
            Scanner scan= new Scanner(System.in);
            System.out.println(" Inches = ");
            inches= scan.nextInt();
            // for conversion
            foot= (inches/ 12);
            // print the average
            System.out.println("the value in feet = " + foot);
         }
      }