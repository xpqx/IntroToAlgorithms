package queueDataStructure.linkedQueue;

public class Node<E> {
	E element;
	Node<E> prev;
	Node<E> next;
	
	Node(){
		this.prev = this.next = this;
	}
	
	Node(E element, Node<E> prev, Node<E> next){
		this.element = element;
		this.prev = prev;
		this.next = next;
	}

}
