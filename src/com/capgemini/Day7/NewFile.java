package com.capgemini.Day7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class NewFile {
	public static void main(String[] args)   {

		File file = new File("C:\\filesfortest\\test.txt");
//		if (file.createNewFile())
//		{
//		    System.out.println("File is created!");
//		} else {
//		    System.out.println("File already exists.");
//		}
//		FileWriter writer = new FileWriter(file);
		
		try(PrintWriter print = new PrintWriter(file)) {
						Random rand = new Random();
			for (int i = 0; i < 100; i++) {

				print.println(rand.nextInt(50) + 1);
				System.out.println(i);
			}
		}
		// writer.write(rand.nextInt(50) + 1);
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	// writer.close();
}
