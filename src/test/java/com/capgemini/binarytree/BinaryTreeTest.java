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

}