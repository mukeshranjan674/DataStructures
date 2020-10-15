package com.capgemini.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LinkedListTest {

	/**
	 * UC2
	 */
	@Test
	public void given3NumbersWhenAddedShouldAddToTheTop() {
		Node<Integer> firstNode = new Node<Integer>(70);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(56);
		LinkedList linkedList = new LinkedList();
		linkedList.add(firstNode);
		linkedList.add(secondNode);
		linkedList.add(thirdNode);
		linkedList.printNodes();
		boolean result = linkedList.head.equals(thirdNode) && linkedList.head.getNext().equals(secondNode)
				&& linkedList.tail.equals(firstNode);
		assertTrue(result);
	}

	/**
	 * UC3
	 */
	@Test
	public void given3NumbersWhenAppendedShouldReturnLinkedList() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		LinkedList linkedList = new LinkedList();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		linkedList.printNodes();
		boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode)
				&& linkedList.tail.equals(thirdNode);
		assertTrue(result);
	}

	/**
	 * UC4
	 */
	@Test
	public void givenNumberWhenInsertedShouldReturnLinkedList() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(70);
		Node<Integer> thirdNode = new Node<Integer>(30);
		LinkedList linkedList = new LinkedList();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		System.out.println("Before Inserting");
		linkedList.printNodes();
		linkedList.insert(firstNode, thirdNode);
		System.out.println("After Inserting");
		linkedList.printNodes();
		boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(thirdNode)
				&& linkedList.tail.equals(secondNode);
		assertTrue(result);
	}

	/**
	 * UC5
	 */
	@Test
	public void givenFirstNumberWhenDeletedShouldReturnLinkedList() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		LinkedList linkedList = new LinkedList();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		System.out.println("Before Deleting First Element");
		linkedList.printNodes();
		linkedList.pop();
		System.out.println("After Deleting First Element");
		linkedList.printNodes();
		boolean result = linkedList.head.equals(secondNode) && linkedList.head.getNext().equals(thirdNode)
				&& linkedList.tail.equals(thirdNode);
		assertTrue(result);
	}

	/**
	 * UC6
	 */
	@Test
	public void givenLastNumberWhenDeletedShouldReturnLinkedList() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		LinkedList linkedList = new LinkedList();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		System.out.println("Before Deleting Last Element");
		linkedList.printNodes();
		linkedList.popLast();
		System.out.println("After Deleting Last Element");
		linkedList.printNodes();
		boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode)
				&& linkedList.tail.equals(secondNode);
		assertTrue(result);
	}

	/**
	 * UC7
	 */
	@Test
	public void givenLastNumberWhenSearchedShouldGetReturned() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		linkedList.printNodes();
		INode result = linkedList.find(30);
		assertNotNull(result);
	}

	/**
	 * UC8
	 */
	@Test
	public void givenNumberWhenInsertShouldReturnLinkedList() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		LinkedList linkedList = new LinkedList();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		System.out.println("Before Inserting");
		linkedList.printNodes();
		Node<Integer> newNode = new Node<Integer>(40);
		boolean result = linkedList.insert(secondNode, newNode);
		System.out.println("After Inserting");
		linkedList.printNodes();
		assertTrue(result);
	}

	/**
	 * UC9
	 */
	@Test
	public void givenNumberWhenDeletedShouldReturnLinkedList() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(40);
		Node<Integer> fourthNode = new Node<Integer>(70);
		LinkedList linkedList = new LinkedList();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		linkedList.append(fourthNode);
		System.out.println("Before Deleting the Element");
		linkedList.printNodes();
		boolean result = linkedList.delete(thirdNode);
		System.out.println("After Deleting the Element");
		linkedList.printNodes();
		System.out.println("Size of the Linked list : " + linkedList.size());
		boolean results = secondNode.getNext().equals(fourthNode);
		assertEquals(results, result);
	}

	/**
	 * UC10
	 */
	@Test
	public void givenNumbersWhenAddedShouldReturnSortedLinkedList() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(40);
		Node<Integer> fourthNode = new Node<Integer>(70);
		LinkedList linkedList = new SortedLinkedList();
		linkedList.add(firstNode);
		linkedList.add(secondNode);
		linkedList.add(thirdNode);
		linkedList.add(fourthNode);
		linkedList.printNodes();
		assertTrue(linkedList.head.equals(secondNode) && linkedList.tail.equals(fourthNode));
	}

}
