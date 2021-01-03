package javaSortingReview.schaums.selectionSort;

public class SelectionSort {
	public static void selectionSort(int[] list) {
		for (int i = list.length - 1; i > 0; i--) {
			int m = 0;
			for (int j = 1; j <= i; j++) {
				if (list[j] > list[m]) {
					m = j;
				}
			}
			swap(list, i, m);
		}
	}

	public static void swap(int[] list, int i, int m) {
		if (i == m) {
			return;
		}
		int temp = list[m];
		list[m] = list[i];
		list[i] = temp;
	}

	public static void print(int[] list) {
		for (int listai : list) {
			System.out.printf("%s ", listai);
		}
		System.out.println();
	}
}
