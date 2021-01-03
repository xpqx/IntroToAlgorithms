//Stack.cpp
//demonstrate stacks
#include <iostream>
#include <vector>
using namespace std;

class StackX{
private:
	int maxSize; //size of stack vector
	vector<double> stackVect;//stack vector
	int top; //top of stack
public:
	StackX(int s): maxSize(s), top(-1){
		stackVect.reserve(maxSize);
	}
	void push(double j){
		stackVect[++top] = j;
	}
	double pop(){
		return stackVect[top--];
	}
	double peek(){
		return stackVect[top];
	}
	bool isEmpty(){
		return (top == -1);
	}
	bool isFull(){
		return (top == maxSize-1);
	}
};
int main(){
	StackX theStack(10);
	theStack.push(20);
	theStack.push(40);
	theStack.push(60);
	theStack.push(80);

	while( !theStack.isEmpty() ){//begin while
		double value = theStack.pop();
		cout << value << " ";
	}//end while
	cout << endl;
	return 0;
}//end main