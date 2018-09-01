package com.capgemini.Day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCounter {
	
	public static int counter(String args) throws IOException {
		
		String addr=args;
		BufferedReader reader = new BufferedReader(new FileReader(addr));
		int lines = 0;
		while (reader.readLine() != null) lines++;
		System.out.println(lines);
		
		return lines;
	}

}
