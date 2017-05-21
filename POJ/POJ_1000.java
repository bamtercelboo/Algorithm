package Algorithm;
import java.io.*;
import java.util.*;
public class POJ_1000
{
  public static void main( String args[] ) throws Exception
  {
    long start = System.currentTimeMillis(); 
    
    
    Scanner cin = new Scanner(System.in);
    if(cin.hasNext()){
      System.out.println(cin.nextInt() + cin.nextInt());
    }
    long end = System.currentTimeMillis();        
    System.out.println("运行时间："+(end-start)+"毫秒");
  }
}
