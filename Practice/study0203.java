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
public class study0203
{
  public static void main( String[] args )
  {
    study0203 study0203 = new study0203();
    
    String str = "345";
    int num = 0;
    num = study0203.stringTointparse(str);
  }
  
  public int stringTointparse(String string){
    int number = 0;
    boolean flag;
    for(int i = 0;i<string.length();i++){
      char a  = string.charAt(i);
      if(a == '+')
        flag = true;
      else {
        if(a == '-')
          flag = false;
        }
      
            
    }
    
    return 1;
  }
}
