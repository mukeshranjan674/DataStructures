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

}
