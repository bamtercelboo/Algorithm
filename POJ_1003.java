package Algorithm;
import java.io.*;
import java.util.*;
public class POJ_1003
{
  public static void main( String args[] ) throws Exception
  {
    Scanner in = new Scanner(System.in);
    while ( in.hasNext() ) {
      double length = in.nextFloat();
      if( length == 0 ){
        break;
      }
      if ( length <= 0.5 ) {
        System.out.println("1 card(s)");
        continue;
      }
      int card = 1;
      double sum = 0.5;
      int base = 2;
      do {
        card++;
        sum += 1.0 / (++base);
      } while ( sum < length );
      System.out.println(card + " card(s)");
    }
  }
}
