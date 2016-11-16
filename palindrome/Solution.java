import java.util.*;

class Solution{
  public static boolean isPalindrome(String input){
  boolean result = true;
  int length = input.length();
  int limit = (int)Math.ceil(length/2);
  for(int i = 0; i<= length/2; i++){
    System.out.println(">>"  + i +"vs" +  (length-1-i));
    if (input.charAt(i) != input.charAt(length-1-i))
    {
      return false;
    }

  }
   return result;
}





  public String findPalindrome(String input)
  {
    int maxPalindromeLength = 0;      //lenght of max pal
    String maxPalindrome = null;            //the string max pal

    // run the loop from 1 to end of string
    for (int i=0; i<input.length();i++)
      for (int j=i+1;j<input.length();j++)
      {
        int len = j-i;
        String curr = input.substring(i,j+1);

        if(isPalindrome(curr) ==true )
        {
          if (len > maxPalindromeLength){
            maxPalindrome = curr;
            maxPalindromeLength = len;
          
          }
        }



      
      }

    return maxPalindrome;
  
  
  }
  
  
  

  public static void main(String args[])
  {
    Solution s = new Solution();
    System.out.println(s.findPalindrome("balchalaabaa"));



  } 


}
