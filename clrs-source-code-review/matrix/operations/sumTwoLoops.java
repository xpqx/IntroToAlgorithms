package matrix.operations;

public class sumTwoLoops {

	public static void main(String[] args) {

		int n = 2;
		sumTwoLoops(n);
	}





	public static void sumTwoLoops(int n) {


//		final int SIZE = 0;
//		int[] C = new int[SIZE];
//		int[] A = new int[SIZE];
//		int[] B = new int[SIZE];
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
		
		int[] myList = {3, 2};
		
		for (int i = 0; i < myList.length; i++)
			    num1 = myList[i];
			for (int j = 1; j < myList.length; j++)
				 num2 = myList[j];
			     sum = num1 + num2;
			     
			     System.out.println(sum);

	}
}