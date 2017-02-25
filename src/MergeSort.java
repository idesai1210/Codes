
public class MergeSort {
	public static void main(String[] args) {
		int a[] = {7,2,5,6,10,3,8,9,1,4};
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]+ " ");
		System.out.println();
		mergeSort(a);
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]+ " ");
	}
	
	
	static void mergeSort(int a[]){
		int len = a.length;
		if(len < 2)
			return;
		
		int mid = len / 2;
		
		int left[] = new int[mid];
		int right[] = new int[len - mid];
		for(int i = 0; i <= mid - 1;i++){
			left[i] = a[i];
			//System.out.println(left[i]);
		}
		for(int i = mid; i <= len-1;i++){
			right[i - mid] = a[i];
		}
		mergeSort(left);
		mergeSort(right);
		merge(left,right,a);
		
	}
	
	
	//1 2 3 4 5 6 7 8 9 10
		// 1 2 3 4 5    // 6 7 8 9 10
		
	
	static void merge(int left[], int right[], int a[]){
		int i = 0,j = 0,k = 0;
		
		int lLength = left.length;
		int rLength = right.length;
		
		while(i < lLength && j < rLength){
			if(left[i] <= right[j]){
				a[k] = left[i];
				i++;
			}
			else{
				a[k] = right[j];
				j++;
			}
			k++;
		}
		while(i < lLength){
			a[k] = left[i];
			k++;
			i++;
		}
		while(j < rLength){
			a[k] = right[j];
			k++;
			j++;
		}
		
	}
	
	
}
