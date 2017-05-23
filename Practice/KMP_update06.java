package study03;

public class KMP_update06
{

  public static void main( String[] args )
  {
    //String srcc = "abddabcqbadqbac";
    //String srcc = "qabcqabcqa";
    //String srcc = "qqbbbbcdeabcqeeqabbbcdeqqbbbb";
    //String srcc = "abBmdbfnsadaajaiojjkjgfksnSdjajakfjoiaDjasdfdfdhasjkhdsfdsfabBznfbnzbfhebm";
    String srcc = "谁我们是谁我们是谁我撒开看见的未来啊了加中华民族大国加大卡沙发中华民族大国啊看见的未来啊";
    //String srcc = "banana";
    //String srcc = "abcdefg";
    //String srcc = "abdcaabdcfgcaab";
    //String srcc = "aabcabc";
    //String srcc = "aaaaaa";
    //String srcc = "abcdefabcde";
    char[] src = srcc.toCharArray();
    int len = src.length;
    System.out.println(srcc);
    KMP_update06 kmp = new KMP_update06();
    kmp.KMPPattern(src, len);
  }

  public void KMPPattern( char[] src, int len )
  {
    int maxlen = 0;//最大的字串长度  
    int nextMaxlen = 0;//接受getNext函数中返回的最大值  
    int[] maxIndex = new int[len];//保存最大的字串起始位置  
    int maxindex = 0;
    for ( int i = 0; i < len - 1; i++ ) {
      nextMaxlen = getNext(src, i);//每次从i开始  
      System.out.println("nextMaxlen "+nextMaxlen);
      if ( nextMaxlen > maxlen ) {
        maxindex = 0;
        maxlen = nextMaxlen;
        maxIndex[maxindex] = i;
      } else if ( nextMaxlen == maxlen ) {
        maxindex++;
        maxlen = nextMaxlen;
        maxIndex[maxindex] = i;
      }
    }
    //打印输出
    System.out.println("一共有 " + (maxindex + 1) + " 个重复字符串,字符串的长度均是 " + maxlen);
    for ( int j = 0; j <= maxindex; j++ ) {
      for ( int i = 0; i < maxlen; i++ ) {
        System.out.print(src[i + maxIndex[j]]);
      }
      System.out.println();
    }
  }

  /**
   * 前缀"指除了最后一个字符以外，一个字符串的全部头部组合；"后缀"指除了第一个字符以外，一个字符串的全部尾部组合
   * "前缀"和"后缀"相似度，即next数组的值
   * @param str
   * @param startindex
   * @return
   */
  public int getNext( char[] str, int startindex )
  {
    int len = str.length;
    int[] next = new int[len + 1];
    int index = 0;
    int k = -1;
    next[0] = k;
    int maxlen = 0;
    //kmp算法求next值，取得最大的字串  
    System.out.println("*******************************************");
    while ( (index + startindex) < len ) {
      if ( k != -1 ) {
        System.out.println("str[ " + (index+startindex) + " ] == str[ " + (k+startindex) + " ] " + str[index+startindex] + "  " + str[k+startindex]);
      }
      if ( k == -1 || str[index+startindex] == str[k+startindex] ) {
        k++;
        index++;
        next[index] = k;
        //求解最长重复子串转换为求解KMP算法中next数组的最大值
        if ( k > maxlen ) {
          maxlen = k;
        }
      } else {
        k = next[k];
      }
    }
    return maxlen;
  }
}
