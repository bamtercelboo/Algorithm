package Algorithm;
import java.io.*;
import java.util.*;
public class POJ_1007
{
  public static void main( String args[] ) throws Exception
  {
    POJ_1007 main = new POJ_1007();
    Scanner in = new Scanner(System.in);
    int stringLength = in.nextInt();
    int StringCount = in.nextInt();
    String[] str = new String[StringCount];
    int[] strSort = new int[StringCount];
    int count = 0;
    int icount = 0;
    //输入
    while ( icount < StringCount) {
      str[icount] = in.next();
      if( str[icount].length() != stringLength){
        System.out.println("Wrong Input");
        break;
      }
      count = main.InvertNum(str[icount]);
      strSort[icount++] = count;
    }
    System.out.println("Algorithm.Main.main()");
    
    //排序
    for( int i = 0; i < strSort.length; i++ ){
      for( int j = i; j <strSort.length; j++ ){
        if( strSort[i] > strSort[j] ){
          int temp = strSort[i];
          strSort[i] = strSort[j];
          strSort[j] = temp;
          
          String tempstr = null;
          tempstr = str[i];
          str[i] = str[j];
          str[j] = tempstr;
        }
      }
      System.out.println(str[i]);
    }
    
  }
  
  //计算逆序数
  public int InvertNum( String str )
  {
    int num = 0;
    char[] arr = str.toCharArray();
    for( int i = 0; i < arr.length; i++ ){
      for(int j = i+1; j < arr.length; j++ ){
        if( arr[i] > arr[j] ){
          num++;
        }
      }
    }
    return num;
  }
 
}
