
/**
 * @author namesh
 * 
 * BubbleSort class contains the array implementation of the bubble sort algorithm.
 */
public class BubbleSort {

	
	/**
	 * Sorts the given array in the acsending order
	 * @param array
	 */
	public static void bubbleSort(int array[]) {
		int temp;
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - i - 1; j++) {
				if(array[j] > array[j+1]) {
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	
	
	public static void main(String args[]) {
		
		int array[] = {1, 7, 6, 2, 8, 3, 9, 0, 5, 4};
		
		BubbleSort.printArray(array);		
		BubbleSort.bubbleSort(array);		
		BubbleSort.printArray(array);
		
	}
	
	
	
	public static void printArray(int array[]) {
		for(int i:array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
}
