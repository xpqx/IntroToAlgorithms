package schaums.arrayReview.ch2;

import java.util.Arrays;

public class SampleArrayDefinitions {
	public static void main(String[] args) {
		
		float x[];
		
		float[] x1 = {1.2399f, 23.3456f };
		
		x = new float[100];
		
		print(x1);
		
		float x2[] = {45.5678f, 99.876f};
		
		print(x2);
		
		double[] x3 = {3, 4, 12, 78, 33, 99, 67};
		
		args = new String[10];
		
		boolean[] isPrime = new boolean[1000];
		
		int fib[] = {0, 1, 1, 2, 3, 5, 8, 13};
		
		print(fib);
		
		
		short[][][] b = new short[4][10][44];
		
		print(b);
		
		double a[][] = {{1.1, 2.2}, {3.3, 4.4}, null, {5.5, 6.6}, null};
		
		print(a);
		
		a[4] = new double[66];
		
		a[4][65] = 3.14;
		
		Object[] objects = {x, args, isPrime, fib, b, a};
	}

	public static void print(int[] a) {
		System.out.printf("{%d",  a[0]);
		for (int i = 1; i < a.length; i++) {
			System.out.printf(", %d", a[i]);
		}
		System.out.println("}");
	}
	
	public static void print(double[] a) {
		
		for (int i = 1; i < a.length; i++) {
			System.out.println(Arrays.toString(a));
		}
		System.out.println();
	}
	
	
	
	public static void print(float[] a) {
		System.out.printf("{%.4f",  a[0]);
		for (int i = 1; i < a.length; i++) {
			System.out.printf(", %.4f", a[i]);
		}
		System.out.println("}");
	}
	
	
	public static void print(Object[] a) {
		System.out.printf("{%s", a[0]);
		for (int i = 1; i< a.length; i++) {
			System.out.printf(", %s",  a[i]);
		}
		System.out.println("}");
	}
	
	
}
