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
	 * UC4 UC8
	 * 
	 * @param newNode
	 */
	public boolean insert(INode myNode, INode newNode) {
		INode tempNode = this.head;
		while (tempNode.getNext() != null) {
			if (tempNode.getKey().equals(myNode.getKey())) {
				tempNode = myNode.getNext();
				myNode.setNext(newNode);
				newNode.setNext(tempNode);
				return true;
			}
			tempNode = tempNode.getNext();
		}
		append(newNode);
		return true;
	}

	/**
	 * UC5
	 */
	public INode pop() {
		INode tempNode = this.head;
		this.head = this.head.getNext();
		return tempNode;
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
	public INode find(K key) {
		INode tempNode = this.head;
		if (tempNode == null)
			return null;
		while (tempNode.getKey() != null) {
			if (tempNode.getKey().equals(key))
				return tempNode;
			if (tempNode.getNext() == null)
				break;
			tempNode = tempNode.getNext();
		}
		return null;
	}

	/**
	 * UC9
	 * 
	 * @param node
	 * @return
	 */
	public boolean delete(INode node) {
		INode tempNode1 = this.head;
		INode tempNode2 = this.head.getNext();
		while (tempNode2.getNext() != null) {
			if (tempNode2.getKey().equals(node.getKey())) {
				tempNode1.setNext(tempNode2.getNext());
				return true;
			}
			tempNode2 = tempNode2.getNext();
			tempNode1 = tempNode1.getNext();
		}
		return false;
	}

	public boolean delete(INode node, LinkedList<K> linkedList) {
		INode tempNode1 = linkedList.head;
		if (tempNode1 == null)
			return false;
		if (tempNode1.getKey().equals(node.getKey())) {
			if (tempNode1.getNext() == null) {
				tempNode1 = null;
			}

			else {
				tempNode1 = tempNode1.getNext();
				head = tempNode1;
			}
			return true;
		}
		INode tempNode2 = linkedList.head.getNext();
		while (tempNode2.getKey() != null) {
			if (tempNode2.getKey().equals(node.getKey())) {
				tempNode1.setNext(tempNode2.getNext());
				return true;
			}
			tempNode2 = tempNode2.getNext();
			tempNode1 = tempNode1.getNext();
		}
		return false;
	}

	public int size() {
		INode tempNode = this.head;
		int count = 0;
		while (tempNode.getKey() != null) {
			count++;
			if (tempNode.getNext() == null)
				break;
			tempNode = tempNode.getNext();
		}
		return count;
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

	@Override
	public String toString() {
		return "LinkedList [head=" + head + "]";
	}
}
