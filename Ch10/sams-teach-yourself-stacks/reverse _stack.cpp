//reverse.cpp
//stack used to reverse any word 
#include <iostream>
#include <vector>
#include <string>

using namespace std;

class StackX{
private:
	int maxSize;
	vector<char> stackVect;//vector holds stack
	int top;
public:
	StackX(int max): maxSize(max), top(-1){//constructor
		stackVect.resize(maxSize);//size the vector
}
void push(char j){
	stackVect[++top] = j;
}
char pop(){
	return stackVect[top--];
}
char peek(){
	return stackVect[top];
}
bool isEmpty(){
	return (top == -1);
}
};
class Reverser{
private:
	string input;//input string
	string output;//output string
public:
	Reverser(string in): input(in){//constructor
}
string doRev(){
	int stackSize = input.length();//get max stack size
	StackX theStack(stackSize);//make stack

	for (int j = 0; j<input.length(); j++){
		char ch = input[j];
		theStack.push(ch);
	}
	output = "";
	while (!theStack.isEmpty()){
		char ch = theStack.pop();//pop a char
		output = output + ch;
	}
	return output;
} //end doRev()
};//end class
int main(){
	string input, output;
	while(true){
		cout << "Enter a word: " << "Enter a single letter to quit:";
		cin >> input;
		if (input.length() < 2)
			break;

		Reverser theReverser(input);
		output = theReverser.doRev();//use it
		cout << "Reversed: " << output << endl;
	}//end while
	return 0;
}//end main()
