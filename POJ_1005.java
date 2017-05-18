package Algorithm;
import java.io.*;
import java.util.*;
public class POJ_1005
{
  public static void main( String args[] ) throws Exception
  {
    Scanner in = new Scanner(System.in);
    float year,PI = (float) Math.acos(-1);
    int i = 1;
    int num = in.nextInt();
    while ( i <= num ) {
      float x = in.nextFloat(),y=in.nextFloat();
      year = PI*(x*x +y*y)/100;
      System.out.println("Property "+ (i++) +": This property will begin eroding in year "+ ((int)year+1)+".");
    }
    System.out.println("END OF OUTPUT.");
  }
}
