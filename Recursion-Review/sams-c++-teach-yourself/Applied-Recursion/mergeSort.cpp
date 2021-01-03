//merge sort
//demonstrate
#include <iostream>
#include <vector>
using namespace std;

class DArray{
private:
	vector<Double>(theVect);
	int nElems;
	void recMergeSort(vector<double>, int, int);
	void merge(vector<double>, int, int, int);
public:

	DArray(int max): nElems(0){ //constructor
		theVect.resize(max); //size vector
	}

	void insert(double value){
		theVect[nElems] = value;
		nElems++;
	}

	void display(){
		for (int j = 0; j < nElems; j++)
			cout << theVect[j] << " ";
		cout << endl;
	}

	void mergeSort(){
		vector<double>(workSpace);
		workSpace.resize(nElems);
		recMergeSort(workSpace, 0, nElems - 1);
	}
};//end class DArray

void DArray::recMergeSort(vector<double> workSpace, int lowerBound, int upperBound){
	if (lowerBound == upperBound)
		return;
	else {
		int mid = (lowerBound+upperBound)/2; //find mid point
		recMergeSort(workSpace, lowerBound, mid);//sort low half
		recMergeSort(workSpace, mid+1, upperBound);//merge them
		merge(workSpace, lowerBound, mid+1, upperBound);//merge them
	}//end else
}//end recMergeSort()

void DArray::merge(vector<double> workSpace, int lowPtr, int highPtr, int upperBound){
	int j = 0;
	int lowerBound = lowPtr;
	int mid = highPtr - 1;
	int n = upperBound - lowerBound + 1

 	while (lowPtr <= mid && highPtr <= upperBound)
 		if (theVect[lowPtr] < theVect[highPtr])
 			workSpace[j++] = theVect[lowPtr++];
 		else
 			workSpace[j++] = theVect[highPtr++];

 	while (lowPtr <= mid)
 		workSpace[j++] = theVect[lowPtr++];

 	while (highPtr <= upperBound)
 		workSpace[j++] = theVect[highPtr++];

 	for(j = 0; j < n; j++)
 		theVect[lowerBound+j] = workSpace[j];
 }

 int main(){
 	const int maxSize = 100;
 	DArray arr(maxSize);

 	arr.insert(64);
 	arr.insert(21);
 	arr.insert(33);
 	arr.insert(78);
 	arr.insert(44);
 	arr.insert(67);
 	arr.insert(23);
 	arr.insert(99);
 	arr.insert(88);
 	arr.insert(55);
 	arr.insert(10);
 	arr.insert(-4);
 	arr.insert(100);
 	arr.insert(59);
 	arr.insert(22);
 }