package javaSortingReview.liang.bubbleSort;

public class BubbleSort {
	public static void bubbleSort(int[] list) {
		for (int k = 1; k < list.length; k++) {
			for (int i = 0; i < list.length - k; i++) {
				if (list[i] > list[i+1]) {
				int temp = list[i];
				list[i] = list[i+1];
				list[i + 1] = temp;
			}
		}
	}
}
}