package com.capgemini.stack;

import com.capgemini.linkedlist.INode;
import com.capgemini.linkedlist.LinkedList;

public class Stack {

	private LinkedList linkedList;
	
	public Stack() {
		linkedList = new LinkedList();
	}

	public void push(INode firstNode) {
		linkedList.add(firstNode);
	}
	public INode peek() {
		return linkedList.head;
	}
	public void printStack() {
		linkedList.printNodes();
	}
}
