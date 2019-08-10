import java.util.ArrayList;
import java.util.List;

public class ActiveInactive {

	static List<Integer> inactive(int [] cells, int k) {
		int[] ans = new int[cells.length];
		for(int j = 0; j < k; j++) {
			for (int i = 0; i < cells.length ; i++) {
					int previous = (i-1 < 0) ? 0 : cells[i-1];
					int next = (i+1 > cells.length-1) ? 0: cells[i+1];
					ans[i] = ((previous == 0 && next == 0) || (previous == 1 && next == 1)) ? 0 : 1;
				
			}
			cells = ans.clone();
		}
		List<Integer> ls = new ArrayList<>();
		for (int i = 0; i < ans.length ; i++) {
			ls.add(ans[i]);
		}
		return ls;
	}
	
	public static void main(String[] args) {
		int [] cells = {1, 1, 1, 0, 1, 1, 1, 1};
		// 1 0 1 0 1 0 0 1
		// 0 0 0 0 0 1 1 0
		// 0 
		//int [] cells = {1, 0, 0, 0, 0, 1, 0, 0};
		int k = 2;
		System.out.println(inactive(cells, k));
	}
}
