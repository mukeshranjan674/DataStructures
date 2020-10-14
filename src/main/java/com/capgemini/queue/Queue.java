package com.capgemini.queue;

import com.capgemini.linkedlist.INode;
import com.capgemini.linkedlist.LinkedList;

public class Queue {

	private LinkedList linkedList;

	public Queue() {
		linkedList = new LinkedList();
	}

	/**
	 * UC1
	 * 
	 * @param newNode
	 */
	public void enqueue(INode newNode) {
		linkedList.append(newNode);
	}

	public void printQueue() {
		linkedList.printNodes();
	}

	public INode peek() {
		return linkedList.head;
	}

	/**
	 * UC2
	 * 
	 * @return
	 */
	public INode Dequeue() {
		return linkedList.pop();
	}
}
