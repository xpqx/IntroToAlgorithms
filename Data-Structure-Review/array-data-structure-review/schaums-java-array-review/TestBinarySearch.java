package schaums.arrayReview.ch2;

public class TestBinarySearch {
	public static void main(String[] args) {
		int[] a = {22, 33, 44, 55, 66, 77, 88, 99};
		print(a);
		System.out.println("search(a, 44): " + binarySearch(a, 44));
		System.out.println("search(a, 44): " + binarySearch(a, 37));
		System.out.println("search(a, 44): " + binarySearch(a, 88));
	}
	
	public static int binarySearch(int[] a, int x) {
		int lo = 0;
		int hi = a.length;
		while (lo < hi) {
			int i = (lo + hi)/2;
			if (a[i] == x) {
				return i;
				
			} else if (a[i] < x) {
				lo = i + 1;
			} else {
				hi = i;
			}
		}
		return -1;
	}
	
	public static void print(int[] a) {
		System.out.printf("{%d", a[0]);
		for (int i = 1; i < a.length; i++) {
			System.out.printf(", %d", a[i]);
		}
		System.out.println("}");
	}

	public static void print(Object[] a) {
		System.out.printf("{%s", a[0]);
		for (int i = 1; i < a.length; i++) {
			System.out.printf(", %s", a[i]);
		}
		System.out.println("}");
	}

}
