import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortArrayOfStringsAnagrams implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static String sortIng(String s){
		char[] str = s.toCharArray();
		
		Arrays.sort(str);
		
		
		return new String(str);
	}
	
	public static void main(String[] args) {
		
		String arr[] = new String[]{"cat", "dog", "tac", "god", "act"};
		
		String[] list = new String[arr.length];
		
		int size = arr.length;
		
		for(int i = 0; i < size ; i++){
			list[i] = sortIng(arr[i]);
		}
		
		Arrays.sort(list);
		
		for(String a : list){
			System.out.println(a);
		}
		
		
	}

}
