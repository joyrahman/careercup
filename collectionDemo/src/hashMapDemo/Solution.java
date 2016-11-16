package hashMapDemo;
import java.util.HashMap;

public class Solution {
	
	
	public static void main(String[] args)
	{
		String[] words = {"Hello", "Habib", "Honda", "joy","tupa"};
		
		HashMap<String,Integer> counter = new HashMap<String,Integer>();
		Integer count = new Integer(0);
		for(int i = 0; i < words.length; i++ )
		{
			 String key = String.valueOf(words[i].charAt(0));
			 //count = (Integer) counter.get(new Character(words[i].charAt(0)));
			 count = (Integer) counter.get(key);
			 System.out.println("Word:"+ words[i] + "\t Key:" + key + "\t Count:" + count);
			 if ( count == null)
			 {
				 //insert to hashmap
				 //String key = String.valueOf (words[i].charAt(0));
				 counter.put((String) key, new Integer(1));
			 }
			 else 
			 {	
				 //String key = String.valueOf (words[i].charAt(0)) ;
				 counter.put(key, count+1);
				 
			 }
			
			
		}
		
		
		// print out the arry
		
		System.out.println(counter.toString());
		
		
		
		
	}

}
