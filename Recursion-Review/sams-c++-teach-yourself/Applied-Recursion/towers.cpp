//towers.cpp
//solves Towers of Hanoi Puzzle
#include <iostream>
using namespace std;
void doTowers(int, char, char, char); //prototype
int main(){
	int nDisks;
	cout << "Enter number of disks: ";
	cin >> nDisks;
	doTowers(nDisks, 'A', 'B', 'C');
	return 0;
}
void doTowers(int topN, char src, char inter, char dest){
	if (topN == 1){
		cout << "Disk 1 from " << src << " to " << dest << endl;
	} else {
		doTowers(topN - 1, src, dest, inter);
		cout << "Disk " << topN
		<< " from " << src << " to " << dest << endl;
	doTowers(topN - 1, inter, src, dest);
		}
	}
