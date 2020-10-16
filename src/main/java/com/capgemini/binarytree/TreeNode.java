package com.capgemini.binarytree;

public class TreeNode<K> {

	private K key;
	private TreeNode<K> left;
	private TreeNode<K> right;

	public K getKey() {
		return key;
	}

	public TreeNode(K key) {
		super();
		this.key = key;
		this.left = null;
		this.right = null;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public TreeNode<K> getLeft() {
		return left;
	}

	public void setLeft(TreeNode<K> left) {
		this.left = left;
	}

	public TreeNode<K> getRight() {
		return right;
	}

	public void setRight(TreeNode<K> right) {
		this.right = right;
	}
}