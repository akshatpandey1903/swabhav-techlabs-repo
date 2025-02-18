package facade.model;

public class PremiumHat implements IHat{
	
	private String name = "PrHat";
	private double price = 1000;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Name: " + getName() + "  Price: " + getPrice();
	}
}
