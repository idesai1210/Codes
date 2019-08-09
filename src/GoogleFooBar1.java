import java.util.*;

public class GoogleFooBar1 {

	public static void main(String[] args) {
		
		int[] x = {13,5,6,2,5};
		int[] y = {5,6,2,5};
		
		System.out.println(answer(x,y));
		
	}
	
	
	public static int answer(int[] x, int[] y) { 

 // Your code goes here.
        
        List<Integer> ls = new ArrayList<>();
        
        for(int i =0; i < x.length;i++){
            //System.out.println(x[i]);
            ls.add(x[i]);
        }
        
        for(int i =0; i < y.length;i++){
            //System.out.println(y[i]);
            if(ls.contains(y[i])){
            	int index = ls.indexOf(y[i]);
            	ls.remove(index);
                //ls.remove(y[i]);
            }
            else
                ls.add(y[i]);
        }
        int result = 0;
        for(int i : ls){
            result = i;
        }
        
        return result;
    }
}



//<>>---><
