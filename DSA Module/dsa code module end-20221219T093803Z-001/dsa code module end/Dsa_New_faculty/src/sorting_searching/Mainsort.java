package sorting_searching;

public class Mainsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int [] arr = {23,78,45,8,32,56};

//	        System.out.println("Passes: " + Util.bubbleSort1(arr) );
	        Util.bubbleSort(arr);
//	        Util.selectionSort(arr);
//	        Util.insertionSort(arr);
//	        Util.heapSort(arr, arr.length);
//	        Util.quickSort(arr, 0, arr.length-1);
//	        Util.mergeSort(arr, 0, arr.length-1);

	        
	        for(int val : arr) {
	            System.out.print(val  + " ");
	        }
//	        System.out.println();

	        /*int [] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

	        System.out.println( Util.binarySearch(arr, 10));
	        System.out.println( Util.binarySearch(arr, 50));
	        System.out.println( Util.binarySearch(arr, 100));
	        System.out.println( Util.binarySearch(arr, 11));
	        System.out.println();

	        System.out.println( Util.binarySearch(arr, 10, 0, 9));
	        System.out.println( Util.binarySearch(arr, 50, 0, 9));
	        System.out.println( Util.binarySearch(arr, 100, 0, 9));
	        System.out.println( Util.binarySearch(arr, 11, 0, 9));*/

	}

}
