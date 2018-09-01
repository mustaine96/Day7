package com.capgemini.Day7.Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.Day7.BinaryInteger;

class BinaryIntegerTest {

	@Test
	void testBinaryInteger() {
		File file = new File("C:\\Shubham Srivastava\\WorkSpace\\CreateData.dat");
		assertEquals(1,BinaryInteger.writeBinary(file));
	}


}
