package com.capgemini.binarytree;

public class BinaryTree<K extends Comparable<K>> {

	private TreeNode<K> root;

	/**UC1
	 * @param key
	 */
	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	private TreeNode<K> addRecursively(TreeNode<K> current, K key) {
		if (current == null)
			return new TreeNode<>(key);
		int compareResult = key.compareTo(current.getKey());
		if (compareResult == 0)
			return current;
		if (compareResult < 0)
			current.setLeft(addRecursively(current.getLeft(), key));
		else
			current.setRight(addRecursively(current.getRight(), key));
		return current;
	}

	public int getSize() {
		return this.getSizeRecursively(root);
	}

	private int getSizeRecursively(TreeNode<K> current) {
		return current == null ? 0
				: 1 + this.getSizeRecursively(current.getLeft()) + this.getSizeRecursively(current.getRight());
	}

}