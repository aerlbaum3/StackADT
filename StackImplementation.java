package LinkedListADTStack;

import java.util.EmptyStackException;

public class StackImplementation<T> {
	private Node<T> head;
	int curSize;

	//constructor of outer class
	public StackImplementation() {
		head = null;
		curSize = 0 ;
	}
	//make the node class an inner private class so its unaccesible to the outer classes 
	class Node<T> {
		//fields
		T element;
		Node<T> next;
		//constructor
		Node(T value){
			element = value;
			next = null;
		}
	}
	//push a new node onto the front of the stack
	//by making the head point to the new element
	public void push(T element) {
		Node<T> addNode = new Node(element);
		addNode.next = head;
		head = addNode;
		curSize++;
		
	}
	public T pop(){
		if(head == null) {
			throw new EmptyStackException();
		}
		//shows the value of the node were removing
		T element = head.element;
		head = head.next;
		curSize--;
		return element;
		
	}
	//peek shows us what the head is pointing to
	
	public T peek() {
		if(head == null) {
			throw new EmptyStackException();
		}
		return head.element;
		
	}
	public int size() {
		return curSize;
		
	}
	
}
