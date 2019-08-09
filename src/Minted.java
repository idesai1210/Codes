import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

/*
2D to represent the image

Every pixel is either 1 or 0

Background is solid 1s
N # of Boxes of 0s: 1x1 >> NxM

GOAL: Find all the boxes in the image, and return their coordinates

HOW to represent: 
1) upper-left, bottom-right: (0,0) (1,2), (0,4) (0,4), ...
or
2) upper-left, w + h: (0,0) w:3 h:2, (0,4) w:1 h:1....

*/

class Minted {
  public static void main(String[] args) {
    
    int[][] image = {  //read-only
      {0, 0, 0, 1, 0, 1, 1},
      {0, 0, 0, 1, 1, 1, 1},
      {1, 1, 1, 0, 0, 0, 1},
      {1, 0, 1, 0, 0, 0, 1},
      {1, 0, 1, 1, 1, 1, 1},
      {1, 0, 1, 0, 0, 1, 1},
      {1, 1, 1, 0, 0, 1, 1},
      {1, 1, 1, 1, 1, 1, 1},
    };
    
    int row = image.length;
    int col = image[0].length;
    int [][] duplicate = new int[row][col];
    
    
    for(int i = 0; i < row; i++){
      for(int j =0; j< col;j++){
        duplicate[i][j] = image[i][j];    
      }
    }
    
    int noOfBoxes = getSize(duplicate);
    
    System.out.println(noOfBoxes);
    
  }
  
  
  
  static int getSize(int duplicate[][]){
    int max = 0;
    int row = duplicate.length;
    int col = duplicate[0].length;
    int count = 0;
    int result = 1;
    for(int i = 0; i < row; i++){
      for(int j =0; j< col;j++){
          
        if(duplicate[i][j] == 0){
          System.out.println(i +" "+ j);
          dfs(duplicate,i,j);
          //if(count != 0){
        	  result++;
          //}
          //max = Math.max(max, count);
        }
        
      }
    }
    
    return result;
  }
  
 static void dfs(int a[][], int row, int col){
    
    if(row < 0 || col < 0 || row >= a.length  || col >= a[0].length){
      return;
    }
    int maxI = -1;
    int maxJ = -1;
    if(a[row][col] == 1){
    	if(maxI != -1 || maxJ != -1)
    		System.out.println(maxI + " "+ maxJ);
      return;
    }
    a[row][col] = 1; // visited
    int count = 1;
    int prev = 1;
   
   
    
    for(int i = row - 1; i <= row + 1  ;i++){
      for(int j = col - 1; j <= col + 1 ;j++){
    	  
       if(i != row || j != col){
         // System.out.println(i+" " + j);
    	   if(i > maxI){
    		   maxI = i;
    	   }
    	   if(j > maxJ){
    		   maxJ = j;
    	   }
           dfs(a,i,j);
           
          
         // System.out.println(i+" " + j+ ": "+ count);
        }
        
      }
      
    }
   
  
   // return count;
    
  }
  
}


/* 
Your previous Markdown content is preserved below:


 */