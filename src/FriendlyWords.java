import java.util.HashMap;
import java.util.*;

public class FriendlyWords {
	
	public static void main(String[] args) {
		String input[] = {"car","cheating", "dale", "deal", "teaching" };
		String[] arr = friendlyWords(input);
		for(int i = 0; i < arr.length;i++){
			System.out.println(arr[i]);
		}
	}
    /**
     * Two words are called friendly if the letters of the first can be rearranged to produce the second (e.g., "silent" and "listen" are friendly).
     * Write a program that given a set of words prints out all friendly words. Each set of friendly words should be printed on a separate line.
     * Words without friends should not be printed. The output should be alphabetically ordered (across lines and within each line).
     *
     * @param input An array with all the words to be processed.
     * @return An array with each line of the output. Each line should have already the friendly words. (eg.: the first line of the example output is "cheating teaching"
     */
    static String[] friendlyWords(String[] input) {
        TreeMap<Integer, ArrayList<String>> map = new TreeMap<>();
        for(int i = 0; i < input.length;i++){
            if(map.containsKey(input[i].length())){
                ArrayList<String> appendWordList = map.get(input[i].length());
                char [] w1 = input[i].toCharArray();
                Arrays.sort(w1);
                char[] w2 = appendWordList.get(0).toCharArray();
                Arrays.sort(w2);
                if(Arrays.equals(w1,w2)){
                    appendWordList.add(input[i]);
                    map.put(input[i].length(), appendWordList );
                }
            }
            else{
                ArrayList<String> wordList = new ArrayList<>();
                wordList.add(input[i]);
                map.put(input[i].length(), wordList);
            }
        }
        //String[] result = new String[];
       /* Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            
            if((ArrayList)pair.getValue()
            it.remove(); // avoids a ConcurrentModificationException
        }*/
        ArrayList<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Integer, ArrayList<String>> entry : map.entrySet()){
            ArrayList<String> value = entry.getValue();
            if(value.size() > 1){
               for(int i = 0; i < value.size() - 1;i++){
                   sb.append(value.get(i));
                   sb.append(" ");
               }
               sb.append(value.get(value.size() - 1));
               result.add(sb.toString());
               sb.setLength(0);
            }
        }
        String finalArray[] = new String[result.size()];
        finalArray = result.toArray(finalArray);
        return finalArray;
    }

}
