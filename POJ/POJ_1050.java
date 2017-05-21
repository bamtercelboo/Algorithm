package Algorithm;
import java.io.*;
import static java.lang.Math.sqrt;
import java.util.*;
public class POJ_1050
{
  public static void main( String args[] ) throws Exception
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[][] array = new int[n][n];
    //初始化数组
    for( int i = 0; i < n; i++ ){
      for( int j = 0; j < n; j++ ){
        array[i][j] = in.nextInt();
      }
    }
    //处理
    int smax = 0;
     for( int i = 0; i < n; i++ ){
       int[] sum = new int[n];
       for( int j = i; j < n; j++){
         for( int k = 0; k < n; k++ ){
           sum[k] += array[j][k];
         }
         int b = 0;
         for( int m = 0; m < n; m++ ){
           if( b > 0 ){
             b += sum[m];
           } else {
             b = sum[m];
           }
           if( b > smax ){
             smax = b;
           }
         }
       }
     }
     System.out.println(smax);
  }
}
