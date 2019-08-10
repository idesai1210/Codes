import java.util.List;
import java.util.*;
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class AmazonLexicographical
{ 
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public List<String> orderedJunctionBoxes(int numberOfBoxes, 
	                                         List<String> boxList) 
	{
// 		// WRITE YOUR CODE HERE
// 		try{
//     		List<String> res = new ArrayList<>();
//     		PriorityQueue<String> q = new PriorityQueue<>(numberOfBoxes, new BoxList());
    		
//     		if(numberOfBoxes > 0){
//             	for(String boxLs: boxList){
//             	    q.add(boxLs);
//             	}
            	
//             	while(!q.isEmpty()){
//             	    res.add(q.poll());
//             	}
//     		}
//     		return res;
// 		} catch (Exception e){
// 		    System.out.println(e);
// 		    List<String> res = new ArrayList<>();
// 		    return res;
// 		}
        List<String> res = new ArrayList<>();

        if(numberOfBoxes > 0){
            String [] box = new String[numberOfBoxes];
            int i = 0;
            for(String boxLs: boxList){
                box[i] = boxLs;
                i++;
            }
            
            Arrays.sort(box, new BoxList());
            
            for (int j = 0; j<numberOfBoxes;j++){
                res.add(box[j]);
            }
        }
        return res;
        
	}
	// METHOD SIGNATURE ENDS
}

class BoxList implements Comparator<String>{
    public int compare(String str1, String str2) {
        String[] str1Tokens = str1.split(" ", 2);
        String[] str2Tokens = str2.split(" ", 2);
        boolean digitStr1 = Character.isDigit(str1Tokens[1].charAt(0));
        boolean digitStr2 = Character.isDigit(str2Tokens[1].charAt(0));
        if (!digitStr1 && !digitStr2) {
            int flag = str1Tokens[1].compareTo(str2Tokens[1]);
            if (flag != 0) {
                return flag;
            }
            return str1Tokens[0].compareTo(str2Tokens[0]);
        }
        if (digitStr1){
            if (digitStr2) {
                return 0;
            }
            return 1;
        } else {
            return -1;
        }
    }
}