package stackDataStructure.dale;

public class ArrayStack<T> implements BoundedStackInterface<T> {
	protected final int DEFCAP = 100;
	protected T[] stack;
	protected int topIndex = -1;
	
	public ArrayStack() {
		stack = (T[]) new Object[DEFCAP];
	}
	
	public ArrayStack(int maxSize) {
		stack = (T[]) new Object[maxSize];
	}

	@Override
	public void pop() throws StackUnderflowException {
		if ( !isEmpty()) {
			stack[topIndex] = null;
			topIndex--;
	}else {
		throw new StackUnderflowException("Pop attempted on an empty stack.");
	 }
	}

	@Override
	public T top() {
		// TODO Auto-generated method stub
		T topOfStack = null;
		if (!isEmpty())
			topOfStack = stack[topIndex];
		else
			throw new StackUnderflowException("Top attempted on an empty stack.");
		return topOfStack;
	}

	@Override
	public boolean isEmpty() {
		if (topIndex == -1)
			return true;
		else
			return false;
	}

	@Override
	public void push(T element) throws StackOverflowException {
		if (!isFull()) {
			topIndex++;
			stack[topIndex] = element;
		} else {
			throw new StackOverflowException("Push attempted on a full stack.");
		}
	}

	@Override
	public boolean isFull() {
		if (topIndex == (stack.length - 1))
			return true;
		else
			return false;
	}

}
