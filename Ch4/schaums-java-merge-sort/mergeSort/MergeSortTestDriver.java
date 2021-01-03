package javaSortingReview.schaums.mergeSort;

import javaSortingReview.schaums.insertionSort.InsertionSort;

public class MergeSortTestDriver {
	public static void main(String[] args) {
		
		String s1 = "Before invoking the Merge Sort algorithm:";
		String s2 = "After invoking the Merge Sort algorithm:";
		String s3 = "Merge Sort runs in O(nlgn) time!";
		
		
		
		
		int[] list = {325, 200, 225, 100, 44, 22, 66, 7, 99, -22, 4, 99, -100};
		System.out.println(s1);
		System.out.println();
		MergeSort.print(list);
		System.out.println();
		System.out.println(s2);
		System.out.println();
		MergeSort.sort(list);
		InsertionSort.print(list);
		System.out.println();
		System.out.println(s3);
	}

}
