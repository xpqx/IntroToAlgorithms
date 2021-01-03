//the following abstract class stackADT defines these operations as an ADT

template <class Type>
class stackADT
{
public:
	virtual void initializeStack() = 0;
	//method to initialize the stack to an empty state
	//postcondition: stack is empty

	virtual bool isEmptyStack() const = 0;
	//function to determine whether the stack is empty
	//postcondition: returns true if the stack is empty, otherwise, returns false

	virtual bool isFullStack() const = 0;
	//function to determine whether the stack is full
	//postcondition: returns true if the stack is full, otherwise, returns false

	virtual void push(const Type& newItem) = 0;
	//function to add newItem to the stack
	//precondition: stack exists and is not full
	//postcondition stack is changed and newItem is added to the top of the stack

	virtual Type top() const = 0;
	//function to return the top element of the stack
	//precondition, the stack exists and is not empty
	//postcondition, if the stack is empty, theprogram terminates, otherwise, the top element
	//of the stack is return

	virtual void pop() = 0;
	//function to remove the top element of the stack
	//precondition, the stack exists and is not empty
	//postcondition, the stack is changed and the top element
	//is removed from the stack
};