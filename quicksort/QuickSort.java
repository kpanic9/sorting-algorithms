
public class QuickSort {

	
	
	public static void quickSort(int array[], int start, int end) {
		if(start < end) {
					
			int pivotIndex = partition(array, start, end);
			quickSort(array, start, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, end);
		}
	}
	
	
	public static int partition(int array[], int start, int end) {
		// end is selected as pivot
		int pivot = array[end];
		int pivotIndex = end;
		int temp;
		
		for(int i = start; i <= end; i++) {
			if( array[i] > pivot ) {
				temp = array[i];
				array[i] = array[pivotIndex];
				array[pivotIndex] = temp;
				pivotIndex--;
			}	
		}
		temp = array[pivotIndex];
		array[pivotIndex] = array[end];
		array[end] = temp;
		return pivotIndex;
	}
	
	
	public static void main(String args[]) {
		
		int array[] = {1, 7, 6, 2, 8, 3, 9, 0, 5, 4};
		
		QuickSort.printArray(array);		
		QuickSort.quickSort(array, 0, array.length - 1);		
		QuickSort.printArray(array);	
	}
	
	
	
	public static void printArray(int array[]) {
		for(int i:array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	
}
