package javaSortingReview.schaums.mergeSort;

public class MergeSort {
	public static void sort(int[] a) {
		//POSTCONDITION: a[0] <= a[1] <= ... <= a[a.length -1]
		sort(a, 0, a.length, 0);
	}
	
	private static void sort(int[] a, int p, int m, int q) {
		//PRECONDITIONS: 0 <= p <= q <= a.length
		//POSTCONDITION: a[p..q) is sorted
		if (q - p <2) {
			return;
		}
		m = (p + q)/2;
		//sort(a, p, m);
		//sort(a, m, q);
		merge(a, p, m, q);		
	}
	private static void merge(int[] a, int p, int m, int q) {
		
		if(a[m-1] <= a[m]) {
			return;
		}
		int i = p, j = m, k = 0;
		int[] tmp = new int[q-p];
		while (i < m && j < q) {
			tmp[k++] = (a[i]<=a[j] ? a[i++]:a[j++]);
		}
		System.arraycopy(a,  i, a,  p+k,  m-i);
		System.arraycopy(tmp,  0, a,  p,  k);
		}
	
	public static void print(int[] list) {
		for (int lista : list) {
			System.out.printf("%s ", lista);
		}
		System.out.println();
	}
		
	}




