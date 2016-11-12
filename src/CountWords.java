import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountWords {

	public static void main(String[] args) {
		
		
		String text = "";
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("Sample.txt"));
			String CurrentLine;

			while ((CurrentLine = br.readLine()) != null) {
				text += CurrentLine;
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		String words[] = text.replace("/\\W./g", " ").split(" ");
		
		
		
		
		Map<String, Integer> map = new TreeMap<>();
	    for (String w : words) {
	        Integer n = map.get(w);
	        n = (n == null) ? 1 : ++n;
	        map.put(w, n);
	    }
		
	    for (Map.Entry<String, Integer> entry : map.entrySet()) {
	       
	    	System.out.println(entry.getKey()+ " , " + entry.getValue());
	    	
	    }
		
	}
	
	
}
