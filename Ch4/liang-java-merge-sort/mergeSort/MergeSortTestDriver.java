package javaSortingReview.liang.mergeSort;

public class MergeSortTestDriver {
	public static void main(String[] args) {
		int[] list = {350, 223, 445, -45, 56, 234, -99, 498, 428, -990, 56, 78, 88, -999};
		
		String s1 = "Before invoking the Merge Sort algorithm:\n";
		String s2 = "After invoking the Merge Sort algorithm:\n";
		String s3 = "Merge Sort runs in O(n lg n) time!\n";
		
		System.out.println(s1);
		MergeSort.print(list);
		System.out.println("\n");
		MergeSort.mergeSort(list);
		System.out.println(s2);
		MergeSort.print(list);
		System.out.println("\n");
		System.out.println(s3);
}
}
