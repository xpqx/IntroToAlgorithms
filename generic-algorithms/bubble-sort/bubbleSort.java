public static void bubbleSort(int[] array){
	for (int outerLoop = 1; outerLoop < array.length; outerLoop++ )
		for (int innerLoop = 0; innerLoop < outerLoop-1; innerLoop++)
			if (array[innerLoop] > array[innerLoop + 1])
				int temporaryStorage = array[innerLoop + 1]
			        array[innerLoop + 1] = array[innerLoop]
			        array[innerLoop] = temporaryStorage;
}




















