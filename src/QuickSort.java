
public class QuickSort {
	public static void main(String[] args) {
		int a[] = {7,2,5,6,10,3,8,9,1,4};
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]+ " ");
		System.out.println();
		quickSort(a,0,a.length - 1);
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]+ " ");
	}
	
	static void quickSort(int a[], int left, int right){
		
		if(left < right){
			int pIndex = partition(a, left, right);
			quickSort(a,left, pIndex - 1);
			quickSort(a, pIndex + 1, right);
		}
	}
	static int partition(int a[], int left, int right){
		int pIndex = left;
		
		int pivot = a[right];
		
		for(int i = left; i < right ; i++){
			if(a[i] <= pivot){
				swap(a,i, pIndex);
				pIndex++;
			}
		}
		swap(a,pIndex,right);
		
		return pIndex;
	}
	
	static void swap(int arr[], int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
