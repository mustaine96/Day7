package com.capgemini.Day7.Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Day7.MultipleOperations;


class MultipleOperationsTest {

	@Test
	void testReverse() {
		MultipleOperations.reverse("C:\\filesfortest\\asd.txt", "C:\\filesfortest\\laptop.txt");
		/// home/sudarshan/Capgemini/vowelcount.txt
		MultipleOperations.convert("C:\\cspro\\FileOperation\\reverse.txt", "C:\\cspro\\FileOperation\\convertOutput.txt");
		//FileOperation.convert("/home/sudarshan/Capgemini/operation.txt", "/home/sudarshan/Capgemini/copyoperation.txt");
		MultipleOperations.compare("C:\\cspro\\FileOperation\\reverse.txt", "C:\\cspro\\FileOperation\\compare.txt");

	}

}