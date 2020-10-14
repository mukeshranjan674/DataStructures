package com.capgemini.linkedlist;

public class LinkedList<K> {

	public INode<K> head;
	public INode<K> tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	/**
	 * UC2
	 * 
	 * @param newNode
	 */
	public void add(INode newNode) {
		if (tail == null)
			this.tail = newNode;
		if (head == null)
			this.head = newNode;
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	/**
	 * UC3
	 * 
	 * @param newNode
	 */
	public void append(INode newNode) {
		if (head == null)
			this.head = newNode;
		if (tail == null)
			this.tail = newNode;
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	/**
	 * UC4
	 * 
	 * @param newNode
	 */
	public void insert(INode newNode) {
		INode tempNode = this.head.getNext();
		this.head.setNext(newNode);
		newNode.setNext(tempNode);
	}

	/**
	 * UC5
	 */
	public void pop() {
		this.head = this.head.getNext();
	}

	/**
	 * UC6
	 */
	public void popLast() {
		INode tempNode = this.head;
		while (tempNode.getNext().getNext() != null) {
			tempNode = tempNode.getNext();
		}
		tempNode.setNext(null);
		this.tail = tempNode;
	}

	/**
	 * UC7
	 * 
	 * @param node
	 * @return
	 */
	public boolean find(K node) {
		INode tempNode = this.head;
		while (tempNode.getNext() != null) {
			if (tempNode.getKey().equals(node))
				return true;
			tempNode = tempNode.getNext();
		}
		return false;
	}

	public void printNodes() {
		StringBuffer nodes = new StringBuffer();
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			nodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				nodes.append("->");
			tempNode = tempNode.getNext();
		}
		nodes.append(tempNode.getKey());
		System.out.println(nodes);
	}
}
