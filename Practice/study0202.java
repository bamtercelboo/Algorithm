/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study02;

/**
 *
 * @author Administrator
 */
public class study0202
{

  public static void main( String[] args )
  {
    // TODO code application logic here
    System.out.println("题目：在一个字符串中找到第一个只出现一次的字符。如输入 abaccdeff，则输出 b。\n"
            + "分析：这道题是 2006 年 google 的一道笔试题。");
    study0202 study0202 = new study0202();
    char a = study0202.findfistchar("bababnmasdn");
    if ( a == ' ' )
    {
      System.out.println("没有相匹配的字符");
    }else{
       System.out.println("匹配的字符是 "+a);
    }
   

  }

  public char findfistchar( String string )
  {
    char[] message = string.toCharArray();
    for ( int i = 0; i < message.length; i++ )
    {
      System.out.print(message[i] + " ");
    }
    System.out.println();
    for ( int i = 0; i < message.length; i++ )
    {
      int number = 1;
      char nowchar = message[i];
      for ( int j = 0; j < message.length; j++ )
      {
        if ( j == i )
        {
          continue;
        }
        if ( nowchar == message[j] )
        {
          number++;
          break;
        }
      }
      if ( number == 1 )
      {
        return nowchar;
      }
    }
    return ' ';
  }

}
