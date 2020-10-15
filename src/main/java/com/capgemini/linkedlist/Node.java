package com.capgemini.linkedlist;

/**
 * @author LENOVO UC1
 * @param <K>
 */
public class Node<K extends Comparable<K>> implements INode<K> {

	private K key;
	private INode<K> next;

	public Node(K key) {
		this.key = key;
		this.next = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public INode<K> getNext() {
		return next;
	}

	@Override
	public void setNext(INode<K> next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "Node [key=" + key + ", next=" + next + "]";
	}

}