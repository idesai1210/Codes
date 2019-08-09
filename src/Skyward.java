import java.util.Arrays;

public class Skyward {
	public static void main(String[] args) {
		int input[] = {1,2,3,4,5,-1};
		MinMax(input);
		calculateAge("Johnny", "01/31/2000","05/15/2017");
		passwordCheck("Ab123");
		sortStrings("aeiou","bcdef");
		calculateMultiples(826716);
		maxPalindrome();
	}
	
	static void MinMax(int input[]){
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i =0; i < input.length;i++){
			if(input[i] < min){
				min = input[i];
			}
			if(input[i] > max){
				max = input[i];
			}
		}
		
		System.out.println("The smallest value is "+min+", the largest value is "+max);
		
	}
	
	static void calculateAge(String name, String dob, String currDate){
		
		String birthdate[] = dob.split("/");
		String currentDate[] = currDate.split("/");
 		
		int year = Integer.parseInt(currentDate[2]) - Integer.parseInt(birthdate[2]);
		int age = 0;
		if(Integer.parseInt(currentDate[0]) < Integer.parseInt(birthdate[0]))
			age = year - 1;
		if(Integer.parseInt(currentDate[0]) == Integer.parseInt(birthdate[0])){
			if(Integer.parseInt(currentDate[1]) < Integer.parseInt(birthdate[1]))
				age = year - 1;
			else
				age = year;
		}
		if(Integer.parseInt(currentDate[0]) > Integer.parseInt(birthdate[0])){
			age = year;
		}
		
		
		System.out.println(name+" was "+age+" years old as of "+currDate);
	}
	
	static void passwordCheck(String password){
		if (password.length() < 4) {   
	        System.out.println("The password does not meet the specified criteria.");
	    } else {      
	        char c;  
	        int count = 0; 
	        int count1 = 0;
	        for (int i = 0; i < password.length(); i++) {  
	            c = password.charAt(i);  
	            if (Character.isDigit(c)) {  
	                count++;     
	            }  
	            else if(Character.isUpperCase(c)){
	            	count1++;
	            }
	        }  
	        if (count < 2 || count1 < 2)   {     
	            System.out.println("The password does not meet the specified criteria.");  
	        } 
	        else
	        	System.out.println("The password meets the specified criteria.");
	    }  
	   // System.out.println("The password meet the specified criteria.");  
	}  
	
	static void sortStrings(String first, String second){
		
		String merge = first + second;
		
		char[] answer = merge.toCharArray();
		
		Arrays.sort(answer);
		
		System.out.println(answer);
		
		
	}
	
	
	static void calculateMultiples(int input){
		
		long sum = 0;
		for(int i = 1; i < input;i++){
			
			if (i % 4 == 0 || i % 6 == 0) {
	            sum += i;
	           // System.out.println(i);
	        }
			
		}
		
		System.out.println("Output:"+sum);
	}
	
	static void maxPalindrome(){
		int max_product = 0; // Initialize result
	    for (int i=9999999; i>=1000000; i--)
	    {
	        for (int j=i; j>=1000000; j--)
	        {
	            // calculating product of two n-digit numbers
	            int product = i * j;
	            if (product < max_product)
	                break;
	            int number = product;
	            int reverse = 0;
	 
	            /* calculating reverse of product to check
	               whether it is palindrome or not*/
	            while (number != 0)
	            {
	                reverse = reverse * 10 + number % 10;
	                number /= 10;
	            }
	 
	            /* update new product if exist and if
	               greater than previous one*/
	            if (product == reverse && product > max_product)
	                max_product = product;
	        }
	    }
	    System.out.println(max_product);
	}
}
	
	

