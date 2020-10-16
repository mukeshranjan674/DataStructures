package com.capgemini.hashmap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedHashMapTest {

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
}
