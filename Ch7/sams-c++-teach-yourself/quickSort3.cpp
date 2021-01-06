//quickSort3.cpp
//demonstrates quick sort
#include <iostream>
#include <vector>
#include <cstdlib>
#include <ctime>
using namespace std;

class ArrayIns{
private:
	vector<double> theArray;
	int nElems;
public:

ArrayIns(int max){
	theArray.reserve(max);
	nElems = 0;
}

void insert(double value){
	theArray[nElems] = value;
	nElems++;
}

void display(){
	cout << "A=";
	for (int j = 0; j < nElems; j++)
		cout << theArray[j] << " ";
	cout << endl;
}

void quickSort(){
	recQuickSort(0, nElems - 1);
	insertionSort(0, nElems - 1);
}

void recQuickSort(int left, int right){
	int size = right - left + 1;
	if (size < 10)
		insertionSort(left, right);
	else {
		double median = medianOf3(left, right);
		int partition = partitionIt(left, right, median);
		recQuickSort(left, partition - 1);
		recQuickSort(partition+1, right);
	}
}

double medianOf3(int left, int right){
	int center = (left + right)/2;

	if (theArray[left] > theArray[center])
		swap(left, center);

	if (theArray[left] > theArray[right])
		swap(left, right);

	if (theArray[center] > theArray[right])
		swap(center, right);

	swap(center, right - 1);
	return theArray[right-1];
}

void swap(int dex1, int dex2){
	double temp = theArray[dex1];
	theArray[dex1] = theArray[dex2];
	theArray[dex2] = temp;
}

int partitionIt(int left, int right, double pivot){
	int leftMark = left;
	int rightMark = right - 1;
	while (true){
		while(theArray[++leftMark] < pivot)
			;
		while (theArray[--rightMark] > pivot)
			;
		if (leftMark >= rightMark)
			break;
		else
			swap(leftMark, rightMark);
	}
	swap(leftMark, right-1);
	return leftMark;
}

void insertionSort(int left, int right){
	int in, out;
	for(out = left + 1; out <= right; out++){
		double temp = theArray[out];
		in = out;
		while (in > left && theArray[in-1] >= temp){
			theArray[in] = theArray[in-1];
			--in;
		}
		theArray[in] = temp;
	}
}

};

int main(){
	int maxSize = 16;
	ArrayIns arr(maxSize);
	time_t aTime;
	srand(static_cast<unsigned>( time(&aTime)) );
	for (int j =0; j < maxSize; j++){
		double n = rand() %99;
		arr.insert(n);
	}
	arr.display();
	arr.quickSort();
	arr.display();
	return 0;
}
