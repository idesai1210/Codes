
public class Hyland {
	public static void main(String[] args) {
		//OnBase();
		//primeNumbers();
		String result = stringReverse("Parita");
		System.out.println(result);
	}
	static void OnBase(){
		String result = "";
		for(int i = 1 ; i <= 100; i++){
			if(i % 3 == 0){
				result = "On";
			}
			if(i % 7 == 0){
				result += "Base";
			}
			if(result != "")
				System.out.println(i+": "+result);
			result = "";
		}
	}
	
	static void primeNumbers(){
	           
	       for (int i = 1; i <= 100; i++){ 		  	  
	          
	    	  int counter=0; 	  
	          for(int num = i; num >= 1; num--){
	             if(i % num == 0){
	            	 counter = counter + 1;
	             }
	          }
	          
	          if(counter ==2){
	        	  System.out.println(i);
	          }	
	       }	
	}
	
	 static String stringReverse(String input) { 
		
		StringBuilder sb = new StringBuilder(input); 
		int len = sb.length(); 
		for (int i = 0; i < len / 2; i++) { 
			char curr = sb.charAt(i); 
			int end = len - i - 1; 
			sb.setCharAt(i, sb.charAt(end)); 
			// swap 
			sb.setCharAt(end, curr); 
			} 
		return sb.toString(); 
	}
		
}

	

