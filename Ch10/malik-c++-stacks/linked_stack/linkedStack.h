//Definition of the node
template <class Type>
struct nodeType
{
	Type info;
	nodeType<Type> *link;
};

template <class Type>
class linkedStackType: public stackADT<Type>
{
public:
	const linkedStackType<Type>& operator = (const linkedStackType<Type>&);
	//overload the assignment operator
	bool isEmptyStack() const;
	//function to determine whether stack is empty
	//postcondition: returns true if the stack is empty;otherwise returns false

	bool isFullStack() const;
	//function to determine whether the stack is full
	//postcondition returns false

	void initializeStack();
	//function to initialize the stack to an empty state
	//postcondition stack elements are removed, stackTop = NULL

	void push(const Type& newItem);
	//function to add newItem to the stack
	//precondition the stack exist and is not full
	//postcondition the stack is changed and newItem is added to the top of the stack
	Type top() const;
	//function to return the top element of the stack
	//precondition the stack exist and is not empty
	//postcondition if the stack is empty, the program terminates, otherwise
	//the top element of the stack is returned

	void pop();
	//function to remove the top element of the stack
	//precondition, the stack exist and is not empty
	//postcondition, the stack is changed and the top element is removed from the stack

	linkedStackType();
	//default constructor
	//postcondition: stackTop = NULL

	linkedStackType(const linkedStackType<Type>& otherStack);
	//copy constructor
	~linkedStackType();
	//destructor
	//postcondition, all the elements of the stack are removed from the stack

private:
	nodeType<Type> *stackTop;//pointer to the stack

	void copyStack(const linkedStackType<Type>& otherStack);
	//function to make a copy of otherStack
	//postcondition: a copy of otherStack is created and assigned to this stack

};