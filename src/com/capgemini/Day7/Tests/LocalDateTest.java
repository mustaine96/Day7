package com.capgemini.Day7.Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class LocalDateTest {

	
	@Test
	void testCheckIfMagicDate() {
		MagicDate date1=new MagicDate() ;
		assertEquals("magic",date1.checkIfMagicDate(LocalDate.of(30,6,5))) ;
	}

}
