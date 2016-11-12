
public class CompressString {

	public static void main(String[] args) {
		
		String str = "aaaabbbcccdddefffff";
		
		
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for(int i = 0; i < str.length(); i++){
			count++;
			
			if( i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)){
				sb.append(str.charAt(i));
				if(count != 1)
					sb.append(count);
				count = 0;
			}
			
		}
		
		
		System.out.println(sb.toString());
		
		
		
		
	}
}
