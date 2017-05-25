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
public class Study02
{

  /**
   * @param args the command line arguments
   */
  public static void main( String[] args )
  {
    // TODO code application logic here
    String str = "I am a student.";
    Study02 study02 = new Study02();
    String reversestr =  study02.Reverse(str);
    System.out.println();
    System.out.println(reversestr);
  }
  public String Reverse(String message){
    
    String[] split = message.split(" ");
    for(int i = 0;i < split.length; i ++)
      System.out.print(split[i]+" ");
    StringBuffer stringBuffer = new StringBuffer();
    for(int i = split.length-1;i >= 0; i--)
      stringBuffer.append(split[i]+" ");
    return stringBuffer.toString();
  }
  
}
