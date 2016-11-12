import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Scanner;

public class Crossword {
	
	 static ArrayList<String> wordsMap = new ArrayList<String>(); 
	// For searching in all 8 direction
	static int x[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int y[] = { -1, 0, 1, -1, 1, -1, 0, 1 };
	 
	// This function searches in all 8-direction from point
	// (row, col) in grid[][]
	static boolean search2D(char grid[][], int row, int col, String word)
	{
	    // If first character of word doesn't match with
	    // given starting point in grid.
	    if (grid[row][col] != word.charAt(0))
	      return false;
	    int R = grid.length;
	    int C = grid[0].length;
	    int len = word.length();
	 
	    // Search word in all 8 directions starting from (row,col)
	    for (int dir = 0; dir < 8; dir++)
	    {
	        // Initialize starting point for current direction
	        int k, rd = row + x[dir], cd = col + y[dir];
	 
	        // First character is already checked, match remaining
	        // characters
	        for (k = 1; k < len; k++)
	        {
	            // If out of bound break
	            if (rd >= R || rd < 0 || cd >= C || cd < 0)
	                break;
	 
	            // If not matched,  break
	            if (grid[rd][cd] != word.charAt(k))
	                break;
	 
	            //  Moving in particular direction
	            rd += x[dir];
	            cd += y[dir];
	        }
	 
	        // If all character matched, then value of must
	        // be equal to length of word
	        if (k == len)
	            return true;
	    }
	    return false;
	}
	 
	//  Searches given word in a given matrix in all 8 directions
	static void patternSearch(char grid[][], String word)
	{
	    // Consider every point as starting point and search
	    // given word
	    for (int row = 0; row < grid.length; row++)
	       for (int col = 0; col < grid[0].length; col++)
	          if (search2D(grid, row, col, word))
	            // cout << "pattern found at " << row << ", "
	              //    << col << endl;
	        	  System.out.println(word+" found at " + row + ", " + col);
	}
	
	private static void addDictionaryToDataStructures() {
		try {
		Scanner sf = new Scanner(new File("/Users/Ishan/Desktop/dictionary.txt"));
		while (sf.hasNextLine()) {
		// listDictionary.add(sf.nextLine());
		wordsMap.add(sf.nextLine());
		}
		sf.close();
		} catch (FileNotFoundException e) {
		System.out.println("Dictionary not found!!");
		e.printStackTrace();
		}
		}
	
	
	public static void main(String[] args) {
		
		char grid[][] = {{'t','n','o','a'},{'h','e','n','n'},{'i','h','f','i'},{'s','t','i','s'}};
			addDictionaryToDataStructures();
			for(String word : wordsMap){
				patternSearch(grid, word);
			}
		
	}
}
