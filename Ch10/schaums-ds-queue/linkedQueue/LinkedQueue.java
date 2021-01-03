package queueDataStructure.linkedQueue;

public class LinkedQueue<E> implements Queue<E> {
	private Node<E> head = new Node<E>();//dummy node
	private int size;

	@Override
	public void add(E element) {
		head.prev = head.prev.next = new Node<E>(element, head.prev, head);
		++size;
	}

	@Override
	public E element() {
		if (size == 0) {
			throw new java.util.EmptyStackException();
		}
		return head.next.element;//front of queue, next <--> prev
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}

	@Override
	public E remove() {
		if (size == 0) {
			throw new java.util.EmptyStackException();
		}
		E element = head.next.element;
		head.next = head.next.next;
		head.next.prev = head;
		--size;
		return element;
	}
	
	public int size() {
		return size;
	}

}
