//quickSort2.cpp
//demonstrates quick sort with median of three partitioning
#include <iostream>
#include <vector>
#include <cstdlib>
#include <ctime>

using namespace std;

class ArrayIns{
private:
	vector<double>(theVect);
	int nElems;
public:

ArrayIns(int max) : nElems(0){
	theVect.resize(max);
}

void insert(double value){
	theVect[nElems] = value;
	nElems++;
}

void display(){
	cout << "A=";
	for (int j = 0; j < nElems; j++)
		cout << theVect[j] << " ";
	cout << endl;
}

void quickSort(){
	recQuickSort(0, nElems - 1);
}

void recQuickSort(int left, int right){
	int size = right - left + 1;
	if(size <=3)
		manualSort(left, right);
	else {
		double median = mediaOf3(left, right);
		int partition = partitionIt(left, right, median);
		recQuickSort(left, partition - 1);
		recQuickSort(partition + 1, right);
	}
}

double medianOf3(int left, int right){
	int center = (left + right)/2;
	if (theVect[left] > theVect[center])
		swap(left, center);

	if (theVect[left] > theVect[right])
		swap(left, right)

	if (theVect[center] > theVect[right])
		swap(center, right);

	swap(center, right - 1);
	return theVect[right - 1]
}//end medianOf3

void swap(int dex1, int dex2){
	double temp = theVect[dex1];
	theVect[dex1] = theVect[dex2];
	theVect[dex2] = temp;
}

int partitionIt(int left, int right, double pivot){
	int leftMark = left;
	int rightMark = right - 1;

	while (true){
		while (theVect[++leftMark] < pivot )
			;
		while (theVect[--rightMark] > pivot )
			;
		if (leftMark >= rightMark)
			break;
		else
			swap(leftMark, rightMark);
	}
	swap(leftMark, right-1);
	return leftMark
}//end partitionIt()
void manualSort(int left, int right){
	int size = right - left + 1;
	if(size < = 1)
		return
	if (size == 2)
		if (theVect[left] > theVect[right])
			swap(left, right);
		return;
	}
	else {
		if (theVect[left] > theVect[right-1])
			swap(left, right-1);
		if (theVect[left] > theVect[right])
			swap(left, right);
		if (theVect[right-1] > theVect[right])
			swap(right-1, right);
	}
}//end manualSort()


int main(){
	time_t aTime;
	int maxSize = 16;
	ArrayIns arr(maxSize);
	srand( static_cast<unsigned>(time(&aTime)));

	for (int j = 0; j < maxSize; j++){
		double n = rand() %99;
		arr.insert(n);
	}
	arr.display();
	arr.quickSort();
	arr.display();
	return 0;
	}