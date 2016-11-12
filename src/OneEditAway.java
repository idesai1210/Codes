
public class OneEditAway {

	public static void main(String[] args) {
		String s1 = "apple";
		String s2 = "applesas";
		boolean flag = false;
		if(s1.length() == s2.length()){
			flag = oneEditReplace(s1,s2);
		}
		else if(s1.length() + 1 == s2.length()){
			flag = oneEditInsert(s1,s2);
		}
		else if(s1.length() - 1 == s2.length()){
			flag = oneEditInsert(s2,s1);
		}
		else
			flag = false;
		
		int i;
		for(i = 0; i < 10;i++){
			
		}
		System.out.println(i);
		
		System.out.println(flag);
		
	}
	
	static boolean oneEditReplace(String s1, String s2){
		int count = 0;
		for(int i = 0; i < s1.length();i++){
			if(s1.charAt(i) != s2.charAt(i)){
				count++;
			}
		}
		if(count <= 1){
			return true;
		}
		else
			return false;
	}

	static boolean oneEditInsert(String shortStr, String longStr){
		
		int j = 0;
		int count = 0;
		for(int i = 0; i < shortStr.length(); i++){
			if(shortStr.charAt(i) != longStr.charAt(j)){
				j+=2;
				count++;
			}
			else
				j++;
		}
		if(count <=1){
			return true;
		}
		else
			return false;
	
	}
}
