package decorator;

public class PizzaChicken extends DecoratorPizza {

	public PizzaChicken(IPizza pizzza) {
		super(pizzza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getIngredient() {
		// TODO Auto-generated method stub
		return super.getIngredient() + ", chicken";
	}
	//sa

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 10;
	}
	
	
	

}