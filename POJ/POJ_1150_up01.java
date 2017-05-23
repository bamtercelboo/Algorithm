package Algorithm;

import java.io.*;
import java.util.*;

public class POJ_1150_up01
{
  public static void main( String[] args )
  {
    Scanner in = new Scanner(System.in);
    POJ_1150_up01 main = new POJ_1150_up01();
    while ( in.hasNext() ) {
      int n = in.nextInt();
      int m = n - in.nextInt();
      //Integer result = main.f(n) / main.f(m);
      int result = main.g(n, m);
      System.out.println("Algorithm.Main.main() " +result );
      int re = 0;
      while( (re = result % 10) == 0 ){
        result /= 10;
      }
      System.out.println( re % 10 );
    }
  }
  public int f( int n )
  {
    int ans = 1;
    for( int i = 1 ; i <= n; i++ ){
      ans *= i;
      System.out.println("Algorithm.Main.f() " + ans);
    }
    System.out.println("Algorit " + n +" "+ ans);
    return ans;
  }
  public int g( int n , int m )
  {
    int ans = 1;
    for( int i = n; i > m; i--){
      ans *= i;
    }
    return ans;
  }
}
