package com.aurionpro.facade.model;

public class HotelReception {
	
	public void displayIndianMenu() {
		IHotel indianHotel = new IndianHotel();
		IMenu menu = indianHotel.getMenu();
		menu.dispayMenu();
	}
	
	public void displayItalianMenu() {
		IHotel italianHotel = new ItalianHotel();
		IMenu menu = italianHotel.getMenu();
		menu.dispayMenu();
	}
}	
