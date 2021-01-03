package javaSortingReview.schaums.quickSort;

public class QuickSortTestDriver {
	public static void main(String[] args) {
		String s1 = "Before invoking the Quick Sort algorithm:";
		String s2 = "After invoking the Quick Sort algorithm:";
		String s3 = "Quick Sort runs in O(nlgn) time in the average case!";

		int[] list = {325, 200, 225, 100, 44, 22, 66, 7, 99, -22, 4, 99, -100};
		System.out.println(s1);
		System.out.println();
		QuickSort.print(list);
		System.out.println();
		System.out.println(s2);
		System.out.println();
		QuickSort.quickSort(list);
		QuickSort.print(list);
		System.out.println();
		System.out.println(s3);
	}
}


