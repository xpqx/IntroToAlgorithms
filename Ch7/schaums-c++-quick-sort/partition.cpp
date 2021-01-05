//partition.cpp
//demonstrates partitioning an array
#include <iostream>
#include <vector>
#include <cstdlib> //for random numbers
#include <ctime> //for random numbers

using namespace std;

class ArrayPar{
private:
	vector<double> theVect; //vector of doubles
	int nElems;             //number of data items
public:

ArrayPar(int max): nElems(0){//constructor
	theVect.resize(max); //size the vector
}

void insert(double value){     //put element into array
	theVect[nElems] = value;  //insert it
	nElems++;                //increment size
}

int getSize(){
	return nElems;
}

void display(){
	cout << "A=";
	for (int j = 0; j< nElems; j++)
		cout << theVect[j] << " ";
	cout << endl;
}

int partitionIt(int left, int right, double pivot){//partition a range
	int leftMark = left - 1; //right of first elem
	int rightMark = right + 1; //left of pivot
	while (true){
		while(leftMark < right && //find bigger item
			theVect[--rightMark] > pivot)
			;//(nop)
		while(rightMark > left && theVect[--rightMark] > pivot)
			;//nop
		if (leftMark>= rightMark)
			break;
		else
			swap(leftMark, rightMark);
	} //end while(true)
	return leftMark;
	}//end partitionIt()

	void swap(int dex1, int dex2){//swap two elements
		double temp;
		temp = theVect[dex1];         //A into temp
		theVect[dex1] = theVect[dex2];//B into A
		theVect[dex2] = temp;         //temp into B
}//end swap
};//end class ArrayPar

int main(){
	time_t aTime;
	int maxSize = 16;       //array size
	ArrayPar arr(maxSize);  //create the array
	srand( static_cast<unsigned>(time(&aTime)) );//seed randoms
		for (int j = 0; j < maxSize; j++){//fill the array with random numbers
			double n = rand() % 199;
			arr.insert(n);
		}
		arr.display();

		double pivot = 99;
		cout << "Pivot is " << pivot;
		int size = arr.getSize();

		int partDex = arr.partitionIt(0, size -1, pivot);

		cout << ", Partition is at index " << partDex << endl;
		arr.display();
		return 0;
}
