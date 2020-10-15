package com.capgemini.linkedlist;

public class SortedLinkedList<K> extends LinkedList<K> {

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
			if (((Comparable<K>) tempNode.getKey()).compareTo((K) newNode.getKey()) >= 0)
				super.add(newNode);
			else {
				while (tempNode.getNext() != null && ((Comparable<K>) tempNode.getNext().getKey()).compareTo((K) newNode.getKey()) < 0) {
					tempNode = tempNode.getNext();
				}
				super.insert(tempNode, newNode);
			}
		}
	}
}
