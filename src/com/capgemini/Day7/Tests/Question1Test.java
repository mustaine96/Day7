package com.capgemini.Day7.Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class Question1Test {

	@Test
	void testExistenceOfFile() {
		File file = new File("‪‪C:\\filesfortest\\day7_assignements.docx");//change file path
		assertEquals(true, file.exists());
		assertEquals(true, file.isFile());
	}
}
