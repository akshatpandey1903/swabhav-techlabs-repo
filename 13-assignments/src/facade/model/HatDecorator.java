package facade.model;

public abstract class HatDecorator implements IHat{
	
	IHat hat;
	
	public HatDecorator(IHat hat) {
		this.hat = hat;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return hat.getName();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return hat.getPrice();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Name: " + getName() + "  Price:" + getPrice();
	}
	
}
