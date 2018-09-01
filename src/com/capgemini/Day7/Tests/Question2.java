package com.capgemini.Day7.Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.Day7.LineCounter;

class Question2 {

	@Test
	void testLineCounter() throws IOException {
		BufferedReader reader;
		assertEquals(40,LineCounter.counter("C:\\filesfortest\\WorkingTV.java"));
		assertEquals(82,LineCounter.counter("C:\\filesfortest\\Laptop.java"));
		

	}

}
