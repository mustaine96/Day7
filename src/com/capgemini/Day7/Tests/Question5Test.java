package com.capgemini.Day7.Tests;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.Day7.MyDate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Question5Test {

	@Test
	void testMydate() throws IOException, ClassNotFoundException {
		MyDate d1=new MyDate() ;
		MyDate d2=new MyDate() ;
		MyDate d3=new MyDate() ;
		MyDate d4=new MyDate() ;
		MyDate d5=new MyDate() ;
		
		ArrayList<MyDate> array= new ArrayList<>() ;
		array.add(d1) ;
		array.add(d2) ;
		array.add(d3) ;
		array.add(d4) ;
		array.add(d5) ;
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\neagrawa\\Desktop\\objects.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(array);
		
		FileInputStream fis = new FileInputStream("C:\\Users\\neagrawa\\Desktop\\objects.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<MyDate> array1 = (ArrayList<MyDate>) ois.readObject();
		ois.close();
		assertEquals(1,array1.get(0).a);
		assertEquals("neeraj",array1.get(2).name);
		
	}

}
