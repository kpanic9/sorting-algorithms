/**
 * @author namesh
 *
 * Implmentation of the merge sort for an array of integers
 * for acsending order.
 */
public class MergeSort {

	/**
	 * Sorts an array of integers
	 * 
	 * @param array
	 * @param starting index of the array
	 * @param ending index of the array
	 */
	public static void mergeSort(int array[], int start, int end) { de
		int middle = (start + end) / 2;
		if(end > start) {
			mergeSort(array, start, middle);
			mergeSort(array, middle+1, end);
			merge(array, start, middle, end);
		}
	}
	
	
	/**
	 * Merging function of the two arrays
	 * @param array
	 * @param start
	 * @param middle
	 * @param end
	 */
	public static void merge(int array[], int start, int middle, int end) {
		int leftLength = middle - start + 1 + 1;
		int L[] = new int[leftLength];
		L[leftLength - 1] = 9999;
		
		int rightLength = end - middle +1;
		int R[] = new int[rightLength];
		R[rightLength - 1] = 9999;
		
		
		for(int i = 0; i <= middle - start; i++) {
			L[i] = array[start + i];
		}
		
		for(int i = 0; i < end - middle; i++) {
			R[i] = array[middle + i + 1];
		}
		
		System.out.println(L.length);
		MergeSort.printArray(L);
		System.out.println(R.length);
		MergeSort.printArray(R);
		System.out.println();
		
		int i = 0;
		int j = 0;
		for(int k = start; k <= end; k++) {
			if(L[i] < R[j]) {
				array[k] = L[i];
				i++;
				System.out.println("I");
			}
			else {
				array[k] = R[j];
				j++;
				System.out.println("J");
			}
		}
		
	}
	
	
	
	
	
	
	public static void main(String args[]) {
		
		int array[] = {1, 4, 6, 2, 8, 3, 9, 0, 5, 4};
		
		MergeSort.printArray(array);		
		MergeSort.mergeSort(array, 0, 9);		
		MergeSort.printArray(array);
		
	}
	
	
	
	public static void printArray(int array[]) {
		for(int i:array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
}
