
package study03;

public class n_least_num
{
   public static void main( String[] args )
  {
    /**
     * 算法描述：
     * 实现输出数组中k个最小的数字
     * 算法思想：
     * 对原数组进行快速排序，排序结果从小到大
     * 输出k个数
     */
    int k = 4;
    int a[] = {12,45,2,35,56,14,56,44,89,100};
    for( int i = 0; i < a.length; i++ )
      System.out.print(a[i]+" ");
    System.out.println();
    
    n_least_num n_least_number  = new n_least_num();
    
    //快速排序
    System.out.println("快速排序");
    n_least_number.quickSort(a, 0, a.length-1);
    for( int i = 0; i < a.length; i++ )
      System.out.print(a[i]+" ");
    
    System.out.println();
    //选择排序
    System.out.println("选择排序");
    n_least_number.selectSort( a, a.length );
    for( int i = 0;i < a.length; i++ )
      System.out.print(a[i]+" ");
    System.out.println();
    
    System.out.println("冒泡排序");
    n_least_number.bubbleSort(a, a.length);
    for( int i = 0; i < a.length; i++ )
      System.out.print( a[i]+" " );
    System.out.println();
  }
   /**
    * 快速排序算法（递归算法）
    * @param array 未排序数组
    * @param low  最低位
    * @param high  最高位
    */
  public void quickSort( int array[] ,int low , int high )
  {
    if( low < high )
    {
      int i = low;
      int j =high;
      int value = array[i];
      while( i < j )
      {
         while( i < j && array[j] > value )
         {
           j--;
         }
         if( i < j )
         {
           array[i++] = array[j];
         }
         while( i < j && array[i] < value )
         {
           i++;
         }
         if( i < j )
         {
           array[j--] = array[i];
         }
      }
      array[i] = value;
      quickSort( array, low, i - 1 );
      quickSort(array, i + 1, high);
    }
  }
  
  /**
   * 选择排序算法
   * @param array 未排序数组
   * @param n  数组长度
   */
  public void selectSort( int array[] , int n )
  {
    int i , j ,d =0;
    int temp;
    for( i = 0; i < n - 1; i++ )
    {
      d = i;
      for( j = i + 1; j < n; j++)
      {
        if( array[j] > array[d] )
          d = j;
      }
    if( d != i)
    {
      temp = array[d];
      array[d] = array[i];
      array[i] = temp;
    }
    }
  }
  
  /**
   * 冒泡排序算法
   * @param array
   * @param n 
   */
  public void bubbleSort( int array[] , int n )
  {
    int i,j,temp;
    for( i = 0; i < n; i++ )
      for( j = i; j < n; j++)
        if( array[i] > array[j])
        {
          temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
  }
}
