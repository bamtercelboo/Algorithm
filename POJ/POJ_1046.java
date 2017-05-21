package Algorithm;
import java.io.*;
import static java.lang.Math.sqrt;
import java.util.*;
public class POJ_1046
{
  public static void main( String args[] ) throws Exception
  {
    Scanner in = new Scanner(System.in);
    int []R = new int[16];
    int []G = new int[16];
    int []B = new int[16];
    int r,g,b;
    double min;
    double tempmin;
    int temp = 0;
    for(int i = 0; i < 16; i++){
      R[i] = in.nextInt();
      G[i] = in.nextInt();
      B[i] = in.nextInt();
    }
    while(in.hasNext()){
      min = 10000;
      r = in.nextInt();
      g = in.nextInt();
      b = in.nextInt();
      if( r == -1 && g == -1 && b == -1 ){
        break;
      }
      for( int i = 0; i < 16; i++ ){
        tempmin = sqrt(1.0*((r - R[i]) * (r - R[i])+(g - G[i]) * (g - G[i])+(b - B[i]) * (b - B[i])));
        if( min > tempmin ){
          min = tempmin;
          temp = i;
        }
      }
      System.out.println("("+ r +","+ g +","+ b +") maps to ("+ R[temp]+","+ G[temp] +","+ B[temp] +")");
    }
  }
}
