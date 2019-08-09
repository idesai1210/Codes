import java.util.HashMap;

public class AllGroupofZeroes {
	
	/*
	 * Complete the function below.
	 */
	    static int [][] zArray =null;
	    static int len;
	static HashMap<Integer,Boolean> visited=new HashMap<Integer,Boolean>();
	    static void dfs(int u){
	        for(int j=0;j<len;j++){
	            if(zArray[u][j]>0 && j!=u && (Boolean)visited.get(j)==false){
	                visited.put(j,true);
	                dfs(j);
	            }
	        }
	    }
	    
	    static int zombieCluster(String[] zombies) {
	        zArray= new int[zombies.length][zombies.length];
	        len = zombies.length;
	        for(int i = 0;i < len;i++) {
	            for(int j = 0; j < len;j++){
	                char arr[] = zombies[i].toCharArray();
	                zArray[i][j] = arr[j] - '0';
	            }
	            visited.put(i,false);
	        }
	        /*
	         * 11000
	         * 00010
	         * 10101
	         * 00111
	         * 00011
	         * 
	         * 1100
	         * 1110
	         * 0110
	         * 0001
	         * */
	        int result=0;
	        //int count = 0;
	        for(int u=0;u<len;u++){
	            if((Boolean)visited.get(u)==false){
	            	
	                visited.put(u,true);
	                result++;
	                dfs(u);
	                
	            }
	        }
	        return result;
	    }
	    
	    static int matrix[][] = null;
	    public static int countIslands(String[] zombies) {
	    	matrix = new int[zombies.length][zombies.length];
	        len = zombies.length;
	        for(int i = 0;i < len;i++) {
	            for(int j = 0; j < len;j++){
	                char arr[] = zombies[i].toCharArray();
	                matrix[i][j] = arr[j] - '0';
	            }
	            //visited.put(i,false);
	        }
			if (matrix == null || matrix.length == 0) return 0;
			int result = 0;
			for (int i=0; i<matrix.length; i++) {
				for (int j=0; j<matrix[i].length; j++) {
					if (matrix[i][j] == 1) {
						result++;
						doFill(matrix, i, j);
						
					}
				}
			}
			return result;
		}
		public static void doFill(int[][] matrix, int row, int col) {
			if (row < 0 || col < 0 || row >= matrix.length || col >=matrix[0].length || matrix[row][col] == 0) {
				return;
			}
			matrix[row][col] = 0;
			int dr[] = {-1,0,1,0};
			int dc[] = {0,1,0,-1};
			for (int i=0; i<dr.length; i++) {
				doFill(matrix, row + dr[i], col + dc[i]);
			}
		}
	    public static void main(String[] args) {
			
	    	String[] str = {"1100","1110","0000","0000"};
	    	
	    	//int i = zombieCluster(str);
	    	
	    	int i = countIslands(str);
	    	System.out.println(i);
		}

}
