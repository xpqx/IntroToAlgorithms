package queueDataStructure.arrayQueue;

public class ArrayQueue<E> implements Queue<E> {
	private E[] elements;
	private int front;
	private int back;
	private static final int INITIAL_CAPACITY = 4;
	
	public ArrayQueue() {
		elements = (E[]) new Object[INITIAL_CAPACITY];
	}
	
	public ArrayQueue(int capacity) {
		elements = (E[]) new Object[capacity];
	}

	@Override
	public void add(E element) {
		if (size() == elements.length - 1) {
			resize();
		}
		elements[back] = element;
		if (back < elements.length - 1) {
			++back;
		} else {
			back = 0; //wrap
		}
	}
		// TODO Auto-generated method stub

	

	@Override
	public E element() {
		if (size()==0) {
			throw new java.util.NoSuchElementException();
		}
		// TODO Auto-generated method stub
		return elements[front];
	}
	

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (size() == 0);
	}

	@Override
	public E remove() {
		if (size() == 0) {
			throw new java.util.NoSuchElementException();
		}
		E element = elements[front];
		elements[front]= null;
		++front;
		if (front == back) {
			front = back = 0;
		}
		if (front == elements.length) {
			front = 0;
		}
		return element;
	}

	@Override
	public int size() {
		if (front <= back) {
			return back - front;
		} else {
			return back - front + elements.length;
		}
		// TODO Auto-generated method stub
	
	}
	
	private void resize() {
		int size = size();
		int len = elements.length;
		assert size == len;
		Object[] a = new Object[2*len];
		System.arraycopy(elements, front, a, 0, len - front);
		System.arraycopy(elements, 0, a, len - front, back);
		elements = (E[])a;
		front = 0;
		back = size;
	}

}
