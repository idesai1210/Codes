
public class LongestCommonSubSequenceLength {
	static int LongestIncreasingSubsequenceLength(int A[], int size)
    {
        // Add boundary case, when array size is one
 
        int[] tailTable   = new int[size];
        int len; // always points empty slot
        int max = 0;
        tailTable[0] = A[0];
        len = 1;
        for (int i = 1; i < size; i++)
        {
            if (A[i] < tailTable[len - 1]){
                // new smallest value
            	if(len > max){
            		max = len;
            	}
                tailTable[0] = A[i];
                len = 1;
            }
            else if (A[i] > tailTable[len-1])
                // A[i] wants to extend largest subsequence
                tailTable[len++] = A[i];
 
           
        }
 
        return max;
    }
 
    // Driver program to test above function
    public static void main(String[] args)
    {
        int A[] = { 2, 5, 3, 7, 11, 8, 10, 13, 6 };
        int n = A.length;
        System.out.println("Length of Longest Increasing Subsequence is "+
                            LongestIncreasingSubsequenceLength(A, n));
    }
}
