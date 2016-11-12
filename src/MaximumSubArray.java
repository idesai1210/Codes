
public class MaximumSubArray {

	public static void main(String[] args) {
		
		int a[] = new int[]{-10, 2, 3, -2, 5, -15};
		
		int max = maxSubArray(a);
		
		System.out.println("The maximum sum of contiguous array is: "+max);
		
		
	}
	
	public static int maxSubArray(int[] arr) {
 
	       int checkSum = arr[0];
	       int maxSum = arr[0];
	       
	       int count = 1;
	       while(count < arr.length){
	    	   
	    	   if((checkSum + arr[count]) > arr[count]){
	    		   checkSum = checkSum + arr[count]; 
	    	   }
	    	   else{
	    		   checkSum = arr[count];
	    	   }
	    	   if(maxSum > checkSum){
	    		   maxSum = maxSum;
	    	   }
	    	   else{
	    		   maxSum = checkSum;
	    	   }
	    	   count++;
	       }
	       
	       return maxSum;
	    }
	
}
