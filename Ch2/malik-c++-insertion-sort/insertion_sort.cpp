#include <iostream>
using namespace std;

void insertionSort(int list[], int length);
int main(){
	int list[] = {2, 56, 34, 25, 73, 46, 89, 10, 5, 16};
//Line 1
	int i;
//Line 2
	insertionSort(list, 10);
//Line 3
	cout << "After sorting, the list elements are:"
		 << endl;
//Line 4
	for (i = 0; i < 10; i++)
//Line 5
		cout << list[i] << " ";
//Line 6
		cout << endl;
//Line 7
	return 0;
//Line 8
}

void insertionSort(int list[], int listLength){
	int firstOutOfOrder, location;
	int temp;

	for (firstOutOfOrder = 1; firstOutOfOrder < listLength; firstOutOfOrder++){
		if (list[firstOutOfOrder] < list[firstOutOfOrder - 1]){
			temp = list[firstOutOfOrder];
			location = firstOutOfOrder;

			do {
				list[location] = list[location -1];
				location--;
			}
			while (location > 0 && list[location - 1] > temp);
			list[location] = temp;
		}//end if
	}//end outer for
}//end insertionSort