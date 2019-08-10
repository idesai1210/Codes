import java.util.*;

import LinkedList.LinkdList;

public class ConnectRopes {

	static int minCost(int [] ropes) {
		int res = 0;
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for (int i = 0; i < ropes.length; i++){
			q.add(ropes[i]);
		}
		
		while(q.size() > 1){
			int tmp = 0;
			int first = q.poll();
			int second = q.poll();
			tmp = first + second;
			q.add(tmp);
			res += tmp;
		}
		
		return res;
	}
	public static void main(String[] args) {
		int ropes [] = {2, 2, 3, 3};
		System.out.println(minCost(ropes));
	}
}
