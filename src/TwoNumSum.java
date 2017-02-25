import java.util.HashSet;

public class TwoNumSum {

	public static void main(String[] args) {
		int a[] = {7,2,5,6,10,3,8,9,1,4};
		int sum = 5;
		
		int first = 0;
		int second = 0;
		HashSet<Integer> hset = new HashSet<>();
		
		for(int i = 0; i < a.length; i++){
			//first = a[i];
			int target = sum - a[i];
			
			if(hset.contains(target)){
				second = target;
				first = a[i];
				System.out.println("("+first +"," + second +")");
			//break;
			}
			else{
				hset.add(a[i]);
			}
				
			
			
		}
		
		
		
	}
}
