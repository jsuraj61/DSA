package sorting_prac;

public class Sort {

	public static void bubblesort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {// n-1
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void selectionsort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[smallest] > arr[j]) {
					smallest = j;
				}
				int temp = arr[smallest];
				arr[smallest] = arr[i];
				arr[i] = temp;
			}
		}
	}

	public static void insertionsort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j != i; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void quick(int arr[]) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 7, 8, 3, 2, 1 };
//		Sort.bubblesort(arr);
//		Sort.selectionsort(arr);
		Sort.insertionsort(arr);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
