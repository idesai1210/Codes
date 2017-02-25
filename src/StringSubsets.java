
public class StringSubsets {

	public static void main(String[] args) {
		char c[] = {'A','B','C'};
		
		allsubsets(c);
		
		
	}
	static void allsubsets(char c[]){
		int len = c.length;
		for(int i = 0; i < Math.pow(2,len);i++){
			for(int j = 0; j < len; j++){
				int answer = i & (1 << j); // 001 & 001 
				if(answer > 0)
					System.out.print(c[j]);
			}
			System.out.println();
		}
		
	}
	
}
