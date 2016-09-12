package reverseString;

public class Solution {
	
	
	public static String reverseString (String input)
	{
		String result = "";
		if (input.length()==1)
		{
			result = input;
			//System.out.println(">"+ result);
			return result;
		}
		//System.out.println("<"+ input);
		//String key = input.substring(0,1);
		Character key = input.charAt(0);
		result = reverseString(input.substring(1, input.length())) + key.toString();
		System.out.println("<<" +  result);
		return result;
		
		
		
		
	}
	
	
	
	public static void main(String[] args)
	{
		String input = "joyrahman";
		String result = reverseString(input);
		System.out.println(result);
		
		
		
	}

}
