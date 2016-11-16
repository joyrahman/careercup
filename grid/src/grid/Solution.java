package grid;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int n_row = 0; 
        int n_col = 0;
        if (scnr.hasNextInt())
            n_row  = scnr.nextInt();
        if (scnr.hasNextInt())
            n_col = scnr.nextInt();
        int[][] array = new int[n_row+1][n_col+1];
        for(int i = 1; i<=n_row; i++)
            {
            for (int j = 1; j<= n_col; j++)
                {
                 array[i][j] = scnr.nextInt();
                
                 } //end of inner for
            }//end of for

       System.out.println(findRegion(array, n_row+1, n_col+1));
    } //end of main

    static int findRegion(int[][] array, int n_row, int n_col){
      int maxVal = 0;
      for(int i=0; i<n_row; i++)
          for(int j=0; j<n_col; j++)
             {
								
                if (array[i][j] == 1){
										array[i][j] = 1 + Math.max(Math.max(array[i-1][j], array[i][j-1]),array[i-1][j-1]);
										if(maxVal<array[i][j])
											 maxVal = array[i][j];
								}//end of if
             } 	//end of inner for
       return maxVal; 
    }
	  
   
}
