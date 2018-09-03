package com.capgemini.Day7.Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.sql.Date;
import java.time.LocalDate;
import java.util.LinkedHashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.Day7.HomeworkAssignments;

class HomeworkAssignmentTest {
	
	//HomeworkAssignments obj1;
	LinkedHashMap <File,Date>obj1=new LinkedHashMap<>();
	
	@BeforeEach
	public void setUp() {
			obj1.put(new File("C:\\filesfortest\\Laptop.java"), LocalDate.of(2018,10,02));}
	

	@Test
	void testAddNewAssignment() {
		
		//fail("Not yet implemented");
	}

}
