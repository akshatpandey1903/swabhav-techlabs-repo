package facade.model;

public class GoldenHat extends HatDecorator{

	public GoldenHat(IHat hat) {
		super(hat);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName() + "-" + "golden";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 500 + super.getPrice();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Name: " + getName() + "  Price: " + getPrice();
	}

}
