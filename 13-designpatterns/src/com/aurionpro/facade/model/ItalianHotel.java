package com.aurionpro.facade.model;

public class ItalianHotel implements IHotel{

	@Override
	public IMenu getMenu() {
		// TODO Auto-generated method stub
		return new ItalianMenu();
	}

}
