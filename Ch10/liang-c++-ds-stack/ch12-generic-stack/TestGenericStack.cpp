//testing the generic stack
#include <iostream>
#include <string>
#include "GenericStack.h"
using namespace std;

int main(){
	//create a stack of int values
	Stack<int> intStack;
	for (int i = 0;i < 10; i++)
		intStack.push(i);

	while(!intStack.empty()){
		cout << intStack.pop() << " ";
	cout << endl;
	}

	//create a stack of strings
	Stack<string> stringStack;
	stringStack.push("Chicago");
	stringStack.push("Denver");
	stringStack.push("London");

	while(!stringStack.empty()){
		cout << stringStack.pop() << " ";
		cout << endl;
	}

	return 0;
}

/*
PROGRAM OUTPUT USING WINDOWS TERMINAL
9
8
7
6
5
4
3
2
1
0
London
Denver
Chicago
*/