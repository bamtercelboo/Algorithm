package study03;

import java.util.*;

public class KMP_update
{
  public static void main( String[] args ) throws Exception
  {
    // TODO Auto-generated method stub
    //String srcc = "abcabcqbadqbac";
    //String srcc = "qabcqabcqa";
    //String srcc = "qqbbbbcdeabcqeeqabbbcdeqqbbbb";
    //String srcc = "abBmdbfnsadaajaiojjkjgfksnSdjajakfjoiaDjasdfdfdhasjkhdsfdsfabBznfbnzbfhebm";
    //String srcc = "谁我们是谁我们是谁我撒开了加中华民族大国加大卡沙发中华民族大国啊看见的";
    //String srcc = "banana";
    //String srcc = "abcdefg";
    String srcc = "aaaaa";
    KMP_update kmp = new KMP_update();
    kmp.KMPPattern(srcc);
  }

  //查找字符串中最长的重复的公共子串及其下标位置
  public void KMPPattern( String srcc ) throws Exception
  {
    try
    {
      System.out.println("字符串  " + srcc);
      int len = srcc.length();
      System.out.println("字符串长度 " + len);
      //记录最长重复子串
      String maxstr = "";
      //存储字符串
      Set set = new HashSet();
      for ( int i = 0; i < len; i++ )
      {
        for ( int j = i + 1; j < len; j++ )
        {
          String subs = srcc.substring(i, j);
          //System.out.println(subs);
          //字符串出现的开始位置
          int start = srcc.indexOf(subs);
          //System.out.println(start);
          //字符串出现的结束位置
          int end = srcc.lastIndexOf(subs);
          //System.out.println(end);
          if ( start != end && subs.length() > maxstr.length() )
          {
            set.clear();
            maxstr = subs;
            set.add(subs);
          } else if ( start != end && subs.length() == maxstr.length() )
          {
            maxstr = subs;
            set.add(subs);
          }
        }
      }
      //输出set内容
      System.out.println("最长重复子串");
      for ( Iterator it = set.iterator(); it.hasNext(); )
      {
        System.out.println(it.next().toString() + " ");
      }
    } catch ( Exception e )
    {
      e.printStackTrace();
    }
  }
}
