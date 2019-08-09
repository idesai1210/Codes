import java.util.HashMap;

public class AmazonMovies {
	
	public static void AmazonsumClosest(int nums[], int target) {
		int start = 0;
		int end = nums.length - 1;
		int i = 0, j = 0;
		int max = 0;
		while(start <= end) {
			if (nums[start] + nums[end] < target - 30 ) {
				System.out.println(start);
				System.out.println(end);
				if (max < nums[start] + nums[end]) {
					max = nums[start] + nums[end];
					i = start;
					j = end;
				}
				start++;
			} else {
				end--;
			}
		}
		System.out.println(i);
		System.out.println(j);
		//return new int[]{i,j};
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int d = 250;
		int [] nums =  new int [] {90, 85, 75, 60, 120, 10, 125};
		AmazonsumClosest(nums, d);

	}
}
