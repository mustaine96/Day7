package com.capgemini.Day7.Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Day7.TodayDate;

class TodayDateTest {

	@Test
	void testformat() {

		assertEquals("SATURDAY,SEPTEMBER 1,2018", TodayDate.format());
	}


}
