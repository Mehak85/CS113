// Mehak A maqsood
// CS113-018
// HW 01 part 3 
import java.util.Scanner;
  public class Weight{
    public static void main( String [] args){
      int kilo, grams, total,milli;
      Scanner scan= new Scanner (System.in);
      System.out.println(" Milligrams = " );
      total=scan.nextInt();
      kilo= (total/1000000);
      total=(total%1000000);
      grams=(total/1000);
      milli= (total%1000);
      System.out.printf("%d Kilo(s), %d gram(s), %d milligram(s)", kilo,grams, milli);
      }
      }
      
      
      
      