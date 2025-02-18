package facade.model;

public class RibbonedHat extends HatDecorator{

	public RibbonedHat(IHat hat) {
		super(hat);
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName() + "-" + "ribboned";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 250 + super.getPrice();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Name: " + getName() + "  Price: " + getPrice();
	}

}
