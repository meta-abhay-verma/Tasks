package com.meta.tasks.dsaexam;

public class Node <Type>{

	private Type value;
	private Node<Type> next;
	/**
	 * @param value
	 */
	public Node(Type value) {
		this.value = value;
	}
	/** @return the value */
	public Type getValue() {
		return value;
	}
	/** @param value the value to set */
	public void setValue(Type value) {
		this.value = value;
	}
	/** @return the next */
	public Node<Type> getNext() {
		return next;
	}
	/** @param next the next to set */
	public void setNext(Node<Type> next) {
		this.next = next;
	}
}
