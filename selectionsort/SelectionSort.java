/**
 * 
 * @author namesh
 * InsertionSort class contains the implementation of the Selection Sort Algorithm for
 * an array in acsending order.
 *
 */
public class SelectionSort {

	
	/**
	 * Implementation of the Selection Sort Algorithm for an array
	 * @param array
	 */
	public static void selectionSort(int array[]) {
		int indexOfMin;
		int temp;
		for(int i = 0; i < array.length; i++) {
			
			// find the index of the element of minimum
			indexOfMin = i;
			for(int j = i+1; j < array.length; j++) {
				if( array[indexOfMin] > array[j] ) {
					indexOfMin = j;
				}
			}
			
			// swap
			temp = array[indexOfMin];
			array[indexOfMin] = array[i];
			array[i] = temp;
		}
	}
	
	
	
	public static void main(String args[]) {
		
		int array[] = {1, 7, 6, 2, 8, 3, 9, 0, 5, 4};
		
		SelectionSort.printArray(array);		
		SelectionSort.selectionSort(array);		
		SelectionSort.printArray(array);	
	}
	
	
	
	public static void printArray(int array[]) {
		for(int i:array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
}
