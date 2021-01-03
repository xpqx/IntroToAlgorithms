package javaSortingReview.schaums.quickSort;

public class QuickSort {
	public static void quickSort(int[] a) {
		//precondition 0 <= a[1] <=...<= a[a.length-1];
		quickSort(a, 0, a.length);
	}
	
	private static void quickSort(int[] a, int p, int q) {
		//precondition 0 <= p <= q<= a.length
		//postcondition a[p..q) is sorted
		if (q - p <2) {
			return;
		}
		int m = partition(a, p, q);
		quickSort(a, p, m);
		quickSort(a, m+1, q);
	}
	private static int partition(int[] a, int p, int q) {
		//RETURNS: index of pivot element a[m]
		//POSTCONDITION: a[i] <= a[m] <=a[j] for p <= i <= m <= j < q;
		int pivot = a[p], i = p, j = q;
		while ( i < j) {
			while (i < j && a[--j] >= pivot);
			if (i < j) {
				a[i] = a[j];
			}
			while (i < j && a[++i] <= pivot);
			if (i < j) {
				a[j] = a[i];
			}
		}
		a[j] = pivot;
		return j;
	}
	
	public static void print(int[] list) {
		for (int lista : list) {
			System.out.printf("%s ", lista);
		}
		System.out.println();
	}
	
}