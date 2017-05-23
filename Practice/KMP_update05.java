package study03;

public class KMP_update05
{

  public static void main( String[] args ) throws Exception
  {
    //String srcc = "abddabdsqbadqbac";
    //String srcc = "qabcqabcqa";
    //String srcc = "qqbbbbcdeabcqeeqabbbcdeqqbbbb";
    //String srcc = "abBmdbfnsadaajaiojjkjgfksnSdjajakfjoiaDjasdfdfdhasjkhdsfdsfabBznfbnzbfhebm";
    //String srcc = "谁我们是谁我们是谁我撒开看见的未来啊了加中华民族大国加大卡沙发中华民族大国啊看见的未来啊";
    String srcc = "banana";
    //String srcc = "abcdefg";
    //String srcc = "abdcaabdfgcaab";
    //String srcc = "aabcabc";
    //String srcc = "aaaaaa";
    char[] src = srcc.toCharArray();
    int len = src.length;
    KMP_update05 kmp = new KMP_update05();
    kmp.KMPPattern(src);
  }

  //其中i表示每次循环设定的字符串比较间隔（1,2,3。。。）。j表示遍历字符串数组。
  public void KMPPattern( char[] str )
  {
    int len = str.length;
    int max = 0;
    int first = 0;
    int[] firstindex = new int[len];
    System.out.println("study03.KMP_update05.KMPPattern()   "+firstindex.length);
    int count = 0;
    for ( int i = 1; i < len; i++ ) {
      int k = 0;
      for ( int j = 0; j < len - i; j++ ) {
        if ( str[j] == str[i + j] ) {
          k++;
        } else {
          k = 0;
        }
        if ( k > max ) {
          first = 0;
          max = k;
          firstindex[first] = j - k + 1;
        } else if ( k == max ) {
          first++;  //有问题
          max = k;
          firstindex[first] = j - k + 1;
        }
      }
    }
    if ( max > 0 ) {
      System.out.println("MAX " + max);
      for ( int i = 0; i <= first; i++ ) {
        for ( ; count < max; count++ ) {
          System.out.print(str[firstindex[i] + count]);
        }
        System.out.println();
      }
    }
  }
}
