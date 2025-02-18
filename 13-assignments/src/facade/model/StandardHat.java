package facade.model;

public class StandardHat implements IHat{
	
	private String name = "StHat";
	private double price = 500;
	
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
