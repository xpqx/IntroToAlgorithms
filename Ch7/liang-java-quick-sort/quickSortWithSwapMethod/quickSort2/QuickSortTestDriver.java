package javaSortingReview.liang.quickSort;

public class QuickSortTestDriver {
	public static void main(String[] args) {

		int[] list = {350, 223, 445, -45, 56, 234, -99, 498, 428, -990, 56, 78, 88, -999};

		String s1 = "Before invoking the Quick Sort algorithm:\n";
		String s2 = "After invoking the Quick Sort algorithm:\n";
		String s3 = "Quick Sort runs in O(n lg n) time on average!\n";

		System.out.println(s1);
		QuickSort.print(list);
		System.out.println("\n");
		QuickSort.quickSort(list);
		System.out.println(s2);
		QuickSort.print(list);
		System.out.println("\n");
		System.out.println(s3);

	}
}
