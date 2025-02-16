package com.aurionpro;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
	public static void main(String[] args) {
		File file1 = new File("C:\\Users\\Akshat.Pandey\\Desktop\\akJava\\04-FileOperations\\text.txt");
		try{
			FileWriter file = new FileWriter("C:\\Users\\Akshat.Pandey\\Desktop\\akJava\\04-FileOperations\\text.txt");
			file.write("Hello. I'm Akshat");
			file.close();
			Scanner reader = new Scanner(file1);
			String data = reader.nextLine();
			System.out.println(data);
			reader.close();
			
		} catch (IOException e){
			System.out.println("Error detected");
			e.printStackTrace();
		}
	}
}
