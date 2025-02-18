package com.aurionpro.facade.test;

import com.aurionpro.facade.model.HotelReception;

public class HotelTest {
	public static void main(String[] args) {
		HotelReception menu = new HotelReception();
		
		menu.displayIndianMenu();
		menu.displayItalianMenu();
	}
}