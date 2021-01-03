package javaSortingReview.schaums.insertionSort;

public class InsertionSort {
	public static void insertionSort(int[] list) {
		for (int i = 1; i < list.length; i++) {
			int listai = list[i], j;
			for (j = i; j > 0 && list[j-1] > listai; j--) {
				list[j] = list[j-1];
			}
			list[j] = listai;
		}
	}
	public static void swap(int[] list, int i, int j) {
		if (i == j) {
			return;
		}
		int temp = list[j];
		list[j] = list[i];
		list[i] = temp;
	}

	public static void print(int[] list) {
		for (int lista : list) {
			System.out.printf("%s ", lista);
		}
		System.out.println();
	}
}


