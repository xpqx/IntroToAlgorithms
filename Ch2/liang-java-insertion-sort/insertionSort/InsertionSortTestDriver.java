package javaSortingReview.liang.insertionSort;

import java.util.Arrays;

public class InsertionSortTestDriver {
	public static void main(String[] args) {
		int[] list = {1, 9, 4, 6, 5, -4};
		System.out.println(Arrays.toString(list));
		System.out.println();
		InsertionSort.insertionSort(list);
		System.out.println();
		System.out.println(Arrays.toString(list));
	}

}
