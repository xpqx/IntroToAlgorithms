//quickSort1.cpp
//demonstrates simple version of quick sort
#include <iostream>
#include<vector>
#include<cstdlib> //for random numbers
#include<ctime> //for random numbers
using namespace std;
////////////////////////////////////////////////////////////////
class ArrayIns
{
private:
vector<double>(theVect); //vector of doubles
int nElems; //number of data items
public:
//--------------------------------------------------------------
ArrayIns(int max) : nElems(0) //constructor
{
theVect.resize(max); //size the vector
}
//--------------------------------------------------------------
void insert(double value) //put element into array
{
theVect[nElems] = value; //insert it
nElems++; //increment size
}
//--------------------------------------------------------------
void display() //displays array contents
{
cout << "A=";
for(int j=0; j<nElems; j++) //for each element,
cout << theVect[j] << " "; //display it
cout << endl;
}
//--------------------------------------------------------------
void quickSort() //sort array
{
recQuickSort(0, nElems-1); //call recursive sort
}
//--------------------------------------------------------------
void
recQuickSort(int left, int right) //recursive sort
{
if(right-left <= 0) //if size <= 1,
return; // already sorted
else //size is 2 or larger
{
double pivot = theVect[right]; //rightmost item
//partition range
int partition = partitionIt(left, right, pivot);
recQuickSort(left, partition-1); //sort left side
recQuickSort(partition+1, right); //sort right side
}
} //end recQuickSort()
//--------------------------------------------------------------
int partitionIt(int left, int right, double pivot)
{
int leftMark = left-1; //left (after ++)
int rightMark = right; //right-1 (after --)
while(true)
{ //find bigger item
while( theVect[++leftMark] < pivot )
; // (nop)
//find smaller item
while(rightMark > 0 && theVect[--rightMark] > pivot)
; // (nop)
if(leftMark >= rightMark) //if pointers cross,
break; // partition done
else //not crossed, so
swap(leftMark, rightMark); // swap elements
} //end while(true)
swap(leftMark, right); //restore pivot
return leftMark; //return pivot location
} //end partitionIt()
//--------------------------------------------------------------
void swap(int dex1, int dex2) //swap two elements
{
double temp = theVect[dex1]; //A into temp
theVect[dex1] = theVect[dex2]; //B into A
theVect[dex2] = temp; //temp into B
} //end swap(
//--------------------------------------------------------------
}; //end class ArrayIns
////////////////////////////////////////////////////////////////
int main()
{
time_t aTime;
int maxSize = 16; //array size
ArrayIns arr(maxSize); //create array
srand( static_cast<unsigned>(time(&aTime)) ); //seed randoms
for(int j=0; j<maxSize; j++) //fill array with
{ //random numbers
double n = rand() % 99;
arr.insert(n);
}
arr.display(); //display items
arr.quickSort(); //quicksort them
arr.display(); //display them again
return 0;
} //end main()
