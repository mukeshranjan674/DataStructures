package com.capgemini.hashmap;

import java.util.ArrayList;

import com.capgemini.linkedlist.LinkedList;

public class LinkedHashMap<K, V> {
	private final int numBuckets;
	ArrayList<LinkedList<K>> myBucketArray;

	public LinkedHashMap() {
		this.numBuckets = 10;
		this.myBucketArray = new ArrayList<LinkedList<K>>(numBuckets);
		for (int i = 0; i < numBuckets; i++)
			this.myBucketArray.add(null);
	}

	private int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % numBuckets;
		System.out.println("Key:L " + key + " hashcode: " + hashCode + " index: " + index);
		return index;
	}

	public V get(K key) {
		int index = this.getBucketIndex(key);
		LinkedList<K> linkedList = (LinkedList<K>) this.myBucketArray.get(index);
		if (linkedList == null)
			return null;
		MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.find(key);
		return (mapNode == null) ? null : mapNode.getValue();
	}

	public void add(K key, V value) {
		int index = this.getBucketIndex(key);
		LinkedList<K> linkedList = this.myBucketArray.get(index);
		if (linkedList == null) {
			linkedList = new LinkedList<>();
			this.myBucketArray.set(index, linkedList);
		}
		MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.find(key);
		if (mapNode == null) {
			mapNode = new MapNode<K, V>(key, value);
			linkedList.append(mapNode);
		} else {
			mapNode.setValue(value);
		}
	}

	@Override
	public String toString() {
		return "LinkedHashMap [numBuckets=" + numBuckets + ", myBucketArray=" + myBucketArray + "]";
	}

}
