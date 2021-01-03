//program test various operations of a linked stack

#include <iostream>
#include "linkedStack.h"

using namespace std;

void testCopy(linkedStackType<int> OStack);

int main(){
	linkedStackType<int> stack;
	linkedStackType<int> otherStack;
	linkedStackType<int> newStack;

	//add elements into stack
	stack.push(34);
	stack.push(43);
	stack.push(27);

	//use the assignment operator to copy the elements
	//of stack into newStack
	newStack = stack;

	cout << "After the assignment operator, newStack: "
		 << endl;
		 //output the elments of newStack
		 while (! newStack.isEmptyStack()){
		 	cout << newStack.top() << endl;
		 	newStack.pop();
		 }

		 //use the assignment operator to copy the elements
		 //of stack into otherStack
		 otherStack = stack;
		 cout << "Testing the copy constructor." << endl;

		 testCopy(otherStack);

		 cout << "After the copy constructor, otherStack: " << endl;

		 while (!otherStack.isEmptyStack()){
		 	cout << otherStack.top() << endl;
		 	otherStack.pop();
		 }
		 return 0;
}

//function to test the copy constructor
void testCopy(linkedStackType<int> OStack){
	cout << "Stack in the function testCopy:" << endl;

	while (!OStack.isEmptyStack()){
		cout << OStack.top() << endl;
		OStack.pop();
	}
}