package study03;

public class KMP
{

  public static void main( String[] args ) throws Exception
  {
    // TODO Auto-generated method stub
    //String srcc = "qabcqabcqa";
    //String srcc = "qqbbbbcdeabcqeeqabbbcdeqqbbbb";
    //String srcc = "abBmdbfnsadaajaiojjkjgfksnSdjajakfjoiaDjasdfdfdhasjkhdsfdsfabBznfbnzbfhebm";
    String srcc = "中华民族大国就是啊黄金时代额周年大地啊我们是谁我们是谁我们撒开了加加大卡沙发中华民族大国啊看见的";
    //String srcc = "abcdefg";
    KMP kmp = new KMP();
    kmp.KMPPattern(srcc);
  }

  //查找字符串中最长的重复的公共子串及其下标位置
  public void KMPPattern( String srcc ) throws Exception
  {
    try {
      char src[] = srcc.toCharArray();
      System.out.println("字符串  " + srcc);
      int len = src.length;
      System.out.println("字符串长度 " + len);
      //记录最长重复子串的起始位置
      int idx[] = new int[len];
      //记录最长长度
      int maxLen = 0;
      int id = 1;
      for ( int i = 0; i < len; i++ ) {
        for ( int j = i + 1; j < len; ) {
          int tempLen = 1;
          if ( src[i] == src[j] ) {
            //toCharArray 最后不添加'\0'
            for ( ; j + tempLen < len && src[i + tempLen] == src[j + tempLen]; tempLen++ );
            if ( tempLen > maxLen ) {
              id = 1;
              maxLen = tempLen;
              idx[id] = i;
            } else if ( tempLen == maxLen ) {
              id++;
              idx[id] = i;
            }
            j += tempLen;
          } else {
            j++;
          }
        }
      }
      //调用函数打印
      print(id, maxLen, idx, src);
    } catch ( Exception e ) {
    }
  }

  //打印
  public void print( int id, int maxLen, int idx[], char src[] )
  {
    if ( maxLen == 0 ) {
      System.out.print("没有");
    } else {
      System.out.println("一共有 " + id + " 个长度为 " + maxLen + " 的字符串");
    }
    for ( int j = 1; j <= id; j++ ) {
      for ( int i = 0; i < maxLen; i++ ) {
        System.out.print(src[idx[j] + i]);
      }
      System.out.println("  开始下标  " + idx[j]);
    }
  }
}
