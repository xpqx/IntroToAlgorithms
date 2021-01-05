package liang.recursion.selectionSort;

public class RecursiveSelectionSort {
	public static void selectionSort(double[] list) {
		selectionSort(list, 0, list.length - 1);
	}
	
	private static void selectionSort(double[] list, int low, int high) {
		if (low < high) {
			int indexOfMin = low;
			double min = list[low];
			for (int i = low + 1; i <= high; i++) {
				if (list[i] < min) {
					min = list[i];
					indexOfMin = i;
				}
			}
			
			list[indexOfMin] = list[low];
			list[low] = min;
			
			selectionSort(list, low + 1, high);
		}
	}

	

}
