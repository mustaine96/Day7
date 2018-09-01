package com.capgemini.Day7.Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.Day7.WordCount;

class WordCountTest {

	@Test
	void testWordCount() {
		File file = new File(
				"C:\\filesfortest\\Laptop.java");

		assertEquals(190, WordCount.countWords(file));
	}


}
