package com.capgemini.linkedlist;

public interface INode<K> {

	K getKey();

	void setKey(K key);

	void setNext(INode<K> next);

	INode<K> getNext();
}
