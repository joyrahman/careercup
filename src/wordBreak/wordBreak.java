package wordBreak;


import java.util.*;



public class wordBreak{
  static ArrayList<String> breakWord(String input, Set<String> dict)
  {
  ArrayList <String> result = new ArrayList<String>();
  //we will define the recusisve function separately 
  //and will return the positions from that functions
  //
  int inputLen = input.length();
  boolean breakTable[][] = new boolean[inputLen][inputLen];

  for (int i =1; i <= inputLen; i++)     // this is the outer loop to control the length of the string searched
  {
    for (int j=0; j<= inputLen-i; j++)     // this is the inner loop that will populate the table 
    {
      String word = input.substring(j,j+i);
      System.out.println(word);
      if (dict.contains(input.substring(j,j+i)))
          {
            breakTable[i][j] = true;
          }
      else{

        for (int k = 1; k<; k++)
        {
          if breakTable[i][k] !=False && breakTable[k+1][]
        
        }// end of for

      }  // end of else
    
    }
  
  }   
  
  // we will populate the result list based on the return break points 


  return result;
  
  } 


  public static void main(String args[])
  {
    String input = "ilovejoyfulworld";
    Set<String> dict = new HashSet<String>();
    dict.add("i");
    dict.add("love");
    dict.add("ful");
    dict.add("world");
    breakWord(input,dict);

    System.out.println(dict);



      
  
  
  
  
  } // end of main






}//end of class
