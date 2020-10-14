package com.capgemini.linkedlist;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void given3NumbersWhenAddedShouldAddToTheTop() {
		Node<Integer> firstNode = new Node<Integer>(70);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(56);
		LinkedList linkedList = new LinkedList();
		linkedList.add(firstNode);
		linkedList.add(secondNode);
		linkedList.add(thirdNode);
		boolean result = linkedList.head.equals(thirdNode) && linkedList.head.getNext().equals(secondNode)
				&& linkedList.tail.equals(firstNode);
		linkedList.printNodes();
		assertTrue(result);
	}
	
	@Test
	public void given3NumbersWhenAppendedShouldReturnLinkedList() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		LinkedList linkedList = new LinkedList();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode)
				&& linkedList.tail.equals(thirdNode);
		linkedList.printNodes();
		assertTrue(result);
	}
	
	@Test
	public void givenNumberWhenInsertedShouldReturnLinkedList() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(70);
		Node<Integer> thirdNode = new Node<Integer>(30);
		LinkedList linkedList = new LinkedList();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.insert(thirdNode);
		boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(thirdNode)
				&& linkedList.tail.equals(secondNode);
		linkedList.printNodes();
		assertTrue(result);
	}

}
