package schaums.arrayReview.ch2;

import java.util.Arrays;

public class TestArrays {
	public static void main(String[] args) {
		
		int[] a = {100, 44, 77, 55, 22, 99, 88, 33, 66, -99};
		int[] a1 = {200, 34, 67, 45, 12, 89, 98, 23, 67, -98};
		
		System.out.println("Before sorting array: \n");
		print(a);
		
		
		Arrays.parallelSort(a);
		System.out.println("After sorting array with parallel sort: \n");
		print(a);
		
		
		Arrays.sort(a1);
		System.out.println("After sorting array with regular sort: \n");
		print(a1);
	}
	
	public static void print(int[] a) {
		System.out.printf("{%d", a[0]);
		for (int i = 1; i < a.length; i++) {
			System.out.printf(", %d",  a[i]);
		}
		System.out.println("}");
	}

}
