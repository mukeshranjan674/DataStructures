package com.capgemini.hashmap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LinkedHashMapTest {

	/**
	 * UC2
	 */
	@Test
	public void givenASentenceWhenWordsAreAddedToListShouldReturnParanoidFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid but "
				+ "because they kepp putting themselves deliberately into " + " paranoid avoidable situations";
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = linkedHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			linkedHashMap.add(word, value);
		}
		System.out.println(linkedHashMap);
		Integer frequency = linkedHashMap.get("paranoid");
		assertEquals(new Integer(3), frequency);
	}

	/**
	 * UC3
	 */
	@Test
	public void givenAWordWhenDeletedShouldReturnTheSame() {
		String sentence = "Paranoids are not paranoid because they are paranoid but "
				+ "because they kepp putting themselves deliberately into " + " paranoid avoidable situations";
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = linkedHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			linkedHashMap.add(word, value);
		}
		System.out.println("Before Deletion");
		System.out.println(linkedHashMap);
		boolean result = linkedHashMap.remove("avoidable");
		System.out.println("After Deletion");
		System.out.println(linkedHashMap);
		assertTrue(result);
	}
}
