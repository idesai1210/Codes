// Edge cases
//null string
//white space
// +/-
public class atoi {
	
	
	public static void main(String[] args) {
		
		String str = "-123";
		
		int answer = atoii(str);
		
		System.out.println("MINE:"+answer);
		//System.out.println(Integer.parseInt(str));
	}
	
	static int atoii(String str){
		
		if(str == null)
			return 0;
		str = str.trim();
		char flag = '+';
		int i = 0;
		if(str.charAt(0) == '-'){
			flag = '-';
			i++;
		}
		int result = 0;
		System.out.println(str.length());
		while(str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
			result = result * 10 + (str.charAt(i) - '0');
			System.out.println(result);
			i++;
		}
		
		if(flag == '-')
			result = -result;
		if(result > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if(result < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		
		return result;
	}

}
