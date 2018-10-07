/**
 * 
 * @author namesh
 * InsertionSort class contains the implementation of the InsertionSort Algorithm for
 * an array in acsending order.
 *
 */
public class InsertionSort {

	
	/**
	 * Implementation of the InsertionSort Algorithm for an array
	 * @param array
	 */
	public static void insertionSort(int array[]) {
		int temp;
		int j;
		for(int i = 0; i < array.length; i++) {
			j = i;
			while( j != 0 && array[j] < array[j-1] ) {
				temp = array[j];
				array[j] = array[j - 1];
				array[j - 1] = temp;
				j--;
			}
		}
	}
	
	
	
	
	
	
	public static void main(String args[]) {
		
		int array[] = {1, 7, 6, 2, 8, 3, 9, 0, 5, 4};
		
		InsertionSort.printArray(array);		
		InsertionSort.insertionSort(array);		
		InsertionSort.printArray(array);
		
	}
	
	
	
	public static void printArray(int array[]) {
		for(int i:array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
}
