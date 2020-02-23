

public class LinearSearchMethod{
	public static void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
	}
	
	public static int linearSearch(int[] array, int k){
		// Continue to search until end or value found
		for(int i = 0; i < array.length; i++){
			// Check current item
			if (array[i] == k)
				return i; 	// We have found the value
		}
		return -1; // Not found 
	}
	
	public static void main(String[] args){
		// Declare an integer array
		int[] list = {10,35,13,1,8,20,33,23,4,19};
		int k = 20;
		// Print the array
		printArray(list);
		// Search the array
		int index = linearSearch(list, k);
		// Have we found the value?
		if (index > 0)
			System.out.printf("Value %d found at index %d.\n", k, index);
		else
			System.out.printf("Value %d not found.\n", k);
		
		
	}
}