package com.aurionpro.test;

import com.aurionpro.exceptions.AgeNotValidException;
import com.aurionpro.model.Voter;

public class VoterTest {
	
	public static void main(String[] args) {
		
		Voter voter1 = null;
		try{
			voter1 = new Voter("Akshat", "211002", 16);
			
		} catch(AgeNotValidException e){
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println(voter1);
	}
}
