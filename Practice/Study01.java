/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study01;

import java.util.Random;

/**
 *
 * @author Administrator
 */
public class Study01
{

  /**
   * @param args the command line arguments
   */
  public static void main( String[] args )
  {
    // TODO code application logic here
    int n = 30;//n表示数组中多少个数据
    int number = 100;//number是随机数范围
    //创建对象
    Study01 study01 = new Study01();
    //数组数据随机生成
    int[] b = study01.random(n, number);
    //打印为未排序数组
    System.out.println("随机生成00--99的随机数(未排序)");
    study01.printArray(b);
    //调用排序
    study01.bubblesort(b);
    //输出排序结果
    System.out.println("数组排序、偶数在前、奇数在后、偶数从小到大。奇数从大到小（已排序）");
    study01.printArray(b);
  }

  /**
   * 随机产生数组数据
   *
   * @param n 代表数组中元素个数
   * @param number 代表随机数产生范围00--number
   * @return
   */
  public int[] random( int n, int number )
  {
    int a[] = new int[n];
    Random random = new Random();
    int i;
    for ( i = 0; i < n; i++ )
    {
      int temp = random.nextInt(number);
      a[i] = temp;
    }
    return a;
  }

  /**
   * 改进冒泡排序算法
   *
   * @param a 待排序数组
   */
  public void bubblesort( int[] a )
  {
    int i, j;
    for ( i = 0; i < a.length; i++ )
    {
      for ( j = 0; j <= i; j++ )
      {
        if ( isswap(a[i], a[j]) )
        {
          int k = j;
          int temp;
          temp = a[i];
          a[i] = a[k];
          a[k] = temp;
        }
      }
    }
  }

  /**
   * 判断两个比较的数据是否需要发生交换使偶数在前，奇数在后
   *
   * @param a 待比较数据
   * @param b 待比较数据
   * @return
   */
  public boolean isswap( int a, int b )
  {
    if ( a % 2 == 0 && b % 2 != 0 )
    {
      return true;//交换
    }
    if ( a % 2 != 0 && b % 2 == 0 )
    {
      return false;//不交换
    }
    if ( a % 2 == 0 && b % 2 == 0 )
    {
      return a < b;
    }
    return a > b;
  }

  /**
   * 打印数组数据
   *
   * @param a 排序的数组
   */
  public void printArray( int a[] )
  {
    int i;
    for ( i = 0; i < a.length; i++ )
    {
      System.out.print(a[i] + "  ");
    }
    System.out.println();
    System.out.println();
  }
}
