
public class LargestAndSmallestArray {

	public static void main(String[] args) {
		
		
		int a[] = {7,2,5,6,10,3,8,9,1,4};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < a.length;i++){
			if(a[i] > max)
				max = a[i];
			if(a[i] < min)
				min = a[i];
		}
		
		System.out.println("Maximum number is :"+ max);
		System.out.println("Minimum number is:"+ min);
		
		
		
		
		
		
	}
	
}
