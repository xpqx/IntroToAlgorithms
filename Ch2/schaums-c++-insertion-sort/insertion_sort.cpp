#include <iostream>
/*
PROGRAM NEEDS MINOR DEBUGGING!
*/
using namespace std;

int main(){
	int a[] = {77, 44, 99, 66, 33, 55, 88, 22, 44};
	print(a, 9);
	sort(a, 9);
	print(a, 9);
}
template<class T> void sort(T* a, int n){
	for (int i = 1; i < n; i++){
		T temp = a[i];
		for (int j = i; j >0 && a[j-1] > temp; j--){
			a[j] = a[j-1];
			a[j] = temp;
		}
	}
}

void print(int* a, int n){
	cout << a[0];
	for (int i = 1; i < n; i++)
		cout << "," << a[i];
}






