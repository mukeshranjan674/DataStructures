package com.capgemini.queue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.linkedlist.INode;
import com.capgemini.linkedlist.Node;

public class QueueTest {

	/**
	 * UC1
	 */
	@Test
	public void whenGiven3NumbersShouldReturnAQueue() {
		Node<Integer> firstNode = new Node<Integer>(70);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(56);
		Queue queue = new Queue();
		queue.enqueue(firstNode);
		queue.enqueue(secondNode);
		queue.enqueue(thirdNode);
		INode result = queue.peek();
		queue.printQueue();
		assertEquals(firstNode, result);
	}

	/**
	 * UC2
	 */
	@Test
	public void whenDequeuedShouldReturnTheFirstElement() {
		Node<Integer> firstNode = new Node<Integer>(70);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(56);
		Queue queue = new Queue();
		queue.enqueue(firstNode);
		queue.enqueue(secondNode);
		queue.enqueue(thirdNode);
		INode result = queue.Dequeue();
		queue.printQueue();
		assertEquals(firstNode, result);
	}
}
