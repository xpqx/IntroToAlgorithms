package stackDataStructure.dale;

public interface StackInterface<T> {
	
	void pop() throws StackUnderflowException;
	//throws StackUnderFlowException if this stack is empty
	//otherwise, removes top element from this stack
	
	T top() throws StackUnderflowException;
	
	boolean isEmpty();
}
