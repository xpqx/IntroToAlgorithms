package javaSortingReview.liang.bubbleSort;

import java.util.Arrays;

public class BubbleSortTestDriver {
	public static void main(String[] args) {
		String s1 = "Before calling Improved Bubble Sort on the array:\n";
		String s2 = "After calling Improved Bubble Sort on the array:\n";
		String s3 = "Before calling Bubble Sort on the array:\n";
		String s4 = "After calling Bubble Sort on the array:\n";
		
		int[] list = {2, 3, 22, 5, -9, 3, 14, 100, -33, -5, -13, 88, 77};
		System.out.print(s1);
		System.out.println(Arrays.toString(list));
		ImprovedBubbleSort.bubbleSort(list);
		System.out.println();
		System.out.print(s2);
		System.out.println(Arrays.toString(list));
		
		int[] list2 = {21, -3, -22, 5, -91, 39, -14, 200, -33, -5, -13, 88, 77, 102, 202, 222, 333, -339};
		System.out.println();
		System.out.print(s3);
		System.out.println(Arrays.toString(list2));
		BubbleSort.bubbleSort(list2);
		System.out.println();
		System.out.print(s4);
		System.out.println(Arrays.toString(list2));
		
		
	}

}
