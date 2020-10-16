package com.capgemini.hashmap;

import com.capgemini.linkedlist.INode;

/**UC1
 * @author LENOVO
 *
 * @param <K>
 * @param <V>
 */
public class MapNode<K, V> implements INode<K> {

	private K key;
	private V value;
	private MapNode next;

	public MapNode(K key, V value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public V getValue() {
		return this.value;
	}

	@Override
	public K getKey() {
		return this.key;
	}

	@Override
	public void setNext(INode<K> next) {
		this.next = (MapNode<K, V>) next;
	}

	@Override
	public INode getNext() {
		return this.next;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public String toString() {
		StringBuilder mapNodeString = new StringBuilder();
		mapNodeString.append("MapNode{" + "K=").append(key).append("V=").append(value).append('}');
		if (next != null)
			mapNodeString.append("->").append(next);
		return mapNodeString.toString();
	}
}
