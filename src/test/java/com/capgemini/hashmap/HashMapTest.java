package com.capgemini.hashmap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HashMapTest {

	@Test
	public void whenGivenASentenceShouldReturnFrequencyOfANumber() {
		String sentence = "To be or not to be";
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = hashmap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			hashmap.add(word, value);
		}
		Integer frequency = hashmap.get("be");
		System.out.println(hashmap);
		assertEquals(new Integer(2), frequency);
	}

}
