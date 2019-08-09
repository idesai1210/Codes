import java.util.AbstractQueue;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

import java.util.*;
public class Wizeline {

	public static void main(String[] args) {
		int arr[] = {1,2,5,2};
		System.out.println(waitingTime(arr, 3));
	}
	
	static long waitingTime(int[] tickets, int p) {
 
LinkedList<Integer> q = new LinkedList<>();
        
        int check = tickets[p];
        
        for(int i =0; i < tickets.length;i++){
        	q.add(tickets[i]);
        }
        long count = 0;
        int i = 0;
        
        while(!q.isEmpty()){
            
        	int value = q.remove();
        	
            if(value == check){
                //if(p == 0){
        		check--;
        		if(check == 0){
        			count++;
        			break;
        		}
               // }
        			//break;
        	}
        	value--;
            
        	if(value != 0){
        		
                q.add(value);
                
        	}
        	if(p == 0)
                p = q.size();
        	p--;
        	count++;
            
        }
        System.out.println(p);
        
       // q.add(tickets);
        
        return count + p;
            
            
    }
}
