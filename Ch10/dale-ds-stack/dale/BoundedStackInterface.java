package stackDataStructure.dale;

public interface BoundedStackInterface<T> extends StackInterface<T> {
	void push(T element) throws StackOverflowException;
	
	boolean isFull();
	
}
