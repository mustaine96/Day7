package com.capgemini.Day7.Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Day7.ValidDate;

class ValidDateTest {

	@Test
	void test() throws Exception {

		assertEquals("04/06/1997", ValidDate.validate("02/06/1997",2));
	}


}
