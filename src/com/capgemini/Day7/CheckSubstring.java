package com.capgemini.Day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckSubstring {
	public static void main(String args[])throws IOException{
		BufferedReader io=new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter path");
		//String addr=io.readLine();
		System.out.println("Enter the string");
		String string=io.readLine();
		int flag=0;
		String s=null;
		BufferedReader reader = new BufferedReader(new FileReader("C:\\filesfortest\\Laptop.java"));
		int lines=0;
		while((s=reader.readLine())!=null) {
			lines++;
			if(s.contains(string)) {
				System.out.print(lines);
				System.out.println(s);
				flag=lines;
			}
		
		}
		if(flag==0)
			System.out.println("String not found");
	}

}
