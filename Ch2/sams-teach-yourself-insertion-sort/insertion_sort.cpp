//insertion sort.cpp
//demonstrate insertion sort
#include <iostream>
#include <vector>

using namespace std;

class ArrayIns{
private:
	vector<double> v;
	int nElems;

public:
	ArrayIns(int max):nElems(0){
		v.resize(max);
	}
	void insert(double value){
		v[nElems] = value;
		nElems++;
	}
	void display(){
		for (int j = 0; j < nElems; j++)
			cout << v[j] << " ";
		cout << endl;
	}
	void insertionSort(){//begin insertionSort()
		int in, out;
		for (out =1; out < nElems; out++){
			double temp = v[out];
			in = out;
			while(in >0 && v[in-1] >- temp){
				v[in] = v[in-1];
				--in;
			}
			v[in] = temp;
			}//end for
		}//end insertionSort()
	};//end class ArrayIns

	int main(){
		int maxSize = 100;//array size
		ArrayIns arr(maxSize);//create array

		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		arr.insert(90);
		arr.insert(78);
		arr.insert(88);
		arr.insert(34);

		arr.display();
		arr.insertionSort();
		arr.display();
		return 0;
	}//end main
/*
PROGRAM OUTPUT
77 99 44 55 22 88 11 0 66 33 90 78 88 34
34 88 78 90 33 66 0 11 88 22 55 44 99 77


*/