package javaSortingReview.schaums.insertionSort;

public class InsertionSortTestDriver {
	public static void main(String[] args) {
		
		String s1 = "Before invoking the Insertion Sort algorithm:";
		String s2 = "After invoking the Insertion Sort algorithm:";
		String s3 = "Insertion Sort runs in On^2 time, but it is preferred over Bubble Sort!";
		
		int[] list = {325, 200, 225, 100, 44, 22, 66, 7, 99, -22, 4, 99, -100};
		System.out.println(s1);
		System.out.println();
		InsertionSort.print(list);
		System.out.println();
		System.out.println(s2);
		System.out.println();
		InsertionSort.insertionSort(list);
		InsertionSort.print(list);
		System.out.println();
		System.out.println(s3);
	}

	

}
