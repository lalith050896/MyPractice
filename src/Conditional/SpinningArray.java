package Conditional;


public class SpinningArray {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5};
		SpinningArray.rotate(arr, 3);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
	}

	public static int[] rotate(int[] arr, int nop) {
		if (arr == null || nop < 0) {
	        System.out.println("The array must be non-null and the order must be non-negative");  
	    }
	    int offset = arr.length - nop % arr.length;
	    if (offset > 0) {
	        int[] copy = arr.clone();
	        for (int i = 0; i < arr.length; ++i) {
	            int j = (i + offset) % arr.length;
	            arr[i] = copy[j];
	        }
	    }
		return null;

	}

}
