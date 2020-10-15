package com.capgemini.hashmap;

import com.capgemini.linkedlist.LinkedList;

public class HashMap<K, V> {

	private LinkedList<K> linkedList;

	public HashMap() {
		linkedList = new LinkedList<K>();
	}

	public V get(K key) {
		MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.find(key);
		return mapNode == null ? null : mapNode.getValue();
	}

	public void add(K key, V value) {
		MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.find(key);
		if (mapNode == null) {
			MapNode<K, V> newNode = new MapNode<K, V>(key, value);
			linkedList.append(newNode);
		} else {
			mapNode.setValue(value);
		}
	}

	@Override
	public String toString() {
		return "HashMap [linkedList=" + linkedList + "]";
	}
}
