

package wordBreak;

import java.util.HashSet;
import java.util.*;

public class wordBreakEasy{
  public static void main(String args[]){
  
  //driver class
  String input1 = "iamagoodboy";
  String input2 = "iamagoodboyna";
  Set <String> dict = new HashSet<String>();
  dict.add("i");  
  dict.add("am");  
  dict.add("a");  
  dict.add("good");  
  dict.add("boy");  
  dict.add("everyday");  
  System.out.println(input1 + ":"+ isWordBreak(input1, dict)); 
  System.out.println(input2 + ":"+ isWordBreak(input2, dict)); 
  
  
  }

  public static boolean isWordBreak(String input, Set <String> dict){
  
    //populate an array for the check
    boolean[] truthTable = new boolean[input.length()+1];
    truthTable[0] = true;
    int[] position = new int[input.length()+1];

    position[0] = 0;

    for (int i = 0; i < input.length(); i++)
    {      
      if (truthTable[i] == false)
      {
        continue;
      } //end of if

      

      for (String a : dict)
      {
        int end = a.length();
        if (i+end > input.length())
        {
          continue;
        }
        if (input.substring(i,i+end).equals(a) == true)
        {
          truthTable[i+end] = true;
          position[i+end] = i; 
        
        }

        System.out.println (">>" + input.substring(i,i+end) + "\t" + a + "\t" + input.substring(i, i+end).equals(a));
        

        //print out the string
        //
        /*
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int k = 0 ; k < position.length; k++)
        {
          if (position[k]!=0)
              {
                result.add(k);
              }
        
        }
        Integer init = 0;
        for (Integer P: result)
        {
          
          System.out.println(input.substring(init,P));
          init = P;
         
        }
        */


      } // end of for


    
    } //end of outer for
    
    return truthTable[input.length()];

  } //end of method 


}
