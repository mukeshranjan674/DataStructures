package com.capgemini.queue;

import com.capgemini.linkedlist.INode;
import com.capgemini.linkedlist.LinkedList;

public class Queue {

	private LinkedList linkedList;

	public Queue() {
		linkedList = new LinkedList();
	}

	public void enqueue(INode newNode) {
		linkedList.append(newNode);
	}

	public void printQueue() {
		linkedList.printNodes();
	}

	public INode peek() {
		return linkedList.head;
	}
}
