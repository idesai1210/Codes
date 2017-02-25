import java.util.HashMap;
import java.util.Map;


public class MultipleDuplicates {
	public static void main(String[] args) {
		
		int a[] = {7,2,5,6,10,3,8,9,1,4,1,4,1,4,3,5,6,6,4,7,8,9,9};
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0 ; i < a.length ;i++){
			if(map.containsKey(a[i])){
				map.put(a[i], map.get(a[i]) + 1);
			}
			else{
				map.put(a[i], 1);
			}
		}
		
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		    
			if(entry.getValue() > 1){
				System.out.println(entry.getKey());
			}
			
		}
		
		
		
		
	}
}
