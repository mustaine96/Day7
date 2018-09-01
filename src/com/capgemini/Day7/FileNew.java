package com.capgemini.Day7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileNew {
	public static void main() throws IOException  {
		
		File file= new File("C:\\filesfortest\\test.txt");
		if (file.createNewFile())
		{
		    System.out.println("File is created!");
		} else {
		    System.out.println("File already exists.");
		}
		FileWriter writer = new FileWriter(file);
		Random rand =new Random();
		for(int i=0;i<100;i++)
		{
			
			writer.write(rand.nextInt(50) + 1);
			
		}
		//writer.close();
	}

}
