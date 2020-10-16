package com.capgemini.binarytree;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryTreeTest {

	/**
	 * UC1
	 */
	@Test
	public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeTree() {
		BinaryTree<Integer> binaryTree = new BinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		int size = binaryTree.getSize();
		assertEquals(3, size);
	}
	
	/**
	 * UC2
	 */
	@Test
	public void givenNumbersWhenAddedToBinaryTreeShouldReturnSizeTree() {
		BinaryTree<Integer> binaryTree = new BinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(40);
		binaryTree.add(11);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(65);
		binaryTree.add(63);
		binaryTree.add(67);
		int size = binaryTree.getSize();
		assertEquals(13, size);
	}

}