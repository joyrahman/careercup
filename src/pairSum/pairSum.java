package pairSum;



import java.util.*;





public class pairSum{
  public static void main(String[] args)
  {
    int[] input = {-1,11,2,7 , 5 ,43, 9,12, 15, 20};
    int target = 10;
    findPair(input, target);

  
  }

  public static void findPair(int[] input, int target)
  {
    HashSet <Integer> lut = new HashSet <Integer> ();
    boolean found = false;
    for ( int i : input)
    {
      if ( lut.contains(target-i))
      {
        System.out.println(i + "," + (target-i));
        found = true;
      }
      else {
        lut.add(i);
      
      }

    }
  
  
  }
  



}
