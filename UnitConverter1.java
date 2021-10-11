
   import java.util.*;
      public class UnitConverter1{
         public static void main (String [] args){
         float grams, pound;
         Scanner scan = new Scanner(System.in);
         System.out.println(" grams= ");
         grams=scan.nextFloat();
         pound= (grams/453.592f);
         System.out.println(" pound= " + pound);
         }
        }
