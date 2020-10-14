package com.capgemini.linkedlist;

public class SortedLinkedList<K extends Comparable<K>> extends LinkedList<K> {

	public SortedLinkedList() {
		super();
	}

	public void add(INode newNode) {
		if (super.tail == null)
			super.tail = newNode;
		if (super.head == null)
			super.head = newNode;
		else {
			INode tempNode = super.head;
			if (tempNode.getKey().compareTo(newNode.getKey()) >= 0)
				super.add(newNode);
			else {
				while (tempNode.getNext() != null && tempNode.getNext().getKey().compareTo(newNode.getKey()) < 0) {
					tempNode = tempNode.getNext();
				}
				super.insert(tempNode, newNode);
			}
		}
	}
}
