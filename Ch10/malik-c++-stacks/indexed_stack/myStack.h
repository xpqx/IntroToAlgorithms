#ifndef H_StackType
#define H_StackType

#include <iostream>
#include <cassert>

#include "stackADT.h"

using namespace std;

template <class Type>
class stackType: public stackADT<Type>{
public:
	const stackType<Type>& operator=(const stackType<Type>&);

	void intializeStack();

	bool isEmptyStack() const;

	bool isFullStack() const;

	void push(const Type& newItem);

	Type top() const;

	void pop();

	stackType(int stackSize = 100);

	stackType(const stackType<Type>& otherStack);
	~stackType();

private:
	int maxStackSize;//variable to store the maximum stack size
	int stackTop;//variable to point to the top of the stack
	Type *list; //pointer to the array that holds the
	            //stack elements
	void copyStack(const stackType<Type>& otherStack);
};

template <class Type>
void stackType<Type>::intializeStack(){
	stackTop = 0;
}//end intializeStack

template <class Type>
bool stackType<Type>::isEmptyStack() const{
	return (stackTop == 0);
}//end isEmptyStack

template <class type>
void stackType<Type>::push(const Type& newItem){
	if (!isFullStack()){
		list[stackTop] = newItem; //add new item to the top of the stack
		stackTop++;//increment the stackTop
	} 
	else
		cout << "Cannot add to a full stack." << endl;
}//end push

template <class Type>
Type stackType<Type>::top() const{
	assert(stackTop!= 0);
	return list[stackTop - 1];
}//end top

template <class Type>
void stackType<Type>::pop(){
	if (!isEmptyStack())
		stackTop--;
	else
		cout << "Cannot remove from an empty stack." << endl;
}//end pop

template <class Type>
stackType<Type>::stackType(int stackSize){
	if (stackSize <= 0){
		cout << "Size of the array to hold the stack must "
			 << "be positive." << endl;
		cout << "Creating an array of size 100." << endl;

		maxStackSize = 100;
	} 
	else
		maxStackSize = stackSize;

	stackTop = 0;
	list = new Type[maxStackSize];
	}//end constructor

template <class Type>
	stackType<Type>::~stackType(){//destructor
		delete[] list;
}//end destructor

template <class Type>
void stackType<Type>::copyStack(const stackType<Type>& otherStack){
	delete[] list;
	maxStackSize = otherStack.maxStackSize;
	stackTop = otherStack.stackTop;

	list = new Type[maxStackSize];

	//copy otherStack into this stack
	for (int j = 0; j < stackTop; j++)
		list[j] = otherStack.list[j];
} //end copyStack

template <class Type>
stackType<Type>::stackType(const stackType<Type>& otherStack){
	list = NULL;
	copyStack(otherStack);
}//end copy constructor

template <class Type>
const stackType<Type>& stackType<Type>::operator=(const stackType<Type>& otherStack){
	if (this != &otherStack)//avoid self-copy
		copyStack(otherStack);
	return *this;
}//end operator=

#endif