
public class BinarySearch {

	
	public static int binarySearch(int array[], int start, int end, int key) {
		
		int mid = (start + end)/2;
		
		if(mid == start) {
			return -1;
		}
		
		if(array[mid] == key) {
			return mid;
		}
		else if( key > array[mid] ) {
			return binarySearch(array, mid, end, key);
		}
		else {
			return binarySearch(array, start, mid, key);
		}
	}
	
	
	
	
	public static void main(String args[]) {
		
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println("Answer: " + binarySearch(array, 0, array.length, 10));
	}
	
	
	
	
	
}
