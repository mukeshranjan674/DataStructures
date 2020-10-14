package com.capgemini.linkedlist;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestLinkedList {

	@Test
	public void given3NumbersShouldAddToLinkedList() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		boolean result = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
		assertTrue(result);
	}

}