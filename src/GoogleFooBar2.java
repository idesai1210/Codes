
public class GoogleFooBar2 {
	
	public static void main(String[] args) {
		System.out.println(answer("--->-><-><-->-"));
	}
	public static int answer(String s) { 

        // Your code goes here.
       char str[] = s.toCharArray();
        int left = 0;
        int salutes = 0;
        for(int i =str.length - 1 ; i >= 0;i--){
            if(str[i] == '>')
                left++;
        }
        for(int i = str.length - 1; i >= 0;i--){
            if(str[i] == '>')
                left--;
            if(str[i] == '-')
                left = left;
            if(str[i] == '<')
                salutes += left;
        }
        
        return salutes * 2;
        

    }
}
