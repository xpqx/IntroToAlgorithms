package javaSortingReview.liang.heapSort;

public class HeapSortTestDriver {
	public static void main(String[] args) {
		//Integer[] list = {-10, 2, 66, 77, 35, -9, -45, -66, 90, 42, -9};
		Integer[] list = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};
		HeapSort.heapSort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " "); 
		}
	}
}
