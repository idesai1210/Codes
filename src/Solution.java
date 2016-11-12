import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {
    
    char[][] arr ={{'t','n','o','a'},{'h','e','n','n'},{'i','h','f','i'},{'s','t','i','s'}};
    ArrayList<Integer> a1 = new ArrayList<Integer>();
    ArrayList<Integer> a2 = new ArrayList<Integer>();
    ArrayList<Integer> a3 = new ArrayList<Integer>();
    ArrayList<Integer> a4 = new ArrayList<Integer>();
    int count = 0;
    int row = 4;
    int column = 4;
    
    String str = "";
    
    for( int k = 0 ; k < column * 2 ; k++ ) {
        for( int j = 0 ; j <= k ; j++ ) {
            int i = k - j;
            if( i < row && j < row ) {
                str += arr[i][j];
            }
        }
        System.out.println(str);
        str = "";
        System.out.println();
    }
    
   
    
    
    for(int a:a1){
    	System.out.println(a);
    	
    }
    for(int a:a2){
    	System.out.println(a);
    	
    }
    for(int a:a3){
    	System.out.println(a);
    	
    }
    for(int a:a4){
    	System.out.println(a);
    	
    }
    
    }
}
