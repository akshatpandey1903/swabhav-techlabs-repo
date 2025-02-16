package com.aurionpro;

import java.io.*;

public class FileCreation {
	public static void main(String[] args){
		File file = new File("C:\\Users\\Akshat.Pandey\\Desktop\\akJava\\04-FileOperations\\text.txt");
		
//		try {
//			if(file.createNewFile()){
//				System.out.println("File has been created");
//			} else {
//				System.out.println("File exists");
//			}
//		} catch(IOException e){
//			e.printStackTrace();
//		}
		
		if(file.exists()){
			System.out.println("File is readable: " + file.canRead());
			System.out.println("File can be written to: " + file.canWrite());
			System.out.println("File name: " + file.getName());
			System.out.println("File path: " + file.getAbsolutePath());
		} else {
			System.out.println("The file does not exist");
		}
	}
}
