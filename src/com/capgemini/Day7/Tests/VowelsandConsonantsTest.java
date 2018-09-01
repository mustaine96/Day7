package com.capgemini.Day7.Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.Day7.VowelsandConsonants;

class VowelsandConsonantsTest {

	@Test
	void testVowelsAndConsonants() throws IOException {
		File file = new File(
				"C:\\\\Shubham Srivastava\\\\WorkSpace\\\\WordCountTest.txt");

		assertEquals("Number of vowels = 53\nNumber of consonants = 85", VowelsandConsonants.findVowelAndConsonant(file));
	}

}
