package study03;

public class KMP_update02
{

  public static void main( String[] args ) throws Exception
  {
    // TODO Auto-generated method stub
    //String srcc = "abcabcqbadqbac";
    //String srcc = "qabcqabcqa";
    //String srcc = "qqbbbbcdeabcqeeqabbbcdeqqbbbb";
    //String srcc = "abBmdbfnsadaajaiojjkjgfksnSdjajakfjoiaDjasdfdfdhasjkhdsfdsfabBznfbnzbfhebm";
    String srcc = "谁我们是谁我们是谁我撒开看见的未来啊了加中华民族大国加大卡沙发中华民族大国啊看见的未来啊";
    //String srcc = "banana";
    //String srcc = "abcdefg";
    //String srcc = "abdfcaabdgcaa";
    //String srcc = "aaaaaa";
    KMP_update02 kmp = new KMP_update02();
    kmp.KMPPattern(srcc);
  }

  //查找字符串中最长的重复的公共子串及其下标位置
  public void KMPPattern( String srcc ) throws Exception
  {
    try {
      System.out.println("字符串  " + srcc);
      int len = srcc.length();
      System.out.println("字符串长度 " + len);
      String suffix[] = new String[len];
      System.out.println("初始化的后缀数组suffix：*******************************************");
      for ( int i = 0; i < len; i++ ) {
        suffix[i] = srcc.substring(i, len);
        System.out.print(suffix[i] + " ");
      }
      System.out.println();
      System.out.println("排序后的后缀数组suffix：********************************************");
      //数组排序
      bubbleSort(suffix, suffix.length);
      for ( int i = 0; i < suffix.length; i++ ) {
        System.out.print(suffix[i] + " ");
      }
      System.out.println();

      //处理查找最长重复子串
      int maxlen = 0;
      int[] maxindex = new int[len];
      int index = 0;
      for ( int i = 0; i < suffix.length - 1; i++ ) {
        int temp = comlen(suffix[i].toCharArray(), suffix[i + 1].toCharArray());
        if ( temp > maxlen ) {
          index = 0;
          maxlen = temp;
          maxindex[index] = i;
        } else if ( temp == maxlen ) {
          index++;
          maxlen = temp;
          maxindex[index] = i;
        }
      }

      //打印最长重复子串
      if ( maxlen > 0 ) {
        System.out.println("长度为 " + maxlen + " 的最长重复子串有 " + (index + 1) + " 个  ****************************************************");
        for ( int i = 0; i <= index; i++ ) {
          System.out.println(suffix[maxindex[i]].substring(0, maxlen));
        }
      } else {
        System.out.println("最长重复子串没有");
      }
    } catch ( Exception e ) {
      e.printStackTrace();
    }
  }

  /**
   * 冒泡排序算法
   *
   * @param array
   * @param n
   */
  public void bubbleSort( String array[], int n )
  {
    int i, j;
    String temp;
    for ( i = 0; i < n; i++ ) {
      for ( j = i; j < n; j++ ) {
        if ( array[i].compareTo(array[j]) >= 0 ) {
          temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
  }

  //计算相邻字符串的最开始交集长度
  public int comlen( char str1[], char str2[] )
  {
    int temp = 0;
    for ( int i = 0; i < str1.length && i < str2.length; i++ ) {
      if ( str1[i] == str2[i] ) {
        temp++;
      } else {
        break;
      }
    }
    return temp;
  }
}
