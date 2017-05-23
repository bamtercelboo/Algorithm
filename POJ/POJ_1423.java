package Algorithm;
import java.math.*;
import java.io.*;
import java.util.*;
public class POJ_1423
{
  public static void main( String[] args )
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    while ( n > 0 ) {
      int number = in.nextInt();
      if( number <= 3 ){
        System.out.println(1);
      } else {
        double result = 0.5*Math.log10( 2 * number * Math.PI) + number * Math.log10( number / Math.E)+1;
        System.out.println((int)(result));
      }
      n--;
    }
  }
}
