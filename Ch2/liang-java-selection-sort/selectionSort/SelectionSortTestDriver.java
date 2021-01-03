package javaSortingReview.liang.selectionSort;

import java.util.Arrays;

public class SelectionSortTestDriver {
	public static void main(String[] args) {
		String s1 = "Before calling Selection Sort on the array:\n";
		String s2 = "After calling Selection Sort on the array:\n";
		
		
		int[] list = {1000, 2, 3, 22, 5, -9, 3, 14, 100, -33, -5, -13, 88, 77, -500};
		System.out.print(s1);
		System.out.println(Arrays.toString(list));
		SelectionSort.selectionSort(list);
		System.out.println();
		System.out.print(s2);
		System.out.println(Arrays.toString(list));
		
	}

}
