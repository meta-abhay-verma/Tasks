package com.meta.tasks.dsaexam;

import java.util.LinkedList;

/**
 * Link list which can be reversed.
 * @author Abhay
 * @param <Type> Type of the element to be stored
 */
public class ReverseLinkList <Type>{

	public Node<Type> head;
	public Node<Type> tail;
	
	/**
	 * Adds an element to the end of the list
	 * @param element  Value to be inserted in the node
	 */
	public void add(Type element){
		if (head == null){
			head = new Node(element);
			tail = head;
		} else{
			tail.setNext(new Node(element));
			tail = tail.getNext();
		}
	}
	
	/**
	 * Removes an element from the top of the list.
	 * @return  Element removed
	 */
	public Type remove(){
		if (head == null){
			return null;
		} else{
			Type removed = head.getValue();
			head = head.getNext();
			return removed;
		}
	}
	
	/**
	 * Reverses the link list
	 */
	public void reverse() {
		if (head == null)
			return;
		Type removed = remove();
		reverse();
		add(removed);
	}
	
	/**
	 * Prints the list
	 */
	public void printAll(){
		Node curr = head;
		while(curr != null){
			System.out.println(curr.getValue());
			curr = curr.getNext();
		}
	}
	
	public static void main(String[] args) {
		ReverseLinkList<Integer> reverseLinkList = new ReverseLinkList<>();
		reverseLinkList.add(1);
		reverseLinkList.add(2);
		reverseLinkList.add(3);
		reverseLinkList.add(4);
		reverseLinkList.add(5);
		System.out.println("ORIGINAL");
		reverseLinkList.printAll();
		reverseLinkList.reverse();
		System.out.println("REVERSE");
		reverseLinkList.printAll();
	}
}
