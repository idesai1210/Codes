import java.util.*;

public class AmazonMostCommonWords {
	
	public static List<String> mostCommon(String text, String[] exclude) {
		List<String> res = new ArrayList<>();
		HashMap<String, Integer> map = new HashMap<>();
		List<String> excludeList = new ArrayList<>();
		System.out.println(text);
		text = text.replaceAll("[^a-zA-Z0-9]+"," ");
		System.out.println(text);
		for(int i = 0; i < exclude.length; i++) {
			excludeList.add(exclude[i].toLowerCase());
		}
		StringTokenizer st = new StringTokenizer(text);
	     while (st.hasMoreTokens()) {
	    	 String temp = st.nextToken().toLowerCase();
	    	 System.out.println(temp);
	         if (excludeList.contains(temp)) {
	        	 continue;
	         } else if (map.containsKey(temp)){
	        	 map.put(temp, map.get(temp) + 1);
	         } else{
	        	 map.put(temp, 1);
	         }
	     }
	     System.out.println(map);
	     Iterator it = map.entrySet().iterator();
	     int max = 0;
	     while(it.hasNext()){
	    	 Map.Entry mapElement = (Map.Entry)it.next();
	    	 if (max <= (Integer)mapElement.getValue()) {
	    		 if (max == (Integer)mapElement.getValue() ){
	    			 res.add((String)mapElement.getKey());
	    		 }else {
	    			 res.clear();
	    			 res.add((String)mapElement.getKey());
	    		 }
	    		 max = (Integer)mapElement.getValue(); 
	    	 }
	     }
	     
		return res;
	}
	public static void main(String args[]) {
		String text = "Jack and Jill went to the market to buy buy buy bread bread cheese food food food bread cheese bread and cheese. Cheese is Jack's and Jill's favorite food.";
		String [] exclude = {"and", "he", "the", "to", "is", "Jack", "Jill"};
		System.out.println(mostCommon(text, exclude));
	}
}
