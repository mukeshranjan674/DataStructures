package com.capgemini.stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.linkedlist.INode;
import com.capgemini.linkedlist.Node;

public class StackTest {

	@Test
	public void whenGiven3NumbersShouldReturnAStack() {
		Node<Integer> firstNode = new Node<Integer>(70);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(56);
		Stack stack = new Stack();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		INode result = stack.peek();
		stack.printStack();
		assertEquals(thirdNode, result);
	}
}
