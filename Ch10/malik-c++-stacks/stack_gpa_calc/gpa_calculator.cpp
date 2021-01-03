//program to test the various operations of a stack
#include <iostream>
#include <iomanip>
#include <fstream>
#include <string>

#include "stackADT.h"

using namespace std;



int main(){

	//step 1
	double GPA;
	double highestGPA;
	string name;

	stackType<string> stack(100);

	ifstream infile;

	infile.open("highestGPAData.txt");//step 2

	if (!infile){
		cout << "The input file does not exist"
			 << "Program terminates!"
			 << endl
		return 1;
	}

	cout << fixed << showpoint;
	cout << setprecision(2);

	infile >> GPA >> name;

	highestGPA = GPA;

	while (infile){
		if (GPA > highestGPA){
			stack.initializeStack();
			if (!stack.initializeStack())
				stack.push(name);
			highestGPA = GPA;
		}
		else if (GPA == highestGPA)
			if (!stack.isFullStack())
				stack.push(name);
			else
			{
				cout << "Stack overflows."
					 << "Program terminates!"
					 << endl;
				return 1;//exit program
			}
			infile >> GPA >> name;
		}

		cout <<"Highest GPA = " << highestGPA
			 << endl;
		cout << "The students holding the "
			 << "highest GPA are:" << endl;

		while (!stack.isEmptyStack()){
			cout << stack.top() << endl;
			stack.pop();
		}
		cout << endl;

		return 0;
	}
