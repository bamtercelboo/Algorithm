package Algorithm;
import java.io.*;
import java.util.*;
public class POJ_1006
{
  public static void main( String args[] ) throws Exception
  {
    Scanner in = new Scanner(System.in);
    int p,e,i,d,n,m = 1;
    while(in.hasNext()){
      p = in.nextInt();
      e = in.nextInt();
      i = in.nextInt();
      d= in.nextInt();
      if( p == -1 && e == -1 && i == -1 && d == -1 ){
        break;
      }
      n=( 5544 * p + 14421 * e + 1288 * i - d ) % 21252;/*三个除数的最小公倍数*/ 
      if( n <= 0 ){
        n = 21252 - d;
      }
      if( n > 0 ){
        System.out.println("Case "+ (m++) +": the next triple peak occurs in "+ n +" days.");
      }
    }
  }
}
