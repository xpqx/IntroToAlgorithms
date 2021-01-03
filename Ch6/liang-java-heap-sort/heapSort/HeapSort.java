package javaSortingReview.liang.heapSort;

public class HeapSort {
	public static <E extends Comparable<E>> void heapSort(E[] list) {
		Heap<E> heap = new Heap<>();
		//add elements to the heap
		for (int i = 0; i < list.length; i++) {//begin for
			heap.add(list[i]);
		}//end for

		//remove elements from the heap
		for (int i = list.length - 1; i>= 0; i--) {
			list[i] = heap.remove();
		}
	}
}
