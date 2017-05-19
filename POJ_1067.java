package Algorithm;
import java.io.*;
import static java.lang.Math.sqrt;
import java.util.*;
public class POJ_1067
{
  public static void main( String args[] ) throws Exception
  {
    Scanner in = new Scanner(System.in);
    int a,b;
    while( in.hasNext() ){
      a = in.nextInt();
      b = in.nextInt();
      if( a > b ){
        int temp;
        temp = a;
        a = b;
        b = temp;
      }
      boolean result = ( a == (int)(( b - a ) * ( 1 + sqrt(5)) / 2 ));
      if( result ){
        System.out.println("0");
      } else {
        System.out.println("1");
      }
    }
  }
}
