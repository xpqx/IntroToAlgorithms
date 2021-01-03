package javaSortingReview.schaums.bubbleSort;

public class BubbleSortTestDriver {
	public static void main(String[] args) {
		
		String s1 = "Before invoking the Bubble Sort algorithm:";
		String s2 = "After invoking the Bubble Sort algorithm:";
		String s3 = "Bubble Sort runs in On^2 time!";
		
		int[] list = {325, 200, 225, 100, 44, 22, 66, 7, 99, -22, 4, 99, -100};
		System.out.println(s1);
		System.out.println();
		BubbleSort.print(list);
		System.out.println();
		System.out.println(s2);
		System.out.println();
		BubbleSort.bubbleSort(list);
		BubbleSort.print(list);
		System.out.println();
		System.out.println(s3);
	}

	

}
