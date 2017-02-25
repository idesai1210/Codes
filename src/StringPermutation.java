
public class StringPermutation {

	public static void main(String[] args) {
		
		String s = "abc";
		
		perm(s);
		
	}
	
	static void perm(String s){
		int n = s.length();
		char str[] = new char[n];
		for(int i = 0; i < n;i++){
			str[i] = s.charAt(i);
		}
		perm2(str,n);
	}
	
	static void perm2(char a[], int n){
		System.out.println("++");
		System.out.println(a);
		System.out.println("++");
		if(n == 0){
			System.out.println("Final");
			System.out.println(a);
			return;
		}  // n = 3
		
		for(int i = 0; i < n;i++){
			swap(a, i, n-1); //(abc, 0 , 2) // (cba, 0, 1) //(bca , 0 , 0) // (abc , 1, 2)
			perm2(a,n-1); //(cba,2) //(bca,1) //(bca, 0)
			swap(a, i, n-1); //(cba,0,2)
		}
		
	}
	static void swap(char a[], int i , int j){
		char temp = a[i];  // a ,c // c, b // b, b 
		a[i] = a[j];
		a[j] = temp;
		System.out.println("--"+i+"--"+j);
		System.out.println(a);
		System.out.println("--");
		
	}
}
