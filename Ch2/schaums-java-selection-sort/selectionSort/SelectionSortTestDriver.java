package javaSortingReview.schaums.selectionSort;



public class SelectionSortTestDriver {
	public static void main(String[] args) {
		
		String s1 = "Before invoking the Selection Sort algorithm:";
		String s2 = "After invoking the Selection Sort algorithm:";
		String s3 = "Selection Sort runs in On^2 time, but is always preferred over Bubble Sort!";
		
		int[] list = {325, 200, 225, 100, 44, 22, 66, 7, 99, -22, 4, 99, -100};
		System.out.println(s1);
		System.out.println();
		SelectionSort.print(list);
		System.out.println();
		System.out.println(s2);
		System.out.println();
		SelectionSort.selectionSort(list);
		SelectionSort.print(list);
		System.out.println();
		System.out.println(s3);
	}

	

}
