package com.aurionpro;

import java.io.*;

public class FileReading {
	public static void main(String[] args) {
		try{
			FileReader file = new FileReader("C:\\Users\\Akshat.Pandey\\Desktop\\akJava\\04-FileOperations\\text.txt");
			try{
				int i;
				while((i = file.read()) != -1){
					System.out.print((char)i);
				}
			} finally {
				file.close();
			}
		} catch (IOException e){
			System.out.println("Error Detected :");
			e.printStackTrace();
		} 
		
	}
}
