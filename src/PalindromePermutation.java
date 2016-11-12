
public class PalindromePermutation {

	public static void main(String[] args) {
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		String phrase =  "Tccatf";
		int count = 0;
		int val = 0;
		for(char ch: phrase.toCharArray()){
			val = getCharNumber(ch);
			if(val != -1){
				table[val]++;
				if(table[val] % 2 == 0){
					count--;
				}
				else{
					count++;
				}
			}
			
			
			
		}
		
		if(count <= 1){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
		
	}
	
	static int getCharNumber(Character c){
		
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		
		if(a <= val && val <=z){
			return val - a;
		}
		
		return -1;
		
		
	}
}
