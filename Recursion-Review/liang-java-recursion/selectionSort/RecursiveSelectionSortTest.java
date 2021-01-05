package liang.recursion.selectionSort;

import java.util.Arrays;

public class RecursiveSelectionSortTest {
	public static void main(String[] args) {
		double[] list = {203, 88, 44, 22, 21, 33, 45, 67, 99, -99, 100};
		
		System.out.println("Before sorting the type double array object...\n");
		System.out.println();
		System.out.println(Arrays.toString(list));
		RecursiveSelectionSort.selectionSort(list);
		System.out.println("After sorting the type double array object...\n");
		System.out.println();
		System.out.println(Arrays.toString(list));
	}
	

}

/* OUTPUT
 * Before sorting the type double array object...


[203.0, 88.0, 44.0, 22.0, 21.0, 33.0, 45.0, 67.0, 99.0, -99.0, 100.0]
After sorting the type double array object...


[-99.0, 21.0, 22.0, 33.0, 44.0, 45.0, 67.0, 88.0, 99.0, 100.0, 203.0]

 * 
 * 
 * 
 * 
 * 
 * */
 