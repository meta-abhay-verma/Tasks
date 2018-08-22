package com.meta.tasks.dsaexam;

import java.util.LinkedList;

public class ReverseLinkList <Type>{

	public Node<Type> head;
	public Node<Type> tail;
	
	public ReverseLinkList(){
		
	}
	
	public void add(Type element){
		if (head == null){
			head = new Node(element);
			tail = head;
		} else{
			tail.setNext(new Node(element));
			tail = tail.getNext();
		}
	}
	
	public Type remove(){
		if (head == null){
			return null;
		} else{
			Type removed = head.getValue();
			head = head.getNext();
			return removed;
		}
	}
	
	public void reverse() {
		if (head == null)
			return;
		Type removed = remove();
		reverse();
		add(removed);
	}
	
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
		reverseLinkList.printAll();
		reverseLinkList.reverse();
		reverseLinkList.printAll();
	}
}
