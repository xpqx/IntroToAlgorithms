package javaSortingReview.schaums.bubbleSort;

public class BubbleSort {
	public static void bubbleSort(int[] list) {
		for (int i = list.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (list[j] > list[j + 1]) {
					swap(list, j, j+1);
				}
			}
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
