package com.capgemini.Day7;

import java.io.*;

public class FindPattern {
	
	public static String findString(File file, String word) throws FileNotFoundException, IOException {
		int lineCount=0;
		String lines=null;
		int flag=0;
		try (BufferedReader reader = new BufferedReader( new FileReader(file))) {
			String s=null;
			while ((s = reader.readLine()) != null) {
				lineCount++;
				if(s.contains(word)) 
				{
					lines = "Line number " + lineCount +" : " + s;
					lines = lines + "\n"; 
					flag = 1;
				}
			}
			if(flag == 1)
				return lines;
			else
				return "String not found";
	}
	}


}
