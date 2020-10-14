package com.capgemini.stack;

import com.capgemini.linkedlist.INode;
import com.capgemini.linkedlist.LinkedList;

public class Stack {

	private LinkedList linkedList;

	public Stack() {
		linkedList = new LinkedList();
	}

	/**
	 * UC1
	 * 
	 * @param firstNode
	 */
	public void push(INode firstNode) {
		linkedList.add(firstNode);
	}

	/**
	 * UC2
	 * 
	 * @return
	 */
	public INode pop() {
		return linkedList.pop();
	}

	public INode peek() {
		return linkedList.head;
	}

	public void printStack() {
		linkedList.printNodes();
	}
}
