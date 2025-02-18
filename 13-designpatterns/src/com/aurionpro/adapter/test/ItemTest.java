package com.aurionpro.adapter.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.adapter.model.Biscuit;
import com.aurionpro.adapter.model.Chocolate;
import com.aurionpro.adapter.model.HatAdapter;
import com.aurionpro.adapter.model.IItem;

public class ItemTest {
	public static void main(String[] args) {
		List<IItem> items = new ArrayList<>();
		
		items.add(new Biscuit("ParleG", 100.0));
		items.add(new Chocolate("DairyMilk", 200.0));
		items.add(new HatAdapter("h-hat", "hunter-hat", 500.0, 2.5));
		

		System.out.println("Items:");
		items.stream()
				.forEach((item)-> {
					double price = item.displayFinalPrice();
					String name = item.displayName();
					System.out.println(name + ": " + price);
				});
		
		double finalPrice = items.stream()
				.mapToDouble((item) -> item.displayFinalPrice())
                .sum();
		System.out.println("Final price: " + finalPrice);
	}
}
