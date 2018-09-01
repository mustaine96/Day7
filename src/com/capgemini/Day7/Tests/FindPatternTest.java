package com.capgemini.Day7.Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Day7.FindPattern;

class FindPatternTest {

	@Test
	void testPatternSearch() throws FileNotFoundException, IOException {
		File file = new File(
				"C:\\filesfortest\\Laptop.java");

		assertEquals("Line number 3 : import java.util.Objects;\n", FindPattern.findString(file,"import"));
	}

}
