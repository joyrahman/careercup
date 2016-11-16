package findMissing;

import java.math.*;;
public class Solution {
	
	public static void main(String[] args){
		
	int arr[] = {2,3,4,5,6,7,8,9,10,12};
	int start = 0;
	int end = arr.length - 1;
	int missing = 0;
	
	while(start<end)
	{
		int mid = (int) (Math.ceil(start+end)/2);
		
		//System.out.println("\t start:"+start+"\t mid:"+mid+"\t end:"+end);
		//final: we get down to 2 elements
		if ((end-start)==1){
			missing = arr[start]+1;
			break;
			
		}
		
		if (arr[end] - arr[mid] > arr[mid]-arr[start])
		{
			start = mid;
			
		}	//end of if
		else
		{
			end = mid;
			
		}
		
		
		
		
	}
	
	System.out.println(missing);
	
	
		
		
		
		
		
	}

}
